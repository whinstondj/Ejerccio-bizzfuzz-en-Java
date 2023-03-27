package bizzfuzz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class FizzBuzzTest {
	
	@SuppressWarnings("static-access")
	@Tag("happy-path")
	@Test
	public void multiplosTresTest() {
		FizzBuzz multiploTres = new FizzBuzz();
		
		Assert.assertEquals("fizz", multiploTres.resultado(6));
	}

	@SuppressWarnings("static-access")
	@Test
	public void multiplosTresyCincoTest() {
		FizzBuzz multiploTres = new FizzBuzz();
		
		Assert.assertEquals("fizzbuzz", multiploTres.resultado(15));
	}

	@SuppressWarnings("static-access")
	@Test
	public void multiplosCincoTest() {
		FizzBuzz multiploTres = new FizzBuzz();
		
		Assert.assertEquals("buzz", multiploTres.resultado(10));
	}

	@SuppressWarnings("static-access")
	@Test
	public void noMultiplosTest() {
		FizzBuzz multiploTres = new FizzBuzz();
		
		Assert.assertEquals("43", multiploTres.resultado(43));
	}

	
}
