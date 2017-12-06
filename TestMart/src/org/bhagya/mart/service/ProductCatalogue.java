package org.bhagya.mart.service;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import org.bhagya.mart.service.bean.Product;
import org.bhagya.mart.service.impl.ProductCatalogueImpl;

//@WebService(endpointInterface ="org.bhagya.mart.service.Catalog")
@WebService(name="CatalogService", portName="MyCatalogPort", serviceName="MyCatalogService")

public class ProductCatalogue implements Catalog 
{

	public ProductCatalogue() {
		// TODO Auto-generated constructor stub
	}
	ProductCatalogueImpl service = new ProductCatalogueImpl();
	
	/* (non-Javadoc)
	 * @see org.bhagya.mart.service.Catalog#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories()
	{
		return service.getProductCatagories();
	}
	
	/* (non-Javadoc)
	 * @see org.bhagya.mart.service.Catalog#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String cat, String product)
	{
		return service.addProduct(cat, product);
	}
	
	/* (non-Javadoc)
	 * @see org.bhagya.mart.service.Catalog#listProductsByCat(java.lang.String)
	 */
	@Override
	public List<String> listProductsByCat(String cat)
	{
		return service.getProductByCat(cat);
	}
	
	/* (non-Javadoc)
	 * @see org.bhagya.mart.service.Catalog#listProductsByCatV2(java.lang.String)
	 */
	@Override
	@WebResult(name="Product")
	public List<Product> listProductsByCatV2(String cat)
	{
		return service.getProductByCatV2(cat);
	}
}
