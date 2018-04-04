package com.jamesgalang;

public class iPad extends Laptop {

    private int monitor;
    private int speaker;

    public iPad(int memoryAmount, String cpuType, boolean isPortable, int cdDrive, int trackpad, String computerName, int monitor, int speaker) {
        super(memoryAmount, cpuType, isPortable, cdDrive, trackpad, computerName);
        this.monitor = monitor;
        this.speaker = speaker;
    }
}
