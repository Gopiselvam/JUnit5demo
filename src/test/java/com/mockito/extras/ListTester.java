package com.mockito.extras;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ListTester {
@Test
   public void testMethod() {
	    List<String> list = new ArrayList<String>();
	    List<String> spyList = Mockito.spy(list);
	 
	    spyList.add("one"); // Line 1 
	    spyList.add("two");  // Line 2 
	    when(spyList.add(anyString())).thenReturn(true);
	    
	    Mockito.verify(spyList).add("one");
	    Mockito.verify(spyList).add("two");
	 
	    Assert.assertEquals(2, spyList.size());// Line 2
	    
	}
}