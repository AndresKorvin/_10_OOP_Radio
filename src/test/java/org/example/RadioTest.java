package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/changeStationData.csv")
    void boundaryValuesAndEquivalenceClassesOfChangeStation(int stationButton, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(stationButton);
        assertEquals(radio.getCurrentStation(), expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nextStationData.csv")
    void shouldNextStation(int inputCurrentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(inputCurrentStation);
        radio.nextStation();
        assertEquals(radio.getCurrentStation(), expected);
    }

    @ParameterizedTest
    @CsvSource({
            "-1,9",
            "0,9",
            "1,0",
            "5,4",
            "9,8",
            "10,9"
    })
    void shouldPreviousStation(int inputCurrentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(inputCurrentStation);
        radio.previousStation();
        assertEquals(radio.getCurrentStation(), expected);

    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "5,6",
            "10,10"
    })
    void shouldIncreaseVolume(int inputVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inputVolume);
        radio.increaseVolume();
        assertEquals(radio.getCurrentVolume(), expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "5,4",
            "10,9"
    })
    void shouldReduceVolume(int inputVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inputVolume);
        radio.reduceVolume();
        assertEquals(radio.getCurrentVolume(), expected);
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "5,5",
            "10,10",
            "11,0"
    })
    void setVolumeLevel(int inputVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inputVolume);
        assertEquals(radio.getCurrentVolume(), expected);
    }
}