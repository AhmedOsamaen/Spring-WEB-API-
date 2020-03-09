package repository;

import Models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements CustomerSTDRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer>customers = new ArrayList<>();
     Customer customer = new Customer();
     customer.setFirstname("ahmed");
     customer.setLastname("osama");

     customers.add(customer);

     return customers;
    }
}
