package model;

public class Test {

    public static void main(String[] args){

        Computer c1 = new Computer(0, "Asus0");
        Computer c2 = new Computer(1, "Asus1");
        Computer c3 = new Computer(2, "Asus2");
        Computer c4 = new Computer(3, "Asus3");
        Computer c5 = new Computer(4, "Asus4");
        Computer c6 = new Computer(5, "Asus5");

        PrinterCentralizer pCentralizer = PrinterCentralizer.getInstance();
        Printer p1 = new Printer(0,"Sony");
        pCentralizer.addPrinter(p1);
        Printer p2 = new Printer(1,"Xiaomi");
        pCentralizer.addPrinter(p2);
        Printer p3 = new Printer(2,"Canon");
        pCentralizer.addPrinter(p3);

        c1.print("Text 1");
        c2.print("Text 2");
        c3.print("Text 3");
        c4.print("Text 4");
        c5.print("Text 5");
        c6.print("Text 6");

    }

}
