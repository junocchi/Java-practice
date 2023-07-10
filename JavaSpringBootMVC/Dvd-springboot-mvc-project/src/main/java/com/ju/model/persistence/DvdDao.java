package com.ju.model.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Dvd;

@Transactional
@Repository
public interface DvdDao extends JpaRepository<Dvd, Integer> {

//	@Modifying
//	@Query("update Dvd set dvdUserRating=newDvdUserRating where dvdId=:id" )
//	int updateUserRatingByDvdId(@Param("id") int dvdId,@Param("inc"));
//	@Query("update Employee set empSalary=empSalary+:inc where empId=:id" )
//	int updateSalaryByEmpId(@Param("id") int empId,@Param("inc") double increment);
	
	@Modifying
	@Query(value = "insert into dvd values(?,?,?,?,?,?)",nativeQuery = true)
	int insertDvd(int dvdId,String title,int mpaaRating,String directorName,String studio,int userRating);
	
	@Modifying
	//SQL : select * from Dvd where title = ?
	@Query("from Dvd where title=:tit")
	List<Dvd> findDvdByTitle(@Param("tit") String title);
}
