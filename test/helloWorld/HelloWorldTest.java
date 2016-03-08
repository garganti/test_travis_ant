package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldTest {
	@Test
	public void testHellowWorld(){
		HelloWorld hello = new HelloWorld();
		assertEquals("A test for Hello World String", "Hello World", hello.sayHello());
	}
}
