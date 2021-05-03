package day4Homework1.Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import day4Homework1.Abstract.CustomerCheckService;
import day4Homework1.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService  {

    private boolean result;

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        KPSPublicSoap client = new KPSPublicSoapProxy();
        this.result = false;
        try {
            result = client.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), 
                    customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
                    );
        }catch (RemoteException e) {
            e.printStackTrace();
        }
        return this.result;
    }
}
