package com.jamesgalang;

public class Computer {

    private int memoryAmount;
    private int cpuNumber;
    private String cpuType;

    public Computer(int memoryAmount, int cpuNumber, String cpuType) {
        this.memoryAmount = memoryAmount;
        this.cpuNumber = cpuNumber;
        this.cpuType = cpuType;

    }

    public void turnOn() {
        System.out.println("Computer on.");
    }

    public void loadProgram (int numberOfPrograms) {
        System.out.println(numberOfPrograms + " program(s) have been loaded.");
    }

    public void loadProgram (String loadProgram) {
        System.out.println(loadProgram + " has been loaded.");
    }

    public void moveCursor() {
        System.out.println("Mouse moved.");
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public int getCpuNumber() {
        return cpuNumber;
    }

    public String getCpuType() {
        return cpuType;
    }
}
