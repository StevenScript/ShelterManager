package com.ShelterManager;

/**
 * Abstract class representing an animal in the shelter.
 * Each animal has an order (arrival time) to support FIFO adoption.
 */
public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * Sets the order for this animal.
     * @param order The arrival order.
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * Returns the order of this animal.
     * @return The arrival order.
     */
    public int getOrder() {
        return order;
    }

    /**
     * Returns true if this animal was received before the other.
     * @param other The other animal to compare.
     * @return true if this animal is older.
     */
    public boolean isOlderThan(Animal other) {
        return this.order < other.getOrder();
    }

    @Override
    public String toString() {
        return name + " (order: " + order + ")";
    }
}
