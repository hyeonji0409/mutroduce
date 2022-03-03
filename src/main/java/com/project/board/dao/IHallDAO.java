package com.project.board.dao;

import java.util.ArrayList;

import com.project.board.model.HallVO;

public interface IHallDAO {
	ArrayList<HallVO> listAllHall();   		// ** 전체 공연장 조회 인터페이스 코드 작성 
	HallVO detailViewhall(String no);
	ArrayList<HallVO> listHallByArea(String area);
	void inserthall(HallVO hallVo);
	void updatehall(HallVO hallVo);
	void deletehall(HallVO hallVo);

}
