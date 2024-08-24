package com.crimson.bookmanagementmain;

import com.crimson.bookreadwriteopeartion.queryOpeartion;
import com.crimson.bookreadwriteopeartion.readwriteBookOperation;

public class BookMain {

	public static void main(String[] args) {
		
		readwriteBookOperation rd=new readwriteBookOperation();
		rd.readBook();
		
		
		queryOpeartion qd=new queryOpeartion();
		qd. bookcountcategory();
		qd.pricecount();
		qd.eachCatrgoryPrice();
		qd.countofBook();
		qd.publishedbook();
	}

}
