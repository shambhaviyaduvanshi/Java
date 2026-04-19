package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subTest {

    @Test
    void s() {
        sub subt=new sub();
        int tre=subt.s(10,8);
        assertEquals(2,tre);
    }
}