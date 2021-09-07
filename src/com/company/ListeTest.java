package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void isEmpty() {

        assertEquals(true,liste.isEmpty());
        liste.insertNodeFromHead("Viktor");
        assertEquals(false,liste.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void insertNodeFromHead() {
    }

    @Test
    void printListFromHead() {

        liste.insertNodeFromHead("1");
        liste.insertNodeFromHead("2");
        liste.insertNodeFromHead("3");

        assertEquals("321",liste.printFromHead());

    }
}