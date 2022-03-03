package com.project.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.board.service.ChatbotService;


@RestController
public class APIRestController {

	@Autowired
	private ChatbotService chatService;	
		
		@RequestMapping("/chatbotCall")
		public String  chatbotCall(@RequestParam("message") String message ) {
			String results = chatService.main(message);
			//System.out.println("2:" + result);
			return results;
		}
}
