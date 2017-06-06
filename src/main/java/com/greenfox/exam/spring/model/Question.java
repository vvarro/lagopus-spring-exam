package com.greenfox.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "questions")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String question;
  Answer answer;

  public Question() {
  }

  public Question(String question, Answer answer) {
    this.question = question;
    this.answer = answer;
  }
}
