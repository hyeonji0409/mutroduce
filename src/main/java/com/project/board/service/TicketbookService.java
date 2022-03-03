package com.project.board.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.ITicketbookDAO;

import com.project.board.model.MusicalByGenreVO;

import com.project.board.model.HallVO;

import com.project.board.model.TicketbookVO;

@Service
public class TicketbookService implements ITicketbookService {
	
	@Autowired
	@Qualifier("ITicketbookDAO")
	ITicketbookDAO dao;
	

	@Override
	public ArrayList<TicketbookVO> listAllTicketbook(String memID) {// ** 전체 상품 조회 코드 작성 
		return dao.listAllTicketbook();
	
	}
		// TODO Auto-generated method stub
	public ArrayList<TicketbookVO> listAllTicketbook() {		// ** 전체 상품 조회 코드 작성 
		return dao.listAllTicketbook();
	}
	@Override
	public ArrayList<TicketbookVO> listTicketByID(String memID) {
		// TODO Auto-generated method stub
		return dao.listTicketByID(memID);
	}

	@Override
	public void insertticket(TicketbookVO ticketbookVo) {
		// TODO Auto-generated method stub
		dao.insertticket(ticketbookVo);
	}
	@Override
	public void updateticket(TicketbookVO ticketbookVo) {
		// TODO Auto-generated method stub
		dao.updateticket(ticketbookVo);
	}
	@Override
	public TicketbookVO listTicketByNO(String no) {
		// TODO Auto-generated method stub
		return dao.listTicketByNO(no);
	}
	@Override
	public void deleteticket(TicketbookVO ticketbookVo) {
		// TODO Auto-generated method stub
		dao.deleteticket(ticketbookVo);
	}

	@Override
	public ArrayList<MusicalByGenreVO> getMusicalByGenre(String memId) {
		return dao.getMusicalByGenre(memId);
	}

	
	/**회원이 선택한 장르에 해당하는 뮤지컬 데이터 조회*/	
	/*
	 * public Map<String, String> getMusicalByGenre(String memId) { return
	 * dao.getMusicalByGenre(); }
	 */
	
}


