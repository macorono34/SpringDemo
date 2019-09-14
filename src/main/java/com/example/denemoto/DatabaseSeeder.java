package com.example.denemoto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private MotorcycleRepository motorcycleRepository;

    @Autowired
    public DatabaseSeeder(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Motorcycle> moto = new ArrayList<>();

        moto.add(new Motorcycle("honda", "cbr250", 15.000,"red"));
        moto.add(new Motorcycle("yamaha", "r25", 20.000,"red"));
        moto.add(new Motorcycle("honda", "cbr1000rr", 40.000,"blue"));
        moto.add(new Motorcycle("honda","cbr600rr",35.000,"yellow"));

        motorcycleRepository.saveAll(moto);
    }
}
