package com.clockworkjava.kursspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Komponent mówi nam o tym, że jest to Spring Beanem
@Component
public class Hi implements CommandLineRunner {
// CommandLineRunner - this interface provides access to application arguments as string array

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!!!");
    }

}