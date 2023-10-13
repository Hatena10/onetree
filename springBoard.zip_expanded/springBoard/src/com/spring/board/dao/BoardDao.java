package com.spring.board.dao;

import java.util.List;

import com.spring.board.vo.BoardVo;
import com.spring.board.vo.PageVo;

public interface BoardDao {

	public String selectTest() throws Exception;

	public List<BoardVo> selectBoardList(PageVo pageVo) throws Exception; //조회

	public BoardVo selectBoard(BoardVo boardVo) throws Exception; //상세보기

	public int selectBoardCnt() throws Exception;
	
	public int boardInsert(BoardVo boardVo) throws Exception;//게시물 등록
	
	//게시물 수정
	public int boardModify(BoardVo boardVo);
	
	public int boardDelete(int boardNum);
}
