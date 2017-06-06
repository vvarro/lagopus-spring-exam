package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
