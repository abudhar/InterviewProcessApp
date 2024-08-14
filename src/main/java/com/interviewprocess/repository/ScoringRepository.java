package com.interviewprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewprocess.entity.Scoring;

public interface ScoringRepository extends JpaRepository<Scoring, Long> {

}
