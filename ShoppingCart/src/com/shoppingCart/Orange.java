package com.shoppingCart;

public class Orange extends Fruit {

	private static final double ORANGE_PRICE = 0.25;

	public Orange(){
		
		getPrice();
	}
	
	public double getPrice() {
		return ORANGE_PRICE;
	}

	
	public void addFruitToCart() {
		getFruitsList().add(new Orange());
		
	}

}
