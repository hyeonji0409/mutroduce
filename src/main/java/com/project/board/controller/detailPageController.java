package com.project.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.board.model.ActorCastVO;
import com.project.board.model.MusicalVO;
import com.project.board.service.MusicalService;


@Controller
public class detailPageController {
	@Autowired
	private MusicalService service;
	
	/*
	 * @RequestMapping("/favorRecommand") public String favorRecommand() { return
	 * "/layout/recommand"; }
	 */
	
	@RequestMapping("/adminPage") 
    public String adminPage() { 
    	return "/DetailView/adminPage"; 
    }
	@RequestMapping("/insertMusc") 
    public String insertMusc() { 
    	return "/DetailView/insertMusical"; 
    }
	
	// 뮤지컬 목록 페이지로 이동
	@RequestMapping("/detailView/{genreNo}")
	public String detailView(@PathVariable String genreNo, HttpSession session) {
		System.out.println(genreNo);
		
		String result = "";
		
		ArrayList<MusicalVO> vo = service.getMusicalListByGenre(genreNo);
		
		
		System.out.println(vo);

		
		if(vo != null) {
			session.setAttribute("musicalData", vo);
			
			result = "/DetailView/detailPage";
		}
		
		return result;
	}
	
	// 뮤지컬 상세정보 페이지 이동.
	@RequestMapping("/testDetail/{muscNo}")
	public String testDetail(@PathVariable String muscNo, HttpSession session) {
		System.out.println(muscNo);
		
		String result = "";
		
		MusicalVO vo = service.getMusical(muscNo);
		ArrayList<ActorCastVO> vo2 = service.getActorCast(muscNo);
		
		//System.out.println(vo2.toString());
		
		if(vo != null && vo2 != null) {
			session.setAttribute("musicalData", vo);
			session.setAttribute("actorcastData", vo2);
			
			result = "/DetailView/test";
		}
		
		
		return result;
	}
	
	@RequestMapping("/doInsertMusc")
	public String doInsertMusc(MusicalVO MusicalVO, HttpSession session) {
		System.out.println(MusicalVO);
		
		String result = "/insertMusc";
		
		int insertFlag = service.insertMusical(MusicalVO);
		
		System.out.println(insertFlag);
		
		if( insertFlag == 1 )  {
			
			result = "redirect:/adminPage";
		}
		
		
		return result;
	}
	
	
	
	/*
	 * 
	 *  
	 * 1) 컨트롤러
	 * 2) 서비스 추가 - 인터페이스, 클래스 
	 * 3) DAO 
	 * 4) 맵퍼
	 * 5) VO
	 * 
	 */
}
