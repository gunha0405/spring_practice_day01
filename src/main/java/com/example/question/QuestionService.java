package com.example.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
	
	private final QuestionRepository questionRepository;
	
	public List<Question> getList() {
		return this.questionRepository.findAll();
	}

	public Question getQuestion(Integer id) {
		// 매개변수로 받은 id를 통해 질문 게시글 검색
		Optional<Question> question = questionRepository.findById(id);
		if(question.isPresent()) {
			// 질문 존재시 question 객체 리턴
			return question.get();
		} else {
			// 질문이 존재하지 않을 시 예외처리
			throw new DataNotFoundException("question not found");
		}

	}
	
}
