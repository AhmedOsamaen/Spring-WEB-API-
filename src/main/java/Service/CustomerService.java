package Service;

import Models.Customer;
import repository.CustomerRepository;
import repository.CustomerSTDRepository;

import java.util.List;

public class CustomerService implements CustomerServiceSTD {
    private CustomerSTDRepository customerSTDRepository=new CustomerRepository();

    @Override
    public List<Customer> findAll(){
        return customerSTDRepository.findAll();
    }
}
