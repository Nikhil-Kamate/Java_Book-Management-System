package com.crimson.bookmanagementmain;

import java.util.Scanner;

import com.crimson.bookreadwriteopeartion.queryOpeartion;

public class BookMenu {
	
	public void menu() {
		Scanner sc =new Scanner(System.in);
		queryOpeartion qr=new queryOpeartion();
		
		int choice=0;
		
		do {
			System.out.println("----Book Management System----");
			System.out.println("1. Add Books");
			System.out.println("2. Display the Total Books in Each Catagory");
			System.out.println("3. Total price of books in the collection");
			System.out.println("4. Display the total price of books in each catagory");
			System.out.println("5. Counting the books based on author");
			System.out.println("6. Display the book name based on year of publication");
			System.out.println("7.exit");
			System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
            	qr.readBook();
                break;
            case 2:
            	qr. bookcountcategory();
                break;
            case 3:
            	qr.pricecount();
                break;
            case 4 :
            	qr.eachCatrgoryPrice();
            	break;
            case 5 :
            	qr.countofBook();
            	break;
            case 6 :
            	qr.publishedbook();
            	break;
            case 7:
                System.out.println("Exiting program...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 8);

    sc.close();

		
	}

}
