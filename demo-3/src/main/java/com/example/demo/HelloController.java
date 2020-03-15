package com.example.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.test.mapper.BoardMapper;

@Controller
public class HelloController {
	@Resource(name="com.example.demo.test.mapper.BoardMapper")
    BoardMapper mBoardMapper;

	@RequestMapping("/aaa")
	public String Hello() throws Exception {
		
		System.out.println("11111111111111111111111"); // <<<<TEST
		System.out.println(mBoardMapper.boardCount()); // <<<<TEST
		System.out.println("11111111111111111111111"); // <<<<TEST

		return "hello";
	}	
}
