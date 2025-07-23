package com.smhrd.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.board.entity.BoardEntity;
import com.smhrd.board.service.BoardService;

@Controller
public class MainController {
	
	@Autowired
	BoardService boardService;

	// 메인페이지 띄우기 기능
	// 1. 매핑할 메소드 만들기  --> boot에선 REST API Get/Post/Delete/fetch 명시를 희망
	@GetMapping("/")
	public String index(Model model) {
		// legacy 에서 return 타입을 String 으로 잡았는데 
		// --> viewResolver 가 WEB/INF - views 폴더의 .jsp를 실행하겠습니다.
		
		// 내장되어있는 설정이
		// resources - templates 폴더의 .html 을 실행하겠습니다.
		// 결론 : boot 에선 index.html 을 실행 시키겠습니다.
		
		// 게시글 모두 출력 후 index 페이지로 전달
		List<BoardEntity> list = boardService.show();
		
		// Spring 에서 request Scope 대신 사용  -> Model 객체 사용
		model.addAttribute("boardList",list);
		
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
}
