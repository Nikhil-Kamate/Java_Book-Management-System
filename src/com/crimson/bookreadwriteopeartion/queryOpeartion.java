package com.crimson.bookreadwriteopeartion;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.crimson.entity.Book;

public class queryOpeartion extends readwriteBookOperation{
	
	Scanner sc=new Scanner(System.in);
	
	public void bookcountcategory() {
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Book::getCategory,Collectors.counting()));
		System.out.println(map);
	}
	
	public void pricecount() {
		System.out.println("Total price of books in the collection: "+list.stream().mapToDouble(Book::getPrice).sum());
	}
	
	public void eachCatrgoryPrice() {
		Map<String, Double> map=list.stream().collect(Collectors.groupingBy(Book::getCategory,Collectors.summingDouble(Book::getPrice)));
		System.out.println(map);
	}
	
	public void countofBook() {
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Book::getAuthor,Collectors.counting()));
		System.out.println(map);
	}
	public void publishedbook() {
		System.out.println("enter the year : ");
		int year=sc.nextInt();
		
		List<String> l = list.stream()
		        .filter(x -> x.getYearofpublish() == year)
		        .map(Book::getBookname)
		        .collect(Collectors.toList());
		System.out.println(l);
	}

}
