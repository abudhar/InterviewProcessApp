package com.interviewprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewprocess.entity.CandidateResponse;

public interface CandidateResponseRepository extends JpaRepository<CandidateResponse, Long> {
}
