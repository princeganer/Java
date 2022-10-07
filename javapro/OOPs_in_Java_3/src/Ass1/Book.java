/* Create a class named Book to maintain information about bookid, price(float). 
 * Add the method to display information about the book. create the book object . 
 * Value of id should be assigned on the basis of no of book objects and call its display method. 
 * Add default consructor and parameterised constructor which accepts only the price
 */
package Ass1;

public class Book {
	private static int count;
	private int bookid;
	private float price;
	
	static {
		count= 100;
	}
	
	public Book()
	{
		bookid= ++count;
		price=100;
	}
	
	public Book(float price) {
		bookid= ++count;
		this.price= price;
	}
	
	public void showBook() {
		System.out.println("Book Id: "+bookid+ " Price : "+price);
	}
}	

