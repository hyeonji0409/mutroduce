package com.project.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.IRankDAO;
import com.project.board.model.RankVO;

@Service
public class RankService implements IRankService{
	
	@Autowired
    @Qualifier("IRankDAO")
    IRankDAO dao;
	
	@Override
    public ArrayList<RankVO> listAllRank(){
        return dao.listAllRank();
    }
}
