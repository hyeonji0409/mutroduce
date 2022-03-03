package com.project.board.controller;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.project.board.model.*;
import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;
import com.project.board.service.MusicalService;
import com.project.board.service.WeatherService;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Service
@Controller
public class IndexController {

    @Autowired
    MediaService service;

    @Autowired
    CalendarService calendarService;

    @Autowired
    private WeatherService weatherService;

    @Autowired
    MusicalService musicalService;

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        ArrayList<MediaVO> mediaList = service.listAllMedia();
        model.addAttribute("mediaList", mediaList);

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);

        return "index2";
    }

    @RequestMapping("/test")
    public String test(){
        return "index";
    }


    @RequestMapping("/vote")
    public String vote(Model model) {
        ArrayList<VoteVO> actorList = service.listAllActor();
        model.addAttribute("actorList", actorList);

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);

        System.out.println(actorList);
        return "vote";
    }

    @RequestMapping("/voteActor/{actorNo}")
    public String voteActor(@PathVariable String actorNo, Model model)throws Exception{
        VoteVO vo = service.detailActor(actorNo);
        model.addAttribute("vo", vo);
        System.out.println(vo);
        System.out.println(vo.getActorName());
        service.voteUp(actorNo);

        return "redirect:../vote";
    }

    @RequestMapping("/voteMusical/{muscNo}")
    public String voteMusical(@PathVariable String muscNo, Model model)throws Exception{
        MusicalVO vo = musicalService.getMusical(muscNo);
        model.addAttribute("vo", vo);
        System.out.println(vo);
        System.out.println(vo.getGenreName());
        musicalService.voteUp(muscNo);

        return "redirect:../vote";
    }


    // 캘린더 db에서 불러올 코드 필요
    // json parsing 사용. responsebody 사용해서 페이지 로드 시 바로 불러오게 할 것
    @RequestMapping(value = "/ticketPlan", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> ticketPlan() throws Exception{
        List<Map<String, Object>> list = calendarService.calenList();

        JSONObject jsonObj = new JSONObject(); // 중괄호
        JSONArray jsonArr = new JSONArray(); // 대괄호
        HashMap<String, Object> hash = new HashMap<String, Object>(); // 중괄호로 감싸서 대괄호 이름 정의


        for(int i=0; i < list.size(); i++) {
            hash.put("title", list.get(i).get("calTitle"));
            hash.put("content", list.get(i).get("calDetail"));
            hash.put("start", list.get(i).get("calStart"));
            hash.put("url", list.get(i).get("calURL"));

            jsonObj = new JSONObject(hash);
            jsonArr.add(jsonObj);
        }

        log.info("jsonArrCheck: {}", jsonArr);

        return jsonArr;
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

}
