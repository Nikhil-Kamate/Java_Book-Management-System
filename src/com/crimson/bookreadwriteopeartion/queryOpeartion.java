package com.crimson.bookreadwriteopeartion;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.crimson.entity.Book;

public class queryOpeartion extends readwriteBookOperation{
	
	Scanner sc=new Scanner(System.in);
	
	public void bookcountcategory() {
		System.out.println("displaying the total books in each catagory: ");
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Book::getCategory,Collectors.counting()));
		System.out.println(map);
	}
	
	public void pricecount() {
		System.out.println("Total price of books in the collection: "+list.stream().mapToDouble(Book::getPrice).sum());
	}
	
	public void eachCatrgoryPrice() {
		System.out.println("displaying the total price of books in each catagory: ");
		Map<String, Double> map=list.stream().collect(Collectors.groupingBy(Book::getCategory,Collectors.summingDouble(Book::getPrice)));
		System.out.println(map);
	}
	
	public void countofBook() {
		System.out.println("counting the books based on author: ");
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Book::getAuthor,Collectors.counting()));
		System.out.println(map);
	}
	public void publishedbook() {
		System.out.println("displaying book name based on year of publication: ");
		System.out.println("enter the year");
		int year=sc.nextInt();
		
		List<String> l = list.stream()
		        .filter(x -> x.getYearofpublish() == year)
		        .map(Book::getBookname)
		        .collect(Collectors.toList());
		System.out.println(l);
	}

}
