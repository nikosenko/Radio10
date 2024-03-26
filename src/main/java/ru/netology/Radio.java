package ru.netology;

public class Radio {
    private int sizeStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int size) {


        maxStation = minStation + size - 1;


    }

    public Radio() {

        sizeStation = 10;
    }

    public int getSizeStation() {
        return sizeStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinStation() {
        return minStation;

    }

    public int getMaxStation() {
        return maxStation;

    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            setCurrentVolume(minVolume);
            return;
        }
        if (newCurrentVolume > maxVolume) {
            setCurrentVolume(maxVolume);
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }


    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}

