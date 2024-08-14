package com.interviewprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewprocess.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	List<Question> findBySectionAndDifficulty(String section, String difficulty);
}
