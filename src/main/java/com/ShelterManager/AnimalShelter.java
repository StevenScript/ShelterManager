package com.ShelterManager;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implements an Animal Shelter that holds only dogs and cats.
 * Adoption is FIFO-based, allowing dequeue of the oldest animal overall
 * or the oldest dog/cat by preference.
 */
public class AnimalShelter {
    private Queue<Dog> dogQueue;
    private Queue<Cat> catQueue;
    private int order; // global counter for arrival order

    public AnimalShelter() {
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
        order = 0;
    }
}