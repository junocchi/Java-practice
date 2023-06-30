package com.ju.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ju.dto.entity.Dvd;

@Repository
public interface DvdDao extends JpaRepository<Dvd, Integer> {

}