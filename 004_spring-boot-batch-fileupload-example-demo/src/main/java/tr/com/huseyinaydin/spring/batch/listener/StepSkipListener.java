package tr.com.huseyinaydin.spring.batch.listener;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import tr.com.huseyinaydin.spring.batch.entity.Customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.SkipListener;
import org.springframework.batch.core.StepExecution;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot Batch.
* 
*/

public class StepSkipListener implements SkipListener<Customer, Number> {
    Logger logger = LoggerFactory.getLogger(StepSkipListener.class);

    @Override // item reader
    public void onSkipInRead(Throwable throwable) {
        logger.info("Okuma esnasında hata oldu {} ", throwable.getMessage());
    }

    @Override // item writter
    public void onSkipInWrite(Number item, Throwable throwable) {
        logger.info("Yazma esnasında hata oldu {} , {}", throwable.getMessage(), item);
    }

    @SneakyThrows
    @Override // item processor
    public void onSkipInProcess(Customer customer, Throwable throwable) {
        logger.info("Bu kayıt {} bu istisna nedeni ile atlandı {}", new ObjectMapper().writeValueAsString(customer),
                throwable.getMessage());
    }
}