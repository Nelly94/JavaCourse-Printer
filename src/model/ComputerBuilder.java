package model;

public class ComputerBuilder {

    private Computer computer;

    public ComputerBuilder(String serial, int memory, float processor){
        computer = new Computer(serial, memory, processor);
    }

    public ComputerBuilder withGraphicCard(String graphicCard){
        computer.setGraphicCardName(graphicCard);
        return this;
    }

    public ComputerBuilder isLaptop(){
        computer.setLaptop(false);
        return this;
    }

    public ComputerBuilder setOnline(){
        computer.setOnline(false);
        return this;
    }

    public Computer build(){
        return computer;
    }

}
