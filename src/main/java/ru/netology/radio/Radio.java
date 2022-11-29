package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentLevelOfSound;
    private int totalNumberOfStations = 10;
    private int lastStation = totalNumberOfStations - 1;
    private final int firstStation = 0;
    private final int minLevelOfSound = 0;
    private final int maxLevelOfSound = 100;

    public Radio() {

    }

    public Radio(int totalNumberOfStations) {
        this.totalNumberOfStations = totalNumberOfStations;
        this.lastStation = totalNumberOfStations - 1;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < firstStation) {
            currentRadioStation = lastStation;
            return;
        }
        if (newCurrentRadioStation > lastStation) {
            currentRadioStation = firstStation;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public void setCurrentRadioStationForTest(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentLevelOfSound() {
        return currentLevelOfSound;
    }

    public void setCurrentLevelOfSound(int newCurrentLevelOfSound) {
        if (newCurrentLevelOfSound < minLevelOfSound) {
            currentLevelOfSound = minLevelOfSound;
            return;
        }
        if (newCurrentLevelOfSound > maxLevelOfSound) {
            currentLevelOfSound = maxLevelOfSound;
            return;
        }
        currentLevelOfSound = newCurrentLevelOfSound;
    }

    public void nextStation() {

        if (getCurrentRadioStation() <= lastStation) {
            currentRadioStation = currentRadioStation + 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void prevStation() {

        if (getCurrentRadioStation() >= firstStation) {
            currentRadioStation = currentRadioStation - 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void setToFirstStation() {
        currentRadioStation = firstStation;
    }

    public void setToLastStation() {
        currentRadioStation = lastStation;
    }

    public void turnUpTheLevelOfSound() {
        if (getCurrentLevelOfSound() < maxLevelOfSound) {
            currentLevelOfSound = currentLevelOfSound + 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }

    public void turnDownTheLevelOfSound() {
        if (getCurrentLevelOfSound() > minLevelOfSound) {
            currentLevelOfSound = currentLevelOfSound - 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }

    public void setToMinLevelOfSound() {
        currentLevelOfSound = minLevelOfSound;
    }

    public void setToMaxLevelOfSound() {
        currentLevelOfSound = maxLevelOfSound;
    }
}