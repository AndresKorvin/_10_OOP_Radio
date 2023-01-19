package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int stationButton) {
            currentStation = stationButton;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation > -1 && currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0 && currentStation < 10) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void setCurrentVolume(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 10) {
            currentVolume = volumeLevel;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
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