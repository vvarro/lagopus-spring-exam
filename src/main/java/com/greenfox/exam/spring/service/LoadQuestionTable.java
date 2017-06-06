package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadQuestionTable implements ApplicationRunner {

  @Autowired
  QuestionRepository questionRepository;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    questionRepository.save(new Question("When did your course start? (yyyy.mm.dd)", "2017.03.13"));
    questionRepository.save(new Question("What type of dog Barbi has?", "Whippet"));
    questionRepository.save(new Question("What is HerrNorbert's favourite color?", "Green"));
    questionRepository.save(
        new Question("How many classes are learning at Green Fox Academy at this moment?", "4"));
    questionRepository
        .save(new Question("How many mentors teach at Green Fox at this moment?", "16"));
    questionRepository
        .save(new Question("What was the name of the first Green Fox class?", "Vulpes"));
    questionRepository.save(new Question("How many likes do we have on facebook?", "~3300"));
    questionRepository.save(new Question("What is Tojas's horoscope?", "Libra"));
  }
}
