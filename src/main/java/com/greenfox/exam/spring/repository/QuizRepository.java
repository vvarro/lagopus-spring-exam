package com.greenfox.exam.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository implements CrudRepository<Question, Long> { {

}
