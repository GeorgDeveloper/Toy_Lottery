package model;

public class Toy {
    int id;
    //    количество
    int quantity;
    //    вес
    int weight;
    String name;

    public Toy(int id, int quantity, int weight, String name) {
        this.id = id;
        this.quantity = quantity;
        this.weight = weight;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
