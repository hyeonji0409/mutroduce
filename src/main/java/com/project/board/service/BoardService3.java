package com.project.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.IBoardDAO3;
import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;


@Service
public class BoardService3 implements IBoardService3{
	
    @Autowired
    @Qualifier("IBoardDAO3")
    IBoardDAO3 dao;
	
    
    @Override
    public List<BoardVO> getBoard3(){
        return dao.getBoard3();
    }
    @Override
    public boolean addBoard3(BoardVO b) {
        return dao.addBoard3(b);
    }
    @Override
    public BoardVO getBoardOne3(int idx) {
        return dao.getBoardOne3(idx);
    }
    @Override
    public boolean addReply3(ReplyVO r) {
        return dao.addReply3(r);
    }
    @Override
    public List<ReplyVO> getReply3(int boardIdx) {
        return dao.getReply3(boardIdx);
    }
    @Override
    public int updatereviewcnt3(int idx) {
		return dao.updatereviewcnt3(idx);
	}
    
    @Override
    public int count3() throws Exception {
     return dao.count3();
    }
    
    @Override
	public void deleteBoard3(String boardVo) {
		// TODO Auto-generated method stub
		dao.deleteBoard3(boardVo);
	}
    
    @Override
	public void deleteReply3(String replyVo) {
		// TODO Auto-generated method stub
		dao.deleteReply3(replyVo);
	}
    
    @Override
	public void updateBoard3(BoardVO b) {
		dao.updateBoard3(b);
		
	}
	
    @Override
	public BoardVO detailViewBoard3(int idx) {
		return dao.detailViewBoard3(idx);
	}
    
	/*
	 * @Override public int getBoardListCnt() throws Exception {
	 * 
	 * return dao.getBoardListCnt();
	 * 
	 * }
	 */

}