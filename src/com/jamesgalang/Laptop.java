package com.jamesgalang;

public class Laptop extends Computer {

    private boolean isPortable;
    private int cdDrive;
    private int trackpad;
    private String computerName;
    private String userPassword = "MySecretPassword";

    public Laptop(int memoryAmount, String cpuType, boolean isPortable, int cdDrive, int trackpad, String computerName) {
        super(memoryAmount, 1, cpuType);
        this.isPortable = isPortable;
        this.cdDrive = cdDrive;
        this.trackpad = trackpad;
    }

    @Override
    public void moveCursor() {
        System.out.println("Trackpad moved.");
    }

    // Getter and Setter for the Computer Name, we can set the name of the computer and see it at any time it is called.
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    private boolean passwordCheck (String password) {
        if (password.equals(this.userPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public void logIn (String password) {
        if (passwordCheck(password)) {
            System.out.println("You have logged in to the laptop.");
        } else {
            System.out.println("Wrong password.");
        }
    }

}

