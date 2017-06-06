package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class Questions {

  long id;
  List<Question> questions;

  public Questions() {
    this.id = 1;
    this.questions = new ArrayList<>();
  }

  public Questions(List<Question> questions) {
    this.id = 1;
    this.questions = questions;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Iterable<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }
}
