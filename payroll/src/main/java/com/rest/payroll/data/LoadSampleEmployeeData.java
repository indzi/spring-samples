package com.rest.payroll.data;


import com.rest.payroll.entity.EmployeeEntity;
import com.rest.payroll.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@Slf4j
public class LoadSampleEmployeeData {

    @Bean
    CommandLineRunner initDB (EmployeeRepository employeeRepository){
        return args -> {
            log.info("Preloading " + employeeRepository.save(new EmployeeEntity("Indranil", "Sinha", "Java", BigDecimal.valueOf(3000))));
            log.info("Preloading " + employeeRepository.save(new EmployeeEntity("Behnam", "Khoshsafar", "Java", BigDecimal.valueOf(50000))));
            log.info("Preloading " + employeeRepository.save(new EmployeeEntity("Aliasgar", "Vesalian", "Java", BigDecimal.valueOf(10000))));
            log.info("Preloading " + employeeRepository.save(new EmployeeEntity("Reza", "Afsharian", "Java", BigDecimal.valueOf(10000))));
            log.info("Preloading " + employeeRepository.save(new EmployeeEntity("Hossein", "Amiri", "Java", BigDecimal.valueOf(10000))));
        };
    }
}
