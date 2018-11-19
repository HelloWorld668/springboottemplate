package com.xc.springboottemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xc.springboottemplate.domain.entity.AnswerText;
import com.xc.springboottemplate.domain.entity.User;

public interface AnswerTextRepository extends JpaRepository<AnswerText, Long>{
}
