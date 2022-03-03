package com.project.board.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Service;


import com.project.board.model.MusicalByGenreVO;

import com.project.board.model.HallVO;

import com.project.board.model.TicketbookVO;

@Service
public interface ITicketbookService {
	ArrayList<TicketbookVO> listAllTicketbook(String memID);

	

	public ArrayList<TicketbookVO> listAllTicketbook();

	/**회원이 선택한 장르에 해당하는 뮤지컬 데이터 조회*/
	public ArrayList<MusicalByGenreVO> getMusicalByGenre(String memId);
	/*
	 * Map<String, String> getMusicalByGenre(String memId);
	 */

	ArrayList<TicketbookVO> listTicketByID(String memID);
	void insertticket(TicketbookVO ticketbookVo);

	void updateticket(TicketbookVO ticketbookVo);
	TicketbookVO listTicketByNO(String no);
	void deleteticket(TicketbookVO ticketbookVo);

	}



