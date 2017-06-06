package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
  int id;
  String nameOfProject;

  public Project() {
  }

  public Project(int id, String nameOfProject) {
    this.id = id;
    this.nameOfProject = nameOfProject;
  }
}
