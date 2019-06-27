package com.bitcamp.web.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.entities.Customer;
import com.bitcamp.web.repositories.CustomerRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {

   @Autowired TestEntityManager manager;
   @Autowired CustomerRepository repo;

   @Test
   public void insertTest(){
       Customer c = new Customer("a-1",
                                "a-2",
                                "a-3",
                                "a-4",
                                "a-5",
                                "a-6",
                                "a-7",
                                "a-8",
                                "a-9");
       repo.save(c);
       Customer c2 = repo.findById();
   }

   @Test
   public void countTest() throws Exception {
        Long count = repo.count();
        String test = null;
        assertThat(Integer.parseInt(count+""),  equalTo(0));
   }
   @Test
   public void saveTest() throws Exception {
        Customer customer = new Customer();
        
   }



}