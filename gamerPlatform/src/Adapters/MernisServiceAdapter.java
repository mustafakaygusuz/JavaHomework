package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		final KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(),
					gamer.getLastName(), gamer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
