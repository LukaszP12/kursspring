package com.clockworkjava.kursspring;

import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.DragonKillingKnight;
import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired //Castle ma zależność
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

     /*   Quest saveThePrincess = new Quest("Uratuj ksiezniczke");
        Knight lancelot = new Knight("Lancelot",29, saveThePrincess);

        System.out.println(lancelot);

        Quest killTheDragon = new Quest("Zabij smoka");
        Knight percival = new Knight("Pervical", 31);
        System.out.println(percival);
        percival.setQuest(killTheDragon);
        System.out.println(percival); */

    }

}
