import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {
	
	@Test
	void testCustomer() {
		Customer jerry = new Customer("Jerry");
		assertEquals(jerry.getName(), "Jerry");
	}

	@Test
	void testExampleStatement() {
		Customer tom = new Customer("Tom");
		tom.addRental(new Rental(new Movie("Shutter Island", Movie.REGULAR), 5));
		tom.addRental(new Rental(new Movie("Inception", Movie.REGULAR), 3));
		tom.addRental(new Rental(new Movie("The Shining", Movie.REGULAR), 9));
		assertEquals(tom.statement(), "Rental Record for Tom\n\tShutter Island\t6.5\n\tInception\t3.5\n\tThe Shining\t12.5\nAmount owed is 22.5\nYou earned 3 frequent renter points");
	}
	
	@Test
	void testExampleHTMLStatement() {
		Customer tom = new Customer("Tom");
		tom.addRental(new Rental(new Movie("Shutter Island", Movie.REGULAR), 5));
		tom.addRental(new Rental(new Movie("Inception", Movie.REGULAR), 3));
		tom.addRental(new Rental(new Movie("The Shining", Movie.REGULAR), 9));
		assertEquals(tom.htmlStatemet(), "<h1>Rentals for <em>Tom</em></h1><p>\nShutter Island: 6.5<br>\nInception: 3.5<br>\nThe Shining: 12.5<br>\n<p>You owe <em>22.5</em></p>\nOn this rental you earned <em>3</em> frequent renter points<p>");
	}

}
