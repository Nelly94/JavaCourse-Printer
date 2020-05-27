package model;

import java.util.ArrayList;
import java.util.List;

public class PrinterCentralizer {

    private static PrinterCentralizer instance = null;
    public static List<Printer> printers = new ArrayList<>();
    private static int index = 0;

    public static PrinterCentralizer getInstance(){
        if(instance == null){
            instance = new PrinterCentralizer();
        }
        return instance;
    }

    public void print(String text){
        printers.get(index).print(text);
        index++;
        if(index >= printers.size()){
            index = 0;
        }
    }

    public void addPrinter(Printer printer){
        printers.add(printer);
    }
}