package com.greenfox.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Table(name = "quiz")
@Entity
@Getter
@Setter
@Component
public class Quiz {
  int quizId;
  int[] questionId;


  public Quiz() {
  }

  public Quiz(int quizId, int[] questionId) {
    this.quizId = quizId;
    this.questionId = new int[5];
  }
}
