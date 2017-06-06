package com.greenfox.exam.spring.model;

import java.util.ArrayList;

public class Answers {
  int id;
  Iterable<Answer> answers;

  public Answers() {
    this.answers = new ArrayList<>();
  }

  public Iterable<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(Iterable<Answer> answers) {
    this.answers = answers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
