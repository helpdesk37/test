package com.learning.collections.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learning.collections.java8Features.Object.Product;

public class ProductAverageStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<Product> prod=Arrays.asList( new Product("laptop", 1500.75,
		  "Electronics"), new Product("jeans", 600.75, "Clothing"), new
		  Product("sandals", 1100.00, "Footwear") );
		 
		/*
		 * List<Product> prod =List.of(new Product("laptop", 1500.75, "Electronics"));
		 */				Map<String, Double> map = prod.stream().collect(Collectors.groupingBy(Product::getCategory,
						Collectors.averagingDouble(Product::getPrice)));
				map.forEach((category,price)->System.out.println(category+"==="+price));
			}

}
