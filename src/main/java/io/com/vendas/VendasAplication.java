package io.com.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasAplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasAplication.class,args);
    }
}
