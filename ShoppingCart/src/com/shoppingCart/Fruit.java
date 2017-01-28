package com.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public abstract class Fruit {
 public static List<Fruit> fruitsList= new ArrayList<Fruit>();
	public abstract double getPrice();
	public abstract void addFruitToCart();
	
	public List<Fruit> getFruitsList(){
		return fruitsList; 
	}
	

}
