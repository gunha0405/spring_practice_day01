package com.example.answer;

import java.time.LocalDateTime;

import com.example.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
	// 답변의 고유 번호
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// 답변의 내용
	@Column(columnDefinition = "CLOB")
	private String content;
	
	// 답변 생성 시간
	private LocalDateTime createDate;
	
	// 답변이 달린 질문 객체
	@ManyToOne
	private Question question;
}
