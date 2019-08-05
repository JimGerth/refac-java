import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void testMovie() {
		Movie fullMetalJacket = new Movie("Full Metal Jacket", Movie.REGULAR);
		assertEquals(fullMetalJacket.getTitle(), "Full Metal Jacket");
		assertEquals(fullMetalJacket.getPriceCode(), Movie.REGULAR);
	}

}
