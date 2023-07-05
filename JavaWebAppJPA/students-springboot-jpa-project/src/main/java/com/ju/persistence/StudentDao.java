package com.ju.persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	// we only add this query because all the others are supplied automatically (searching for the primary key)
	@Query("from Student where classNo=:c")
	List<Student> getStudentsByClass(@Param("c") int classNo);

}
