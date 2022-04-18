package org.jacoco.examples.java.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}

    @Test
    public void testGetMessageBigger(){
        assertEquals("Hello Universe!", subject.getMessage(true));
    }   

    @Test
    public void testFail(){
        assertTrue(false);
    }
	
}
