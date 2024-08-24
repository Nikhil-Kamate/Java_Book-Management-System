package com.crimson.bookreadwriteopeartion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.crimson.customexception.InvalideUserData;
import com.crimson.entity.Book;
import com.crimson.interfaceimpl.BookOperation;

public class readwriteBookOperation implements BookOperation{
	
	Scanner sc=new Scanner(System.in);
	static List<Book> list=new ArrayList<>();
	Book b=null;

	public void readBook() {
		System.out.println("enter the number of books");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			b=new Book();
			System.out.println("enter book id:");
			b.setBookid(sc.nextInt());
			System.out.println("enter book name");
			b.setBookname(sc.next());
			System.out.println("enter author name ");
			b.setAuthor(sc.next());
			System.out.println("enter category name");
			b.setCategory(sc.next());
			System.out.println("enter the year of publish");
			b.setYearofpublish(sc.nextInt());
			double price;
	           while (true) {
	                try {
	                    System.out.println("Enter price:");
	                    price = sc.nextDouble();
	                    if (!checkprice(price)) {
	                        throw new InvalideUserData("Invalid price. Price must be greater than 0.");
	                    }
	                    b.setPrice(price);
	                    break; 
	                } catch (InvalideUserData e) {
	                    System.out.println(e.getMessage());
	                }
	            }
			list.add(b);	
	}
	}

	@Override
	public void printBook() {
		System.out.println("books details");
		System.out.println(list);	
	}
	
	public static boolean checkprice(double value) {
		return value>0;
	}
	
	public static boolean checkyear(int year) {
		String yearStr = String.valueOf(year);
		return yearStr.matches("^[1-9]+d{4}$");
	}

}
