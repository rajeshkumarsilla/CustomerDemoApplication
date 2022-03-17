package com.oracle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerService service;

    @GetMapping(value="/customers")
    @CrossOrigin(origins= {"http://127.0.0.1:8082","http://localhost:8082"})
    public List<Customer> getAllCustomers()
    {
    	System.out.println("In CustomerRestController Class getAllCustomers()");
        return service.getAllCustomers();
    }
}
