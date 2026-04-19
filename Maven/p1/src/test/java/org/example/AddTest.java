package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void add() {
        Add a=new Add();
        int tres=a.add(5,10);
        assertEquals(15,tres);
    }
}