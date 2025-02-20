package com.ShelterManager;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implements an Animal Shelter that holds only dogs and cats.
 * Adoption is FIFO-based, allowing dequeue of the oldest animal overall
 * or the oldest dog/cat by preference.
 */
public class AnimalShelter {
    // Queues for dogs and cats.
    private Queue<Dog> dogQueue;
    private Queue<Cat> catQueue;
    // Global counter to assign order to arriving animals.
    private int order;


    /**
     * Constructs an AnimalShelter with empty queues for dogs and cats.
     */
    public AnimalShelter() {
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
        order = 0;
    }


    /**
     * Enqueues an animal to the shelter.
     * Assigns the animal an order based on its arrival time and adds it to the appropriate queue.
     *
     * @param animal The animal to enqueue.
     */
    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        } else {
            throw new IllegalArgumentException("Only Dogs and Cats are allowed.");
        }
    }



}
