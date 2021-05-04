package Business.Concrete;

import java.rmi.RemoteException;

import Business.Abstract.MernisService;
import Entities.Concrete.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements MernisService{

	@Override
	public boolean validate(User user) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(), user.getLastName(),user.getDateOfBrith().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
		
		
		/*
		 * if(user.getNationalityId().length() == 11 && user.getFirstName().length() > 2
		 * && user.getLastName().length() > 2 && user.getDateOfYear() > 1980) { return
		 * true; } return false;
		 */
		
	}

}
