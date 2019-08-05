import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RentalTest {

	@Test
	void testRental() {
		Rental rental = new Rental(new Movie("2001: A Space Odyssey", Movie.REGULAR), 14);
		assertEquals(rental.getDaysRented(), 14);
		assertEquals(rental.getMovie().getTitle(), "2001: A Space Odyssey");
		assertEquals(rental.getMovie().getPriceCode(), Movie.REGULAR);
	}

}
