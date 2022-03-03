package com.project.board.service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.project.board.model.BoardVO;

import com.project.board.model.ReplyVO;




public interface IBoardService3 {
	 boolean addBoard3(BoardVO b);
	 List<BoardVO> getBoard3();
	 BoardVO getBoardOne3(int idx);
	 boolean addReply3(ReplyVO r);
	 List<ReplyVO> getReply3(int boardIdx);
	 int updatereviewcnt3(int idx);
	 int count3() throws Exception;
	 void deleteBoard3(String boardVO);
	 void updateBoard3(BoardVO b);
	 BoardVO detailViewBoard3(int Idx);
	 void deleteReply3(String replyVo);
	 
	 //public int getBoardListCnt() throws Exception;

}
