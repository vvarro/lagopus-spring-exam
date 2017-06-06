package com.greenfox.exam.spring.model;

public class Questions {
  int id;
  Iterable<Question> questions;

  public Questions() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Iterable<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(Iterable<Question> questions) {
    this.questions = questions;
  }
}
