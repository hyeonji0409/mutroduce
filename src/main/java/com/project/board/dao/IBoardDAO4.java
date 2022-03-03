package com.project.board.dao;

import java.util.List;


import com.project.board.model.BoardVO;
import com.project.board.model.ReplyVO;

public interface IBoardDAO4 {
    public boolean addBoard4(BoardVO b);
    public List<BoardVO> getBoard4();
    public BoardVO getBoardOne4(int idx);
    public boolean addReply4(ReplyVO r);
    public List<ReplyVO> getReply4(int boardIdx);
    public int updatereviewcnt4(int idx);
    public int count4() throws Exception;
    void deleteBoard4(String boardVo);
    void deleteReply4(String replyVo);
    void updateBoard4(BoardVO b);
    BoardVO detailViewBoard4(int idx);
    //public int getBoardListCnt();
    
}
	