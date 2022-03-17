package com.oracle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/welcome/")
    public String getAllCustomers()
    {
    	System.out.println("In CustomerController Class getAllCustomers()");
        return "welcome";
    }
}
