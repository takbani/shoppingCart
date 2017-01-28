package com.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	public double getCartTotal(){
		double totalCostOfApples = 0;
		double totalCostOfOranges = 0;
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
				if(!Apple.HAS_SPECIAL_OFFER){
					totalCostOfApples=totalCostOfApples+applesInCart.getPrice();
				}
				else
				{
					break;
				}
			}
		}
		
		totalCostOfApples = processSpecialOfferForApples(totalCostOfApples, getNumberOfApplesInCart);
		if(getNumberOfOrangesInCart.size()>0){
			for(Orange orangesInCart: getNumberOfOrangesInCart){
				if(!Orange.HAS_SPECIAL_OFFER){
					totalCostOfOranges=totalCostOfOranges+orangesInCart.getPrice();
				}
				else{
					break;
				}
			}
		}
		totalCostOfOranges = processSpecialOffersOnOranges(totalCostOfOranges,getNumberOfOrangesInCart);
		
		return totalCostOfOranges+totalCostOfApples;
	}

	private double processSpecialOffersOnOranges(double totalCostOfOranges,
			List<Orange> getNumberOfOrangesInCart) {
		if(getNumberOfOrangesInCart.size()%3==0&&getNumberOfOrangesInCart.size()>0&&Orange.HAS_SPECIAL_OFFER){
			int chargeableOranges=getNumberOfOrangesInCart.size()-getNumberOfOrangesInCart.size()/3;
			totalCostOfOranges=totalCostOfOranges+chargeableOranges*Orange.ORANGE_PRICE;
		}
		if(getNumberOfOrangesInCart.size()%3!=0&&getNumberOfOrangesInCart.size()>0&&Orange.HAS_SPECIAL_OFFER){
			int orangesNotInMultiplesOfThree=getNumberOfOrangesInCart.size()%3;
			int orangesOnSpecialOfferCount=getNumberOfOrangesInCart.size()-orangesNotInMultiplesOfThree;
			totalCostOfOranges=((orangesOnSpecialOfferCount-orangesOnSpecialOfferCount/3)+orangesNotInMultiplesOfThree)*Orange.ORANGE_PRICE;
			
		}
		return totalCostOfOranges;
	}

	private double processSpecialOfferForApples(double total,
			List<Apple> getNumberOfApplesInCart) {
		if(getNumberOfApplesInCart.size()%2==0 && Apple.HAS_SPECIAL_OFFER && getNumberOfApplesInCart.size()>0){
			total=total+(getNumberOfApplesInCart.size()* Apple.APPLE_PRICE)/2;
		}
		else if(getNumberOfApplesInCart.size()%2!=0 && Apple.HAS_SPECIAL_OFFER && getNumberOfApplesInCart.size()>0){
			int numberOfEvenApples=getNumberOfApplesInCart.size()-getNumberOfApplesInCart.size()%2;
			total=total+(((numberOfEvenApples)/2)+getNumberOfApplesInCart.size()%2)*Apple.APPLE_PRICE;
			
		}
		return total;
	}
	
	
	
}
