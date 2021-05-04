package Adapters;

import java.rmi.RemoteException;

import Entities.Concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class ValidateService implements Validate{

	@Override
	public boolean checkCustomer(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(),customer.getDateOfBrith().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
		
	}
}
