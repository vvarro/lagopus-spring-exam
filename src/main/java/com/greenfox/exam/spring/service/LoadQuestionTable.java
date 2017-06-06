package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadQuestionTable implements ApplicationRunner {

  @Autowired
  QuizRepository quizRepository;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    quizRepository.save(new Question("When did your course start? (yyyy.mm.dd)", new Answer("2017.03.13")));
    quizRepository.save(new Question("What type of dog Barbi has?", new Answer("Whippet")));
    quizRepository.save(new Question("What is HerrNorbert's favourite color?", new Answer("Green")));
    quizRepository.save(new Question("How many classes are learning at Green Fox Academy at this moment?", new Answer("4")));
    quizRepository.save(new Question("How many mentors teach at Green Fox at this moment?", new Answer("16")));
    quizRepository.save(new Question("What was the name of the first Green Fox class?", new Answer("Vulpes")));
    quizRepository.save(new Question("How many likes do we have on facebook?", new Answer("~3300")));
    quizRepository.save(new Question("What is Tojas's horoscope?", new Answer("Libra")));
  }
}
