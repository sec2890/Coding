package com.codingdojo.eventsbeltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.eventsbeltreviewer.models.UserEvent;

@Repository
public interface UserEventRepo extends CrudRepository<UserEvent, Long> {

}
