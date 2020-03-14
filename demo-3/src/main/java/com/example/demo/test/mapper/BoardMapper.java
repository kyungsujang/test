package com.example.demo.test.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.test.domain.BoardVO;

@Repository("com.example.demo.test.mapper.BoardMapper")
public interface BoardMapper {
	public int boardCount() throws Exception;
	
	 //게시글 목록  
    public List<BoardVO> boardList() throws Exception;
    
    //게시글 상세
    public BoardVO boardDetail(int bno) throws Exception;
    
    //게시글 작성  
    public int boardInsert(BoardVO board) throws Exception;
    
    //게시글 수정  
    public int boardUpdate(BoardVO board) throws Exception;
    
    //게시글 삭제  
    public int boardDelete(int bno) throws Exception;
}
