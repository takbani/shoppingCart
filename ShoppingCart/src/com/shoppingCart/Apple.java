package com.shoppingCart;

public class Apple extends Fruit {

	public static final double APPLE_PRICE = 0.60;
	public static boolean HAS_SPECIAL_OFFER;



	public Apple(){
		getPrice();
	}
	
	public double getPrice() {
		return APPLE_PRICE;
	}

	public void addFruitToCart(){
		getFruitsList().add(new Apple());
	}
	public static boolean isHAS_SPECIAL_OFFER() {
		return HAS_SPECIAL_OFFER;
	}
	
	public static void setHAS_SPECIAL_OFFER(boolean hAS_SPECIAL_OFFER) {
		HAS_SPECIAL_OFFER = hAS_SPECIAL_OFFER;
	}
}
