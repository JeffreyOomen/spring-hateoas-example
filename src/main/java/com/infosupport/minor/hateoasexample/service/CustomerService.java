package com.infosupport.minor.hateoasexample.service;

import com.infosupport.minor.hateoasexample.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> allCustomers();

    Customer getCustomerDetail(final String id);
}
