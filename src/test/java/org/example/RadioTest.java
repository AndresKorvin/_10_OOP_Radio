package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "-1,9",
            "0,9",
            "1,0",
            "5,4",
            "9,8",
            "10,9"
    })
    void  shouldSetAmountStation(int amountOfStation, int expected) {
        Radio radio = new Radio(amountOfStation);
        assertEquals(expected,radio.getAmountOfStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shouldSetCurrentStationData.csv")
    void shouldSetCurrentStation(int stationButton, int amountOfStation, int expected) {
        Radio radio = new Radio(amountOfStation);
        radio.setCurrentStation(stationButton);
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shouldNextStationData.csv")
    void shouldNextStation(int inputCurrentStation, int amountStation, int expected) {
        Radio radio = new Radio(amountStation);
        radio.setCurrentStation(inputCurrentStation);
        radio.nextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,	0,  9",
            "0,	5,  4",
            "0,	9,  8",
            "5,	5,  4",
            "5,	9,  4",
            "5,	0,  4",
            "9,	9,  8",
            "9,	0,  8",
            "9,	5,  4",
    })
    void shouldPreviousStation(int inputCurrentStation, int amountStation, int expected) {
        Radio radio = new Radio(amountStation);
        radio.setCurrentStation(inputCurrentStation);
        radio.previousStation();
        assertEquals(expected, radio.getCurrentStation());

    }

    @ParameterizedTest
    @CsvSource({
            "0,5",
            "50,55",
            "100,100"
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
            "50,45",
            "100,95"
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
            "50,50",
            "100,100",
            "101,0"
    })
    void setVolumeLevel(int inputVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inputVolume);
        assertEquals(radio.getCurrentVolume(), expected);
    }
}