package com.project.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.board.model.RankVO;
import com.project.board.service.RankService;

@Controller
public class RankController {
	
	@Autowired
    private RankService s;
	
	
	@RequestMapping("/rank")
	public String listAllRank(Model model) {
		ArrayList<RankVO> rankList = s.listAllRank();
		model.addAttribute("rankList", rankList);

		return "ranking/ranking";
	}
}
