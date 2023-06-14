package com.fo.client;

import java.time.LocalDate;

import java.util.LinkedList;
import com.fo.dataaccess.*;
import com.fo.dto.Order;
import com.fo.dto.Product;

public class MainTest {

	public static void main(String[] args) {
		FoOrderDataAccessImpl dataAccess = new FoOrderDataAccessImpl();
		LinkedList<Order> orders = new LinkedList<>();
		
		LocalDate date = LocalDate.parse("2013-12-01");
		System.out.println(date);

//		try {
////			products = dataAccess.readObjects("Orders_06012013.txt");
//			products = dataAccess.readObjects("foo");
//		} catch (Exception ex) {
//			System.out.println(ex);
//		}

	//	try {
	//		orders = dataAccess.readObjects("Orders_06012013.txt");
	//	} catch (Exception ex) {
	//		System.out.println(ex);
	//	}

//		System.out.println(orders.get(0));
	}
}
