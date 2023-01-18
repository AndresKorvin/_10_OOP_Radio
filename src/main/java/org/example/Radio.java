package org.example;

public class Radio {
    int currentStation;
    int currentVolume;

    public void changeStation(int stationButton) {
        if (stationButton >= 0 && stationButton <= 9) {
            currentStation = stationButton;
        }
    }
    public void nextStation() {
        if (currentStation >= 0 && currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0 && currentStation <= 9) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}