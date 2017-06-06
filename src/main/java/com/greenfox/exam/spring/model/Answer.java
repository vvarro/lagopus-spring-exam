package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer {
  int id;
  String answer;

  public Answer() {
  }

  public Answer(int id, String answer) {
    this.id = id;
    this.answer = answer;
  }
}
