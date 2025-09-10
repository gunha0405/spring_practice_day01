package com.example.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

// prefix URL 설정
@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {
	
	private final QuestionService questionService;
	
	// Question 테이블의 모든 데이터를 조회해 thymeleaf에 셋팅 하는 메서드
	@GetMapping("/list")
	public String list(Model model) {
		List<Question> questionList = questionService.getList();
		model.addAttribute(questionList);
		return "question_list";
	}
	
	// URL을 통해, id 값을 받아와 게시글 하나의 정보를 가져와 보여주는 메서드
	@GetMapping("/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Question question = questionService.getQuestion(id);
		model.addAttribute(question);
		return "question_detail";
	}
	
	
}
