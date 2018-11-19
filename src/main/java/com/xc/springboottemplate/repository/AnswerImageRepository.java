package com.xc.springboottemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xc.springboottemplate.domain.entity.AnswerImage;

public interface AnswerImageRepository extends JpaRepository<AnswerImage, String>{
}
