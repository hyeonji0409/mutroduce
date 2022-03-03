package com.project.board.service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;



public interface IBoardService4 {
	 boolean addBoard4(BoardVO b);
	 List<BoardVO> getBoard4();
	 BoardVO getBoardOne4(int idx);
	 boolean addReply4(ReplyVO r);
	 List<ReplyVO> getReply4(int boardIdx);
	 int updatereviewcnt4(int idx);
	 int count4() throws Exception;
	 void deleteBoard4(String boardVO);
	 void updateBoard4(BoardVO b);
	 BoardVO detailViewBoard4(int Idx);
	 void deleteReply4(String replyVo);
	 
	 //public int getBoardListCnt() throws Exception;

}
