package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Questions;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.repository.QuizRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestContoller {

  @Autowired
  QuizRepository quizRepository;
  @Autowired
  QuestionRepository questionRepository;

  @GetMapping("/questions")
  public Questions getQuestions() {
    Questions questions = new Questions();
    List<Question> randQuestions = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      long randId = (1 + (int) (Math.random() * (questionRepository.count() - 1)));
      if (questionRepository.exists(randId)) {
        Question question = new Question();
        question.setId(i + 1);
        question.setQuestion(questionRepository.findOne(randId).getQuestion());
        question.setAnswer(null);
        randQuestions.add(question);
      }
    }
    questions.setQuestions(randQuestions);
    return questions;
  }
}

