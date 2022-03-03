package com.project.board.service;

import java.util.List;

import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;


public interface IBoardService2 {
	 boolean addBoard2(BoardVO b);
	 List<BoardVO> getBoard2();
	 BoardVO getBoardOne2(int idx);
	 boolean addReply2(ReplyVO r);
	 List<ReplyVO> getReply2(int boardIdx);
	 int updatereviewcnt2(int idx);
	 int count2() throws Exception;
	 void deleteBoard2(String boardVO);
	 void updateBoard2(BoardVO b);
	 BoardVO detailViewBoard2(int Idx);
	 void deleteReply2(String replyVo);
	 
	 //public int getBoardListCnt() throws Exception;

}
