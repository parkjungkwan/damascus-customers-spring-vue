package com.bitcamp.web.serviceImpl;

import java.util.List;


import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.repositories.CustomerRepository;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {
   @Autowired CustomerRepository customerRepository;

    @Override
    public void addCustomer(CustomerDTO customer) {
        
    }

    @Override
    public List<CustomerDTO> findCustomers() {
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public int updateCustomer(CustomerDTO customer) {
        int res = 0;
        if(res == 1){
            System.out.println("서비스 수정성공");
        }else{
            System.out.println("서비스 수정실패");
        }
        return res;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
        
    }

    @Override
    public Long countAll() {
        return customerRepository.count();
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 ID: "+customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 PASS: "+customer.getPassword());
        return null;
    }

    
}