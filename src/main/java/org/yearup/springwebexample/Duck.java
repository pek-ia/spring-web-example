package org.yearup.springwebexample;

public class Duck {

    String name;
    boolean pretty = false;
    double weight = 42.0;

    public Duck(String name) {
        this.name = name;
    }


    public Duck(String name, boolean pretty, double weight) {
        this.name = name;
        this.pretty = pretty;
        this.weight = weight;
    }

    public boolean isPretty() {
        return pretty;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
