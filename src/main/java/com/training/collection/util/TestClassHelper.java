package com.training.collection.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.training.collection.model.CellPhone;

public class TestClassHelper {

	public static boolean checkSet(Object obj1,Object obj2,Object obj3,Object obj4) {
		Set<Object> data = new HashSet<Object>();
		data.add(obj1);
		data.add(obj2);
		data.add(obj3);
		data.add(obj4);
		
		Object[] arr = new Object[] {obj1,obj2,obj3,obj4};
		CellPhone[] result = new CellPhone[4];
		Iterator it = data.iterator();
		int i = 0;
		while(it.hasNext()) {
			result[i] = (CellPhone) it.next();
			i++;
		}
		return Arrays.equals(arr, result);
	}
	
	public static boolean checkList(Object obj1,Object obj2,Object obj3,Object obj4) {
		List<Object> data = new ArrayList<Object>();
		data.add(obj1);
		data.add(obj2);
		data.add(obj3);
		data.add(obj4);
		
		Object[] arr = new Object[] {obj1,obj2,obj3,obj4};
		CellPhone[] result = new CellPhone[4];
		Iterator it = data.iterator();
		int i = 0;
		while(it.hasNext()) {
			result[i] = (CellPhone) it.next();
			i++;
		}
		return Arrays.equals(arr, result);
	}
	
}	
