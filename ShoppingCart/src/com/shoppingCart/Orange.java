package com.shoppingCart;

public class Orange extends Fruit {

	public static final double ORANGE_PRICE = 0.25;
	public static boolean HAS_SPECIAL_OFFER;



	public Orange(){
		getPrice();
	}
	
	public double getPrice() {
		return ORANGE_PRICE;
	}

	
	public void addFruitToCart() {
		getFruitsList().add(new Orange());
		
	}

	public static boolean isHAS_SPECIAL_OFFER() {
		return HAS_SPECIAL_OFFER;
	}
	
	public static void setHAS_SPECIAL_OFFER(boolean hAS_SPECIAL_OFFER) {
		HAS_SPECIAL_OFFER = hAS_SPECIAL_OFFER;
	}
}
