package com.project.board.dao;

import java.util.List;

import com.project.board.model.BoardVO;

import com.project.board.model.ReplyVO;


public interface IBoardDAO3 {
    public boolean addBoard3(BoardVO b);
    public List<BoardVO> getBoard3();
    public BoardVO getBoardOne3(int idx);
    public boolean addReply3(ReplyVO r);
    public List<ReplyVO> getReply3(int boardIdx);
    public int updatereviewcnt3(int idx);
    public int count3() throws Exception;
    void deleteBoard3(String boardVo);
    void deleteReply3(String replyVo);
    void updateBoard3(BoardVO b);
    BoardVO detailViewBoard3(int idx);
    //public int getBoardListCnt();
    
}
	