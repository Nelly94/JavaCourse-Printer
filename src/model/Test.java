package model;

public class Test {

    public static void main(String[] args){

        Computer c = new ComputerBuilder("123", 100, 1015)
                            .isLaptop()
                            .setOnline()
                            .withGraphicCard("Nvidia")
                            .build();
        System.out.println(c.toString());

        Computer c2 = new ComputerBuilder("789", 500, 20148)
                .isLaptop()
                .setOnline()
                .withGraphicCard("Sony")
                .build();
        System.out.println(c2.toString());


    }

}
