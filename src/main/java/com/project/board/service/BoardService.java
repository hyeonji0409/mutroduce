package com.project.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.IBoardDAO;
import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;


@Service
public class BoardService implements IBoardService{
	
    @Autowired
    @Qualifier("IBoardDAO")
    IBoardDAO dao;
	
    
    @Override
    public List<BoardVO> getBoard(){
        return dao.getBoard();
    }
    @Override
    public boolean addBoard(BoardVO b) {
        return dao.addBoard(b);
    }
    @Override
    public BoardVO getBoardOne(int idx) {
        return dao.getBoardOne(idx);
    }

    @Override
    public boolean addReply(ReplyVO r) {
        return dao.addReply(r);
    }


    @Override
    public List<ReplyVO> getReply(int boardIdx) {
        return dao.getReply(boardIdx);
    }

    @Override
    public int updatereviewcnt(int idx) {
		return dao.updatereviewcnt(idx);
	}
    
    @Override
    public int count() throws Exception {
     return dao.count();
    }
    
    @Override
	public void deleteBoard(String boardVo) {
		// TODO Auto-generated method stub
		dao.deleteBoard(boardVo);
	}
    
    @Override
	public void deleteReply(String replyVo) {
		// TODO Auto-generated method stub
		dao.deleteReply(replyVo);
	}
    
    @Override
	public void updateBoard(BoardVO b) {
		dao.updateBoard(b);
		
	}
	
    @Override
	public BoardVO detailViewBoard(int idx) {
		return dao.detailViewBoard(idx);
	}
    
	/*
	 * @Override public int getBoardListCnt() throws Exception {
	 * 
	 * return dao.getBoardListCnt();
	 * 
	 * }
	 */



    
}