package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Answers;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.repository.QuizRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class AnswerValidator {

  @Autowired
  QuizRepository quizRepository;
  @Autowired
  QuestionRepository questionRepository;

  public boolean AnswerValidator(Answers answers) {
    List<Answer> answerList = new ArrayList<>();
    answerList.addAll(answers.getAnswers());
    if (answerList.size() == 5) {
      for (int i = 0; i < 5; i++) {
        if (answerList.get(i).getId() == quizRepository.findOne((long) answerList.get(i).getId())
            .getQuestion1Id()) {
        }
      }

    }
    return true;
  }

}
