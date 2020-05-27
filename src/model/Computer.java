package model;

public class Computer {

    private int id;
    private String name;
    private String serial;
    private int memory;
    private float processor;

    private boolean laptop = false;
    private boolean online = false;
    private String graphicCardName;


    public Computer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Computer(String serial, int memory, float processor){
        this.serial = serial;
        this.memory = memory;
        this.processor = processor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public float getProcessor() {
        return processor;
    }

    public void setProcessor(float processor) {
        this.processor = processor;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getGraphicCardName() {
        return graphicCardName;
    }

    public void setGraphicCardName(String graphicCardName) {
        this.graphicCardName = graphicCardName;
    }

    public void print(String text){
        System.out.print(name);
        PrinterCentralizer printerCentralizer = PrinterCentralizer.getInstance();
        printerCentralizer.print(text);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serial='" + serial + '\'' +
                ", memory=" + memory +
                ", processor=" + processor +
                ", laptop=" + laptop +
                ", online=" + online +
                ", graphicCardName='" + graphicCardName + '\'' +
                '}';
    }
}
