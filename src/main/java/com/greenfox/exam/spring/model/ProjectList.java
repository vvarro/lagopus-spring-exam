package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectList {

  Iterable<Project> projectList;

  public ProjectList() {
  }

  public Iterable<Project> getProjectList() {
    return projectList;
  }

  public void setProjectList(Iterable<Project> projectList) {
    this.projectList = projectList;
  }
}
