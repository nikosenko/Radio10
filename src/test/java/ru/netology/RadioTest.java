package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testParametrizedConstructor() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(11);

        int expected = 11;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnparametrizedConstructor() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(10, radio.getSizeStation());
    }

    // текущая радиостанция(прямое указание номера)
    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    // переключение радиостанций в допустимом диапазоне
    @Test
    public void shouldSwitchingStationAvailableRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.getCurrentStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    // переключение при значениях больше 9

    @Test
    public void shouldSwitchingStationAvailableMaxRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        radio.getCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //переключение при значении меньше 0
    @Test
    public void shouldSwitchingStationAvailableMinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.getCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //next внутри диапазона
    @Test
    public void shouldNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    // next при макс значении
    @Test
    public void shouldNextAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //переключение на предидущую внитри диапазона
    @Test
    public void shouldPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    // переключение на предидущую меньше мин
    @Test
    public void shouldPrevAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    //текущий уровень громкости
    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetHighVolumeLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // переключение громкости  в допустимом диапазоне
    @Test
    public void shouldSwitchingAcceptableRangeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.getCurrentVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
// переключение при значениях больше 100

    @Test
    public void shouldAbovMaxRangeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
// переключение при значениях меньше 0

    @Test
    public void shouldBelowMinimumRangeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.getCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    // прибавление громкости

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.increaseVolume();

        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    // убавление громкости

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}
