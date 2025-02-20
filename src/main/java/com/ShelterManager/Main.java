package com.ShelterManager;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Enqueue animals
        shelter.enqueue(new Dog("Alpha"));
        shelter.enqueue(new Cat("Bravo"));
        shelter.enqueue(new Dog("Charlie"));
        shelter.enqueue(new Cat("Delta"));
        shelter.enqueue(new Dog("Echo"));

        // Test dequeueAny: should return the oldest animal (Alpha)
        System.out.println("Dequeue Any: " + shelter.dequeueAny());

        // Test dequeueDog: should return the oldest remaining dog (Charlie)
        System.out.println("Dequeue Dog: " + shelter.dequeueDog());

        // Test dequeueCat: should return the oldest cat (Bravo)
        System.out.println("Dequeue Cat: " + shelter.dequeueCat());

        // Continue testing dequeueAny
        System.out.println("Dequeue Any: " + shelter.dequeueAny());
        System.out.println("Dequeue Any: " + shelter.dequeueAny()); // Might be null if empty
    }
}