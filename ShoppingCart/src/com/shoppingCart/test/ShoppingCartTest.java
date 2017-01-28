package com.shoppingCart.test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.shoppingCart.Apple;
import com.shoppingCart.Fruit;
import com.shoppingCart.Orange;
import com.shoppingCart.ShoppingCart;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartTest {
	private Apple apple;
	private Orange orange;
	@Spy private ShoppingCart testObj= new ShoppingCart();
	
	@Before
	public void setUp(){
		apple= new Apple();
		orange=new Orange();
		Fruit.fruitsList.clear();
	}
	
	@Test
	public void testCartTotalWhenOneAppleIsinCart(){
		apple.addFruitToCart();
		assertEquals(0.60,testObj.getCartTotal(),0);
	}
	
	@Test
	public void testCartTotalWhenOnlyOrangeIsInTheCart(){
		orange.addFruitToCart();
		assertEquals(0.25,testObj.getCartTotal(),0);
	}
	@Test
	public void givenOneAppleAndOrangeinTheCartThenCalculateCartTotal(){
		apple.addFruitToCart();
		orange.addFruitToCart();
		assertEquals(0.85, testObj.getCartTotal(),0);
	}
	
	@Test
	public void givenTwoApplesAndOneOrangeinTheCartThenCalculateCartTotal(){
		apple.addFruitToCart();
		apple.addFruitToCart();
		orange.addFruitToCart();
		assertEquals(1.45, testObj.getCartTotal(),0);
	}
	

}
