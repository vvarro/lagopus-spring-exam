package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AnswerValidator {

  @Autowired
  QuizRepository quizRepository;
  @Autowired
  QuestionRepository questionRepository;

  public AnswerValidator() {
  }

}
