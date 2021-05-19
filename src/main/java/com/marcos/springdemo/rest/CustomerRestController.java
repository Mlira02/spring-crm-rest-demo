package com.marcos.springdemo.rest;

import com.marcos.springdemo.entity.Customer;
import com.marcos.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController
{

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers()
    {
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId)
    {
        Customer theCustomer = customerService.getCustomer(customerId);

        if(theCustomer == null)
        {
            throw new CustomerNotFoundException("Customer with id: " + customerId + " was not found");
        }
        return theCustomer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer)
    {
        theCustomer.setId(0);

        customerService.saveCustomer(theCustomer);

        return theCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer)
    {
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }
}