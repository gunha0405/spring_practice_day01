package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.answer.AnswerRepository;
import com.example.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class SpringPracticeApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Test
	// DB 세션 유지를 위한 트랜잭션 어노테이션
	@Transactional
	void testJpa() {
		/*
		
		//데이터를 생성하는 JPA 메서드
		Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);
        
        // 모든 데이터를 조회하는 JPA 메서드
        List<Question> all = this.questionRepository.findAll();
        assertEquals(6, all.size());

        Question q = all.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
        
        // 고유값인 id 값을 이용해 조회하는 메서드
        Optional<Question> oq = this.questionRepository.findById(1);
        if(oq.isPresent()) {
            Question q = oq.get();
            assertEquals("sbb가 무엇인가요?", q.getSubject());
        }
        
        // question 테이블의 subject를 이용해 데이터를 조회하는 메서드
        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
        
        // question 테이블의 subject와 content를 and 연산자로 묶어 조회하는 메서드
        Question q = this.questionRepository.findBySubjectAndContent(
                "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
        assertEquals(1, q.getId());
        
        // Question 테이블에서 subject를 Like 연산자를 사용해 조회하는 메서드
        List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
        Question q = qList.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
        
        // Question 테이블에서 객체를 id로 조회한 데이터가 실제로 존재한다면 제목을 수정하는 메서드
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        q.setSubject("수정된 제목");
        this.questionRepository.save(q);
        
        // Question 테이블에서 객체를 id로 조회, id가 1번인 데이터가 존재한다면 삭제하는 메서드
        assertEquals(6, this.questionRepository.count());
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        this.questionRepository.delete(q);
        assertEquals(1, this.questionRepository.count());
        
        // Answer 데이터를 생성 전, Answer 데이터가 필요한 Question 객체를 조회 후, Answer 데이터를 생성하는 메서드
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q);  
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);
        
        // Answer 데이터를 id를 통해 조회 후, answer 데이터와 연결된 question 객체의 id 값이 1인지 확인하는 메서드
        Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals(2, a.getQuestion().getId());
        
        // question 데이터를 id를 통해 조회 후, 연결된 answer 데이터의 내용을 확인하는 메서드
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
        */
		
		
		
	}

}
