package model;

public class Printer {

    public int id;
    public String brand;

    public Printer(int id, String brand){
        this.id = id;
        this.brand = brand;
    }

    public void print(String text){
        System.out.print(" printed " + text + " on printer " + brand +"\n");
        System.out.println(text);
    }
}
