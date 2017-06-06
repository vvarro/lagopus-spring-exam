package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import java.util.List;

public class Answers {

  int id;
  List<Answer> answers;

  public Answers() {
    this.answers = new ArrayList<>();
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Answer getAnswer(int id) {
    return answers.get(id);
  }
}
