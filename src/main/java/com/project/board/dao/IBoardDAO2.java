package com.project.board.dao;

import java.util.List;

import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;

public interface IBoardDAO2 {
    public boolean addBoard2(BoardVO b);
    public List<BoardVO> getBoard2();
    public BoardVO getBoardOne2(int idx);
    public boolean addReply2(ReplyVO r);
    public List<ReplyVO> getReply2(int boardIdx);
    public int updatereviewcnt2(int idx);
    public int count2() throws Exception;
    void deleteBoard2(String boardVo);
    void deleteReply2(String replyVo);
    void updateBoard2(BoardVO b);
    BoardVO detailViewBoard2(int idx);
    //public int getBoardListCnt();
    
}
	