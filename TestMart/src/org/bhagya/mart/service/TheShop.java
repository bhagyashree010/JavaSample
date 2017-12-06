package org.bhagya.mart.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="MyStore", portName="MyStorePort", 
			serviceName="MyStoreService", wsdlLocation="http://mystore.com")
public class TheShop {


	@WebMethod
	@WebResult(partName="lookUpOutput")
	public String getShopInfo(@WebParam(partName = "inputParameter") String property)
	{
		String returnParam = "invalid property";
		if("name".equalsIgnoreCase(property))
			return "My Provision store";
		else if("since".equalsIgnoreCase(property))
			return "1998";
		
		return returnParam;
	}
}
