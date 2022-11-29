package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radioStat = new Radio();

        radioStat.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetFirstStation() {
        Radio radioStat = new Radio();

        radioStat.setToFirstStation();

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStation() {
        Radio radioStat = new Radio();

        radioStat.setToLastStation();

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStationIfTryToSetLastPlusOne() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(9);

        radioStat.nextStation();

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastStationIfTryToSetFirstMinusOne() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(0);

        radioStat.prevStation();

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromTopBorder() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStationForTest(10);

        radioStat.nextStation();

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationFromMiddleLevel() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(5);

        radioStat.nextStation();

        int expected = 6;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationFromBottomBorder() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStationForTest(-1);

        radioStat.prevStation();

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationFromMiddleLevel() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(5);

        radioStat.prevStation();

        int expected = 4;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLevelOfSound(){
        Radio levelOfSound = new Radio();

        levelOfSound.setCurrentLevelOfSound(6);

        int expected = 6;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSEtTheLowestLevelOfSound() {
        Radio levelOfSound = new Radio();

        levelOfSound.setToMinLevelOfSound();

        int expected = 0;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheHighestLevelOfSound() {
        Radio levelOfSound = new Radio();

        levelOfSound.setToMaxLevelOfSound();

        int expected = 10;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeTheLevelOfSoundIfAlreadyMax() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(10);

        levelOfSound.turnUpTheLevelOfSound();

        int expected = 10;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeTheLevelOfSoundIfAlreadyMin() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(0);

        levelOfSound.turnDownTheLevelOfSound();

        int expected = 0;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheLevelOfSoundFromTopBorder() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(11);

        levelOfSound.turnUpTheLevelOfSound();

        int expected = 10;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheLevelOfSoundFromMiddleLevel() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(5);

        levelOfSound.turnUpTheLevelOfSound();

        int expected = 6;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheLevelOfSoundFromBottomBorder() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(-1);

        levelOfSound.turnDownTheLevelOfSound();

        int expected = 0;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheLevelOfSoundFromMiddleLevel() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(5);

        levelOfSound.turnDownTheLevelOfSound();

        int expected = 4;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }
}