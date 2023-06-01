package src.com.sujata.client;

import src.com.sujata.demo.AuthorXPredicate;
import src.com.sujata.demo.BookSearch;

public class BookClient {

	public static void main(String[] args) {
		BookSearch bookSearch=new BookSearch();
		
		System.out.println(bookSearch.getAllBook());
		
		System.out.println("=============");
		
//		System.out.println(bookSearch.getBookByAuthorX());
//		
//		System.out.println("==================");
//		System.out.println(bookSearch.getThickBooks());
//		
		
		System.out.println(bookSearch.searchBook(new AuthorXPredicate()));

	}

}
