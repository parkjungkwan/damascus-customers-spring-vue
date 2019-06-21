package com.bitcamp.web.domain;
import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Data @Component @Lazy
public class CustomerDTO {

    private String customerId, customerName,
    password, ssn, phone, city, address, postalcode, photo;
}