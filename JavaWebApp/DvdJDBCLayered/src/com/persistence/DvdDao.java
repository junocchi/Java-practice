package com.persistence;

import java.util.List;
import com.entity.Dvd;

public interface DvdDao {

	int addRecord(Dvd dvd);

	List<Dvd> getAllRecords();
}