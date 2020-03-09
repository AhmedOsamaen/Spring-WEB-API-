package repository;

import Models.Customer;

import java.util.List;

public interface CustomerSTDRepository {
    List<Customer> findAll();
}
