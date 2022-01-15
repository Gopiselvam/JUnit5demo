package com.mockito.extras;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

public class TestMock {
	Service service;



	@Test
	public void testService() {
		service = mock(Service.class);
		Assert.assertEquals(1, service.getServiceCount());

	}

	@Test
	public void testService2() {
		List list = mock(ArrayList.class);
		when(list.get(anyInt())).thenReturn("MockedValue");
		list.add("test");
		list.add("test");
		Assert.assertEquals("MockedValue", list.get(0)); //Line 1
		Assert.assertEquals(0, list.size()); //Line 2
	}

	@Test
	public void testMethod3() {
		List<String> list = new ArrayList<String>();
		List<String> spyList = Mockito.spy(list);
		spyList.add("one");
		spyList.add("two");
		doReturn("mockValue").when(spyList).get(anyInt());
		spyList.add("three");
		Assert.assertEquals("mockValue", spyList.get(0));// Line 1
		Assert.assertEquals("three", spyList.get(2));// Line 2
		Assert.assertEquals(3, spyList.size());// Line 3

	}


	@Test
	public void testMethod4() {
		List<String> mocklist = Mockito.mock(ArrayList.class);
		when(mocklist.get(anyInt())).thenReturn("mocked");
		when(mocklist.size()).thenReturn(5);
		System.out.println("size:" + mocklist.size());
		verify(mocklist,atLeastOnce()).get(0); //Line1
		verify(mocklist,atLeastOnce()).size(); //Line2

	}
}

final class Service {
	public int getServiceCount() {
		return 1;
	}
}