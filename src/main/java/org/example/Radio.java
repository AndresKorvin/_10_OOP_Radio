package org.example;

import java.util.Scanner;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private  int amountOfStation = 9;
    public Radio (int amountStation) {
        if (amountStation < 1 || amountStation > 10) {
            amountStation = 10;
        }
        this.amountOfStation = amountStation - 1;
    }
    public Radio() {
        System.out.println("Установлено 10 станций");
    }
    public int getAmountOfStation() {
        return amountOfStation;
    }

    public void setCurrentStation(int stationButton) {
            if (stationButton >= 0 && stationButton <= amountOfStation) {
                currentStation = stationButton;
            }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation > -1 && currentStation < amountOfStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0 && currentStation <= amountOfStation) {
            currentStation--;
        } else {
            currentStation = amountOfStation;
        }
    }

    public void setCurrentVolume(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 100) {
            currentVolume = volumeLevel;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 5;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 5;
        }
    }


}