package com.clockworkjava.kursspring.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight,"Castle Black");
        String except = "Znajduje się tu zamek o nazwie Castle Black. Zamieszkaly przezz rycerzaRycerz o imieniu Lancelot(29) ma za zadanie: Uratuje ksiezniczke";
        assertEquals(except, castle.toString());
    }

}
