package com.example;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 엔티티 생성
// 엔티티 -> DB 테이블과 매핑되는 자바의 클래스
@Entity
public class Question {
	// 질문의 고유 번호
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// 질문의 제목
	@Column(length = 200)
	private String subject;
	
	// 질문의 내용
	@Column(columnDefinition = "CLOB")
	private String content;
	
	// 질문의 작성일
	private LocalDateTime createDate;
	
	// 질문에 달린 답변 리스트
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
}
