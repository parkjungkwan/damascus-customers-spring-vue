package com.bitcamp.web.service;

import java.util.List;


//import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface CustomerService {

    public void addCustomer(CustomerDTO customer);
    public List<CustomerDTO> findCustomers();
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    public int updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    public Long countAll();
    public CustomerDTO login(CustomerDTO customer);
    

    
}
