package tr.com.huseyinaydin.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import tr.com.huseyinaydin.spring.batch.entity.Customer;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot Batch, Faulttolerance.
* 
*/

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) {
        return Integer.parseInt(customer.getAge()) > 18 ? customer : null;
    }
}