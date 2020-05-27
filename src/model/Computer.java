package model;

public class Computer {

    public int id;
    public String name;

    public Computer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void print(String text){
        System.out.print(name);
        PrinterCentralizer printerCentralizer = PrinterCentralizer.getInstance();
        printerCentralizer.print(text);
    }
}
