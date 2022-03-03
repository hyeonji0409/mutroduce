package com.project.board.dao;

import java.util.List;

import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;

public interface IBoardDAO {
    public boolean addBoard(BoardVO b);
    public List<BoardVO> getBoard();
    public BoardVO getBoardOne(int idx);
    public boolean addReply(ReplyVO r);
    public List<ReplyVO> getReply(int boardIdx);
    public int updatereviewcnt(int idx);
    public int count() throws Exception;
    void deleteBoard(String boardVo);
    void deleteReply(String replyVo);
    void updateBoard(BoardVO b);
    BoardVO detailViewBoard(int idx);
    //public int getBoardListCnt();
    
    

  
}
	