package assignment4;

import java.util.*;

public class purchaseBooks {
	public static ArrayList<Book> booklist = new ArrayList<Book>();

	public void purchase(Customer c, Book b) {
		booklist.add(b);
		System.out.println(c.getName() + " is buying a book with the name of " + b.name + " and price of " + b.price);
	}

	public double calculatePrice(ArrayList<Book> booklist) {
		double addPrice=0f;
		for(int i=0;i<booklist.size();i++)
		addPrice+=booklist.get(i).price;
		return addPrice;
	}

	public static void main(String[] args) {
		purchaseBooks pb=new purchaseBooks();
		Customer c=new Customer("Jane");
		Book b1=new Book("Head First Java",58.0);
		Book b2=new Book("Gone with the wind",39.5);
		Book b3=new Book("Database",45.1);
		pb.purchase(c,b1);
		pb.purchase(c,b2);
		pb.purchase(c,b3);
		System.out.println("The total price of the books is "+pb.calculatePrice(booklist));
	}
}
