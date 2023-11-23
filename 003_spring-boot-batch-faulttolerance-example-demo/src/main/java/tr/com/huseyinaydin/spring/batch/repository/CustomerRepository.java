package tr.com.huseyinaydin.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.huseyinaydin.spring.batch.entity.Customer;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot Batch, Faulttolerance.
* 
*/

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}