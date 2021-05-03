package day4Homework1;

import java.util.GregorianCalendar;

import day4Homework1.Abstract.BaseCustomerManager;
import day4Homework1.Adapters.MernisServiceAdapter;
import day4Homework1.Concrete.NeroCustomerManager;
import day4Homework1.Concrete.StarbucksCustomerManager;
import day4Homework1.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Mustafa Ýlhan");
        customer.setLastName("Kaygusuz");
        customer.setNationalityId("52423156468");
        customer.setDateOfBirth(new GregorianCalendar(2002, 06 , 13).getTime());

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(customer);
        System.out.println();

        BaseCustomerManager customerManager2 = new NeroCustomerManager();
        customerManager2.save(customer);

	}

}
