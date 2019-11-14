package com.training.collection.model;

import java.util.HashSet;
import java.util.Set;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private double price;
	
	
	/**
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + year;
		return result;
	}
	
	
	/**
	 * @param obj
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		Car c = new Car("toyota", "4L3", 1929, 55500);
		Car d = new Car("toyota", "4L3", 1999, 40000);
		
		Set<Car> data = new HashSet<Car>();
		data.add(c);
		data.add(d);
		System.out.println(data.size());
//		if(c == d) {
//			System.out.println("True");
//			System.out.println(c);
//			System.out.println(c.hashCode());
//			System.out.println(d);
//			System.out.println(d.hashCode());
//		}
//		else {
//			System.out.println(c);
//			System.out.println(c.hashCode());
//			System.out.println(d);
//			System.out.println(d.hashCode());
//		}
	}
	
	
	
}
