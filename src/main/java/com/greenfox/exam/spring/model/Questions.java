package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Table(name = "quiz")
@Entity
@Component
public class Questions {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  List<Question> questions;

  public Questions() {
    this.questions = new ArrayList<>();
  }

  public Questions(List<Question> questions) {
    this.questions = questions;
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

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }
}
