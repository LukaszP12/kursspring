package com.clockworkjava.kursspring.config;

import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.domain.Quest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class MainConfig {

    @Bean
    public Quest createQuest() {
        return new Quest();
    }

    @Bean
    public Knight createKnight() {
        Knight knight = new Knight("Lancelot",29);
        knight.setQuest(createQuest());
        return knight;
    }


}