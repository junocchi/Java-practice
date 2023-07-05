package com.ju.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
