package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// 레포지토리 생성
// 레포지토리 -> 생성된 데이터베이스 테이블의 데이터들을 저장, 조회, 수정, 삭제 등을 도와주는 인터페이스. 레포지토리는 테이블에 접근하고, 데이터를 관리하는 메서드를 제공.
public interface QuestionRepository extends JpaRepository<Question, Integer>{
	// Question 객체의 subject로 데이터를 조회하는 메서드
	Question findBySubject(String subject);
	// Question 객체의 subject와 content 속성을 함께 조회하는 메서드
	Question findBySubjectAndContent(String subject, String content);
	// Question 객체에서 subject를 Like 연산자를 사용해 조회하는 메서드 (Like은 %를 표기하는 위치에 따라 의미가 달라진다.)
	List<Question> findBySubjectLike(String subject);
}
