package com.fo.dataaccess;

import java.util.LinkedList;

public interface FoDataAccess {

	public <E>LinkedList<E> readObjects(String FileName) throws Exception;

}