package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 ssb에 오신 것을 환영합니다.";
	}
	
	// 루트 URL 호출시 질문 리스트로 리다이렉트 시켜주는 메서드 
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
