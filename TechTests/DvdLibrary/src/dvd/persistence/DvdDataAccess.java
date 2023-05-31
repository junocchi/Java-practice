package com.dvd.persistence;

import java.util.LinkedList;
import com.dvd.dto.Dvd;

public interface DvdDataAccess {

	public boolean writeRecords(LinkedList<Dvd> dvds) throws Exception;

	public LinkedList<Dvd> readRecords() throws Exception;
}
