package com.project.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.IBoardDAO2;
import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;

@Service
public class BoardService2 implements IBoardService2{
	
    @Autowired
    @Qualifier("IBoardDAO2")
    IBoardDAO2 dao;
	
    
    @Override
    public List<BoardVO> getBoard2(){
        return dao.getBoard2();
    }
    @Override
    public boolean addBoard2(BoardVO b) {
        return dao.addBoard2(b);
    }
    @Override
    public BoardVO getBoardOne2(int idx) {
        return dao.getBoardOne2(idx);
    }
    @Override
    public boolean addReply2(ReplyVO r) {
        return dao.addReply2(r);
    }
    @Override
    public List<ReplyVO> getReply2(int boardIdx) {
        return dao.getReply2(boardIdx);
    }
    @Override
    public int updatereviewcnt2(int idx) {
		return dao.updatereviewcnt2(idx);
	}
    
    @Override
    public int count2() throws Exception {
     return dao.count2();
    }
    
    @Override
	public void deleteBoard2(String boardVo) {
		// TODO Auto-generated method stub
		dao.deleteBoard2(boardVo);
	}
    
    @Override
	public void deleteReply2(String replyVo) {
		// TODO Auto-generated method stub
		dao.deleteReply2(replyVo);
	}
    
    @Override
	public void updateBoard2(BoardVO b) {
		dao.updateBoard2(b);
		
	}
	
    @Override
	public BoardVO detailViewBoard2(int idx) {
		return dao.detailViewBoard2(idx);
	}
    
	/*
	 * @Override public int getBoardListCnt() throws Exception {
	 * 
	 * return dao.getBoardListCnt();
	 * 
	 * }
	 */

}