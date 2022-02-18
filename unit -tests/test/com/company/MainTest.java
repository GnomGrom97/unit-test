package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getZnach1() {
        double a = 133.3;
        double b = Main.getZnach1(1);
        double c = 0;
        assertEquals(a,b,c);
        }


    @Test
    public void getZnach() {
        double a = 1.9954988747186795;
        double b = Main.getZnach((int) 266.6);
        double c = 0;
        assertEquals(a,b,c);
    }
}