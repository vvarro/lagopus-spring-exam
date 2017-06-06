package com.greenfox.exam.spring.model;

import static com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Getter
@Setter
@Component
@Table(name = "questions")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonSerialize(include= NON_NULL)
  long id;
  String question;
  @JsonSerialize(include= NON_NULL)
  String answer;

  public Question() {
  }

  public Question(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }
}
