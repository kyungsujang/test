package com.example.demo.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.test.domain.BoardVO;
import com.example.demo.test.mapper.BoardMapper;

@Service("com.example.demo.test.service.BoardService")
public class BoardService {
	@Resource(name="com.example.demo.test.mapper.BoardMapper")
	BoardMapper mBoardMapper;

	public List<BoardVO> boardListService() throws Exception{
       return mBoardMapper.boardList();
    }
    
    public BoardVO boardDetailService(int bno) throws Exception{
        return mBoardMapper.boardDetail(bno);
    }
    
    public int boardInsertService(BoardVO board) throws Exception{
        return mBoardMapper.boardInsert(board);
    }
    
    public int boardUpdateService(BoardVO board) throws Exception{
        return mBoardMapper.boardUpdate(board);
    }
    
    public int boardDeleteService(int bno) throws Exception{
        return mBoardMapper.boardDelete(bno);
    }
}
