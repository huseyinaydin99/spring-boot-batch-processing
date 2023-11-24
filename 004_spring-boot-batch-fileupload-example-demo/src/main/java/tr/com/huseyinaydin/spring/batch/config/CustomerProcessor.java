package tr.com.huseyinaydin.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import tr.com.huseyinaydin.spring.batch.entity.Customer;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot Batch.
* 
*/

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) {
        int age = Integer.parseInt(customer.getAge());
        if (age >= 18) {
            return customer;
        }
        return null;
    }
}