package com.codingdojo.eventsbeltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.eventsbeltreviewer.models.Event;

@Repository
public interface EventRepo extends CrudRepository <Event, Long> {

}