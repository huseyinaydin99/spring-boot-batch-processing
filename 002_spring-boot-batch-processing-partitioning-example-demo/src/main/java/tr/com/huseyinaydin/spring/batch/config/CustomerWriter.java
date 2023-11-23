package tr.com.huseyinaydin.spring.batch.config;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.com.huseyinaydin.spring.batch.entity.Customer;
import tr.com.huseyinaydin.spring.batch.repository.CustomerRepository;

import java.util.List;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot Batch.
* 
*/

@Component
public class CustomerWriter implements ItemWriter<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        System.out.println("Kanal adı: -"+Thread.currentThread().getName());
        customerRepository.saveAll(list);
    }
}