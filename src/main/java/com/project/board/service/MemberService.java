package com.project.board.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.IMemberDAO;
import com.project.board.model.MemberVO;


@Service
public class MemberService implements IMemberService {

	@Autowired
	@Qualifier("IMemberDAO")
	IMemberDAO dao;

	@Override
	public MemberVO login(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.login(map);
	}
	
	@Override
	public String memIdCheck(String memId) {
		return dao.memIdCheck(memId);
	}
	
	@Override
	public void signUp(MemberVO vo) {
		dao.signUp(vo);
	}
}
