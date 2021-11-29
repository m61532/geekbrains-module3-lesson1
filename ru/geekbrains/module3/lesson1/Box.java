package ru.geekbrains.module3.lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> entry;

    public Box() {
        entry = new ArrayList<>();
    }

    public void put(T fruit) {
        entry.add(fruit);
    }

    public void put (List<T> fruits){
        entry.addAll(fruits);
    }

    private List getEntry (){
        List value = new ArrayList(entry);
        entry.clear();
        return value;
    }

    public double getWeight(){
        if (entry.size() > 0) {
            return entry.size() * entry.get(0).getWeight();
        } else return 0.0;
    }

    public void combine (Box<T> anotherBox){
       anotherBox.put(this.getEntry());
    }

    public boolean compare(Box anotherBox) {
        if (this.getWeight() == anotherBox.getWeight()) return true;
        return false;
    }
}
