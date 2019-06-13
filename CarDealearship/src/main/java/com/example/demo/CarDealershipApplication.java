package com.example.demo;

import com.example.demo.domain.Cars;
import com.example.demo.domain.CarsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarDealershipApplication {
    private static final Logger log = LoggerFactory.getLogger(CarDealershipApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CarDealershipApplication.class, args);
    }
    @Bean
    public CommandLineRunner CarDealearship(CarsRepository repository){
        return args -> {
            //save a couple of cars
            repository.save( new Cars("Honda","Civic",2011,"42,000"));
            repository.save( new Cars("Honda","Accord",2008,"46,500"));
            repository.save( new Cars("Toyota","Camry",2009,"50,000"));
            repository.save( new Cars("Toyota","Corolla",2001,"83,000"));
            repository.save( new Cars("Jeep","Wrangler",2018,"20,150"));
            repository.save( new Cars("Tesla","modelX",2019,"8,000"));
            repository.save( new Cars("Ford","Focus",2014,"65,000"));
            repository.save( new Cars("Ford","Fusion",2012,"43,800"));
            //read all cars
            log.info("All Cars Found: ");
            log.info("----------------");
            for(Cars car: repository.findAll()){
                log.info(car.toString());
            }
            log.info("");

            //read an individual car by ID
            repository.findById(1L)
                    .ifPresent(car ->{
                        log.info("Car Found by Id(1L): ");
                        log.info("---------------------");
                        log.info(car.toString());
                        log.info("");
                    });
            //read car by make
            log.info("Car Found With The Make of Honda: ");
            log.info("----------------------------------");
            repository.findByMake("Honda").forEach(honda -> {
                        log.info(honda.toString());
                        log.info("");
                    });

             //read car by model
             log.info("Car Found With The Model Of Focus: ");
             log.info("-----------------------------------");
             repository.findByModel("Focus").forEach(focus ->{
                 log.info(focus.toString());
                 log.info("");
             });

             //read by year
             log.info("Car Found With Year Of 2001: ");
             log.info("---------------------------");
             repository.findByYear(2001).forEach(year->{
                 log.info(year.toString());
                 log.info("");
                });

             //read by mileage
              log.info("Car Found With Mileage Of 8,000 ");
              log.info("--------------------------------");
              repository.findByMileage("8,000").forEach(mileage->{
                  log.info(mileage.toString());
                  log.info("");
              });
        };
    }

}
