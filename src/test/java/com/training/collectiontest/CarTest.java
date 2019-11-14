package com.training.collectiontest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collection.model.Car;

public class CarTest {

	Car car1, car2;

	public boolean checkSet(Object obj1,Object obj2,Object obj3,Object obj4) {
		Set<Object> data = new HashSet<Object>();
		data.add(obj1);
		data.add(obj2);
		data.add(obj3);
		data.add(obj4);
		
		Object[] arr = new Object[] {obj1,obj2,obj3,obj4};
		Car[] result = new Car[4];
		Iterator it = data.iterator();
		int i = 0;
		while(it.hasNext()) {
			result[i] = (Car) it.next();
			i++;
		}
		System.out.println(data.toString());
		return Arrays.equals(arr, result);
	}
	
	/**
	 * 
	 */
	@Before
	public void setUp() {
		car1 = new Car("toyota", "4L3", 1998, 30000);
		car2 = new Car("toyota", "4L3", 1989, 40000);
	}

	/**
	 * 
	 */
	@Test
	public void testTwoObjectEquals() {
		assertTrue(car1.equals(car2));
	}
	
	@Test
	public void testTwoObjectHashCodeAreEqual() {
		assertEquals(car1.hashCode(), car2.hashCode());
	}
	
	@Test
	public void testDuplicateCarObjectAddedInSetOrNot() {
		Car car3 = new Car("Scorpio", "SE091", 2004, 90000);
		Set<Car> data = new HashSet<Car>();
		data.add(car1);
		data.add(car2);
		data.add(car3);
		assertEquals(2, data.size());
	}
	
	@Test
	public void testDuplicateCarObjectAddedInListOrNot() {
		Car car3 = new Car("Scorpio", "SE091", 2004, 90000);
		List<Car> data = new ArrayList<Car>();
		data.add(car1);
		data.add(car2);
		data.add(car3);
		assertEquals(3, data.size());
	}
	
	@Test
	public void testInsertionOrderOfObjectInList() {
		Car car3 = new Car("Scorpio", "SE091", 2004, 90000);
		List<Car> data = new ArrayList<Car>();
		data.add(car1);
		data.add(car2);
		data.add(car3);
		assertEquals(car1, data.get(0));
		assertEquals(car2, data.get(1));
		assertEquals(car3, data.get(2));
	}
	
	@Test
	public void testInsertionOrderOfObjectInSet() {
		Car car3 = new Car("Scorpio", "SE091", 2004, 90000);
		Car car4 = new Car("INDIGO", "W234091", 2004, 90000);
		Car car5 = new Car("sumo", "SE09aS1", 2004, 90000);
		assertFalse(checkSet(car1,car3,car4,car5));
	}
	
	@After
	public void clear() {
		car1 = null;
		car2 = null;
	}

}
