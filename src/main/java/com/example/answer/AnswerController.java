package com.example.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.question.Question;
import com.example.question.QuestionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
	private final AnswerService answerService;
	private final QuestionService questionService;
	
	@PostMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam(value="content") String content) {
		// 해당 답변이 달릴 질문 글 조회
		Question question = this.questionService.getQuestion(id);
		// 질문글이 존재한다면, 해당 질문에 대한 내용과 답변에 대한 내용을 DB에 저장
		this.answerService.create(question, content);
		return String.format("redirect:/question/detail/%s", id);
	}
	
}
