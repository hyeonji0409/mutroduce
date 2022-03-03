package com.project.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



import com.project.board.service.ChatbotService;


@Controller
public class APIController {
	
	@Autowired
	private ChatbotService chatService;
	
	// 채팅창
	@RequestMapping("/chatbot")
	public String chatbotForm2() {
		return "chatbot";
	}
	
	
}











