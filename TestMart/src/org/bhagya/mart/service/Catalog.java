package org.bhagya.mart.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.bhagya.mart.service.bean.Product;

@WebService
public interface Catalog {

	@WebMethod
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract boolean addProduct(String cat, String product);

	@WebMethod
	public abstract List<String> listProductsByCat(String cat);

	@WebMethod
	public abstract List<Product> listProductsByCatV2(String cat);

}