package com.interviewprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewprocess.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
