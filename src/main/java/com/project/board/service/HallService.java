package com.project.board.service;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.model.HallVO;
import com.project.board.dao.IHallDAO;

@Service
public class HallService implements IHallService {
	
	@Autowired
	@Qualifier("IHallDAO")
	IHallDAO dao;
	

	@Override
	public ArrayList<HallVO> listAllHall() {		// ** 전체 상품 조회 코드 작성 
		// TODO Auto-generated method stub
		return dao.listAllHall();
	}

	@Override
	public HallVO detailViewhall(String no) {
		// TODO Auto-generated method stub
		return dao.detailViewhall(no);
	}
	@Override
	public ArrayList<HallVO> listHallByArea(String area) {
		// TODO Auto-generated method stub
		return dao.listHallByArea(area);
	}
	@Override
	public void inserthall(HallVO hallVo) {
		// TODO Auto-generated method stub
		dao.inserthall(hallVo);
	}
	@Override
	public void updatehall(HallVO hallVo) {
		// TODO Auto-generated method stub
		dao.updatehall(hallVo);
	}
	@Override
	public void deletehall(HallVO hallVo) {
		// TODO Auto-generated method stub
		dao.deletehall(hallVo);
	}
}


