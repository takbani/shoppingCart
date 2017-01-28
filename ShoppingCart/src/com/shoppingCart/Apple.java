package com.shoppingCart;

public class Apple extends Fruit {

	private static final double APPLE_PRICE = 0.60;

	public Apple(){
		getPrice();
	}
	
	public double getPrice() {
		return APPLE_PRICE;
	}

	public void addFruitToCart(){
		getFruitsList().add(new Apple());
	}
}
