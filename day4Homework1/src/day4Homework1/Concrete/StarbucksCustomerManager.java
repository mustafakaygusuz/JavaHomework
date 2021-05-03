package day4Homework1.Concrete;

import day4Homework1.Abstract.BaseCustomerManager;
import day4Homework1.Abstract.CustomerCheckService;
import day4Homework1.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }



    @Override
    public void save(Customer customer) {
        if(customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        }
        else {
            throw new ArithmeticException("Not a valid person.");
        }
    }



}
