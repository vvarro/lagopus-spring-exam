package com.greenfox.exam.spring.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer {
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String answer;

  public Answer() {
  }

  public Answer(String answer) {
    this.answer = answer;
  }
}
