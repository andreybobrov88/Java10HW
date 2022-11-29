package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentLevelOfSound;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
            return;
        }
        if (newCurrentRadioStation > 9) {
            currentRadioStation = 0;
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
        if (newCurrentLevelOfSound < 0) {
            currentLevelOfSound = 0;
            return;
        }
        if (newCurrentLevelOfSound > 10) {
            currentLevelOfSound = 10;
            return;
        }
        currentLevelOfSound = newCurrentLevelOfSound;
    }

    public void nextStation() {
        if (getCurrentRadioStation() <= 9) {
            currentRadioStation = currentRadioStation + 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void prevStation() {
        if (getCurrentRadioStation() >= 0) {
            currentRadioStation = currentRadioStation - 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void setToFirstStation() {
        currentRadioStation = 0;
    }

    public void setToLastStation() {
        currentRadioStation = 9;
    }

    public void turnUpTheLevelOfSound() {
        if (getCurrentLevelOfSound() < 10) {
            currentLevelOfSound = currentLevelOfSound + 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }

    public void turnDownTheLevelOfSound() {
        if (getCurrentLevelOfSound() > 0) {
            currentLevelOfSound = currentLevelOfSound - 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }

    public void setToMinLevelOfSound() {
        currentLevelOfSound = 0;
    }

    public void setToMaxLevelOfSound() {
        currentLevelOfSound = 10;
    }
}