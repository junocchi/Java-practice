package com.vm.dao;

import java.util.LinkedList;
import com.vm.storage.Item;

public interface ItemDataAccess {

	//opted for LinkedList because the items will be ordered and can be manipulated
	//writeRecords method records the items properties in a list
	public boolean writeRecords(LinkedList<Item> items) throws Exception;
	
	//reads the records in the list
//	public LinkedList<Item> readRecords() throws Exception;
}
