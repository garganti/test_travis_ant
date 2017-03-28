package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloW2 {
	
	@Test
	public void testHW(){
		HelloWorld hw = new HelloWorld();
		assertEquals("Hello World", hw.sayHello());
	}

}
