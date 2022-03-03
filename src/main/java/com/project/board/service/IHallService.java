package com.project.board.service;

import java.util.ArrayList;


import com.project.board.model.HallVO;

public interface IHallService {
	
	ArrayList<HallVO> listAllHall();   		// ** 전체 공연장 조회 인터페이스 코드 작성
	ArrayList<HallVO> listHallByArea(String area);
	void inserthall(HallVO hallVo);
	void updatehall(HallVO hallVo);
	void deletehall(HallVO hallVo);
	/*
	void insertHall(HallVO prdVo);			// 상품 정보 등록
	void updateHall(HallVO prdVo);			// 상품 정보 수정
	void deleteHall(String prdNo);					// 상품 정보 삭제
	HallVO detailViewHall(String prdNo);// 상세 상품 조회
	String prdNoCheck(String prdNo);
	ArrayList<HallVO> HallSearch(HashMap<String, Object> map);
	*/
	HallVO detailViewhall(String no);
}



