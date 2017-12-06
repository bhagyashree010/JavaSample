package bhagya.webservice.client;

import java.util.Scanner;

import com.redknee.util.crmapi.soap.common.xsd._2011._05.CRMRequestHeader;
import com.redknee.util.crmapi.soap.common.xsd._2011._05.ObjectFactory;
import com.redknee.util.crmapi.soap.mobilenumbers.mobilenumbers_v2.CRMExceptionFault;
import com.redknee.util.crmapi.soap.mobilenumbers.mobilenumbers_v2.MobileNumberService;
import com.redknee.util.crmapi.soap.mobilenumbers.mobilenumbers_v2.MobileNumbersPortTypeV20;

import a.b.c.Calculator;
import a.b.c.CalculatorPortType;

public class MyCalculator {

	public static void main(String[] args) {
		
		MobileNumberService service = new MobileNumberService();
		MobileNumbersPortTypeV20 stub = 
				service.getMobileNumbersSOAP11PortHttp();
		
		CRMRequestHeader header = new CRMRequestHeader();
		ObjectFactory fact = new ObjectFactory();
		header = fact.createCRMRequestHeader();
		header.setAgentID(fact.createCRMRequestHeaderAgentID("rkadm"));
		header.setPassword(fact.createCRMRequestHeaderPassword("rkadm"));
		header.setUsername(fact.createCRMRequestHeaderUsername("rkadm"));
		header.setTransactionID(fact.createCRMRequestHeaderTransactionID("txn78"));
		
		try {
			System.out.println(stub.getMobileNumber(header, "635345225"));
		} catch (CRMExceptionFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
