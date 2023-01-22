package org.example;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private int amountOfStations = 9;

    public Radio(int amountStation) {
        if (amountStation < 1 || amountStation > 10) {
            amountStation = 10;
        }

        this.amountOfStations = amountStation - 1;
    }

    public Radio() {
        System.out.println("Установлено 10 станций");
    }

    public int getAmountOfStations() {
        return this.amountOfStations;
    }

    public void setCurrentStation(int stationButton) {
        if (stationButton >= 0 && stationButton <= this.amountOfStations) {
            this.currentStation = stationButton;
        }

    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void nextStation() {
        if (this.currentStation > -1 && this.currentStation < this.amountOfStations) {
            ++this.currentStation;
        } else {
            this.currentStation = 0;
        }

    }

    public void previousStation() {
        if (this.currentStation > 0 && this.currentStation <= this.amountOfStations) {
            --this.currentStation;
        } else {
            this.currentStation = this.amountOfStations;
        }

    }

    public void setCurrentVolume(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 100) {
            this.currentVolume = volumeLevel;
        }

    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void increaseVolume() {
        if (this.currentVolume < 100) {
            this.currentVolume += 5;
        }

    }

    public void reduceVolume() {
        if (this.currentVolume > 0) {
            this.currentVolume -= 5;
        }

    }
}