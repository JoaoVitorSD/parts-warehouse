package com.equipment.store.config;

import com.equipment.store.entities.Part;
import com.equipment.store.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class Seeder implements CommandLineRunner {
    @Autowired
    private PartRepository partRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            partRepository.save(new Part("RE324DC"+i,"SENSOR",100,100,11));
        }
    }
}
