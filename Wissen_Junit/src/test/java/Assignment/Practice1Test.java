package Assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import Assignmnet.Practice1;

 class Practice1Test {
	 
	 private final PrintStream standardOut = System.out;
	 private static Practice1 pt=null;
	 private final static ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	 
	 @BeforeAll
	 public static void setUp() {
		  pt =new Practice1();
	     System.setOut(new PrintStream(outputStreamCaptor));
	 }
	 
	 @Test
	  public void testPrint() {
			
		  pt.print("Hello Baeldung Readers!!");

		 Assert.assertEquals("Hello Baeldung Readers!!", outputStreamCaptor.toString()
		      .trim());
		}
		
	  @AfterEach
	   public void tearDown() {
		    System.setOut(standardOut);
		}

	/*@Test
	void testAdd() {
		
		
	       Practice1 myList = Mockito.mock(Practice1.class);
		    Mockito.doNothing().when(myList).add(Mockito.anyInt(),Mockito.anyInt());
		    myList.add(0, 5);
		 
		    Mockito.verify(myList, Mockito.times(1)).add(0, 5);
	}*/
	
	

} 
