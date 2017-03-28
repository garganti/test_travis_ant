package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldTest {
	@Test
	public void testHellowWorld(){
		HelloWorld hello = new HelloWorld();
		String say = hello.sayHello();
		// uso di assertE
		assertEquals("Hello World", say);
		// oppure
		if (say.equals("Hello World")){
			System.out.println("OK");
		} else{
			fail();
		}
	}
}
