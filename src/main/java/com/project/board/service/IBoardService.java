package com.project.board.service;

import java.util.List;

import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;


public interface IBoardService {
	 boolean addBoard(BoardVO b);
	 List<BoardVO> getBoard();
	 BoardVO getBoardOne(int idx);
	 boolean addReply(ReplyVO r);
	 List<ReplyVO> getReply(int boardIdx);
	 int updatereviewcnt(int idx);
	 int count() throws Exception;
	 void deleteBoard(String boardVO);
	 void updateBoard(BoardVO b);
	 BoardVO detailViewBoard(int Idx);
	 void deleteReply(String replyVo);
	 
	 //public int getBoardListCnt() throws Exception;
	
}
