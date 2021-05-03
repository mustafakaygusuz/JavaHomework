package day4Homework1.Concrete;

import day4Homework1.Abstract.CustomerCheckService;
import day4Homework1.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService
{

    @Override
    public boolean CheckIfRealPerson(Customer customer) 
    {
        return true;

    }	

}
