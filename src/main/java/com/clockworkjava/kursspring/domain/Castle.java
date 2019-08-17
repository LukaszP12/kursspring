package com.clockworkjava.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Spring Beany są to standardowe klasy Javy oznaczone adnotacja
//Spring skanuje wszystkie pliki zródłowe zanim dodaje do kontenera
//Contect kiedy wykryje, że załadował wszystkie klasy to uruchamia run
@Component
@PropertySource("classpath:castle.properties")
public class Castle {

    @Value("${my.castle.name:East Watch}")
    private String name; // = "East Watch";

    Knight knight;

    @Autowired
    public Castle(Knight knight) {
        this.knight = knight;
    }

    //Typ konstruktora domyślny - widoczny tylko dla klas w tej samej paczce

    Castle(Knight knight,String name) {
        this.knight = knight;
        this.name = name;
    }

    //ma się wykonać po tym jak Spring zostanie utworzony
    @PostConstruct
    public void build(){
        System.out.println("Wybudowano zamek " + name);
    }

    //ma się wykonać przed tym jak obiekt zostanie zniszczony
    @PreDestroy
    public void tearDown(){
        System.out.println("Zaraz wyburzymy zamek " + name);
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek o nazwie " + this.name + ". Zamieszkaly przezz rycerza" + this.knight;
    }
}