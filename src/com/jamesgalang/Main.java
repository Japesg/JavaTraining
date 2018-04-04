package com.jamesgalang;

public class Main {

    public static void main(String[] args) {

        // instantiate a new object of the type computer.
        Computer computerOne = new Computer(8, 2, "AMD");

        // instantiate a new laptop object
        Laptop laptopOne = new Laptop(16,"intel", true, 1, 1, "James");
        laptopOne.turnOn();
        laptopOne.moveCursor();
        laptopOne.loadProgram(5);
        laptopOne.setComputerName("Shiva");
        System.out.println(laptopOne.getComputerName());

        laptopOne.logIn("MySecretPassword");

        String source = "Hello World";

        for (String part : source.split(" ")) {
            System.out.print(new StringBuilder(part).reverse().toString());
            System.out.print(" ");
        }


        // general computer object
        //System.out.println("There is " + computerOne.getMemoryAmount() + "GB of memory."


    }
}
