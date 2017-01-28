package com.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	public double getCartTotal(){
		double total = 0;
		List<Fruit> fruitsInTheCart=Fruit.fruitsList;
		List<Apple> getNumberOfApplesInCart= new ArrayList<Apple>();
		List<Orange> getNumberOfOrangesInCart= new ArrayList<Orange>();
		for(Fruit fruit: fruitsInTheCart){
			if(fruit instanceof Apple){
				getNumberOfApplesInCart.add((Apple) fruit);
			}
			if(fruit instanceof Orange){
				getNumberOfOrangesInCart.add((Orange) fruit);
			}
		}
		if(getNumberOfApplesInCart.size()>0){
			for(Apple applesInCart: getNumberOfApplesInCart){
				total=total+applesInCart.getPrice();
			}
		}
		if(getNumberOfOrangesInCart.size()>0){
			for(Orange orangesInCart: getNumberOfOrangesInCart){
				total=total+orangesInCart.getPrice();
			}
		}
		
		return total;
	}
	
	
	
}
