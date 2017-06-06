package com.greenfox.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
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

  @Id
  long quizId;
  int question1Id;
  int question2Id;
  int question3Id;
  int question4Id;
  int question5Id;

  public Quiz() {
  }

  public Quiz(int quizId, int question1Id, int question2Id, int question3Id, int question4Id,
      int question5Id) {
    this.quizId = quizId;
    this.question1Id = question1Id;
    this.question2Id = question2Id;
    this.question3Id = question3Id;
    this.question4Id = question4Id;
    this.question5Id = question5Id;
  }

}
