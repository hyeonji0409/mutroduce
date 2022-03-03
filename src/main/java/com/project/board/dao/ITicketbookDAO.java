package com.project.board.dao;

import java.util.ArrayList;
import java.util.Map;

import com.project.board.model.HallVO;
import com.project.board.model.MusicalByGenreVO;
import com.project.board.model.TicketbookVO;

public interface ITicketbookDAO {

	public ArrayList<TicketbookVO> listAllTicketbook();   		// ** 전체 공연장 조회 인터페이스 코드 작성 

	public ArrayList<MusicalByGenreVO> getMusicalByGenre(String memId);

	/**회원이 선택한 장르에 해당하는 뮤지컬 데이터 조회*/
	/*
	 * Map<String, String> getMusicalByGenre();
	 */
	


	ArrayList<TicketbookVO> listTicketByID(String memID);
	void insertticket(TicketbookVO ticketbookVo);

	void updateticket(TicketbookVO ticketbookVo);
	TicketbookVO listTicketByNO(String no);
	void deleteticket(TicketbookVO ticketbookVo);
	
}
