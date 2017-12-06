package org.bhagya.mart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bhagya.mart.service.bean.Product;

public class ProductCatalogueImpl 
{

	public List<String> books = new ArrayList<>();
	public List<String> music = new ArrayList<>();
	public List<String> movies = new ArrayList<>();
	
	public List<String> getProductCatagories()
	{
		List<String> cat = new ArrayList<String>();
		cat.add("Books");
		cat.add("Music");
		cat.add("Movies");
		return cat;
	
	}
	
	public boolean addProduct(String cat, String product)
	{
		switch (cat) {
		case "Books":
			  books.add(product);
			  return true;
		case "Music":
			  music.add(product);
			  return true;
		case "Movies":
			  movies.add(product);
			  return true;
		default:
			return false;
		}
	}
	
	public List<String> getProductByCat(String cat)
	{
		switch (cat) {
		case "Books":
			  return books;
		case "Music":
			  return music;
		case "Movies":
			  return movies;
		default:
			return null;
		}
	}
	
	public List<Product> getProductByCatV2(String cat)
	{
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "JavaBeans", 177817));
		products.add(new Product(2, "JSSavaBeans", 277817));
		products.add(new Product(3, "KKJavaBeans", 477817));
		return products;
	}
}
