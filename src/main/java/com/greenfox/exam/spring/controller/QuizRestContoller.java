package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Answers;
import com.greenfox.exam.spring.model.ProjectList;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Questions;
import com.greenfox.exam.spring.model.Quiz;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.repository.QuizRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuizRestContoller {

  private static final String url = "https://springexamserver.herokuapp.com/projects/sabers";

  @Autowired
  QuizRepository quizRepository;
  @Autowired
  QuestionRepository questionRepository;

  @GetMapping("/questions")
  public Questions getQuestions() {
    Questions questions = new Questions();
    Quiz quiz = new Quiz();
    int[] ids = new int[5];
    List<Question> randQuestions = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      long randId = (1 + (int) (Math.random() * (questionRepository.count() - 1)));
      if ((questionRepository.exists(randId)) && (!randQuestions
          .contains(questionRepository.findOne(randId)))) {
        quiz.setQuizId(questions.getId());
        ids[i] = (int) questionRepository.findOne(randId).getId();
        Question question = new Question();
        question.setId(questionRepository.findOne(randId).getId());
        question.setQuestion(questionRepository.findOne(randId).getQuestion());
        question.setAnswer(null);
        randQuestions.add(question);
      }
    }
    quiz.setQuestion1Id(ids[0]);
    quiz.setQuestion2Id(ids[1]);
    quiz.setQuestion3Id(ids[2]);
    quiz.setQuestion4Id(ids[3]);
    quiz.setQuestion5Id(ids[4]);
    questions.setQuestions(randQuestions);
    quizRepository.save(quiz);
    return questions;
  }

  @PostMapping("/answer")
  public ProjectList answerQuestions(@RequestBody Answers answers) {
    RestTemplate restTemplate = new RestTemplate();
    ProjectList projectList = new ProjectList();
    projectList = restTemplate.postForObject(url, answers, ProjectList.class);
    return projectList;
  }
}

