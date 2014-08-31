package _4_java_Linked_Lists_1;

public class Link {

	public String bookName;
	public int millionsSold;
	
	public Link next;
	
	public Link(String bookName, int millionsSold) {
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}
	
	public void display() {
		System.out.println(bookName + ": " + millionsSold + ",000,000");
	}
	
	@Override
	public String toString() {
		return bookName;
	}
	
	
	public static void main(String[] args) {
		
		LinkList theLinkedList = new LinkList();
		
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
		theLinkedList.insertFirstLink("The Lord of the Rings", 150);
		theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);
		
		//theLinkedList.removeFirst();
		//theLinkedList.display();
		
		System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");
		
		theLinkedList.removeLink("The Lord of the Rings");
		theLinkedList.display();
		
		System.out.println("-------------");
		theLinkedList.insertLastLink("Greec Mythology", 591);
		System.out.println();
		theLinkedList.display();
	}
	
}


