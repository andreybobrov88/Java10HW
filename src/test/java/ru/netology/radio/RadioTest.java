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
    public void shouldSetLastStationByDefault() {
        Radio radioStat = new Radio();

        radioStat.setToLastStation();

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLastStation() {
        Radio radioStat = new Radio(25);

        radioStat.setToLastStation();

        int expected = 24;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStationIfTryToSetLastPlusOneByDefault() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(9);

        radioStat.nextStation();

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStationIfTryToSetLastPlusOne() {
        Radio radioStat = new Radio(30);
        radioStat.setCurrentRadioStationForTest(30);

        radioStat.nextStation();

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastStationIfTryToSetFirstMinusOneByDefault() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(0);

        radioStat.prevStation();

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastStationIfTryToSetFirstMinusOne() {
        Radio radioStat = new Radio(30);
        radioStat.setCurrentRadioStation(0);

        radioStat.prevStation();

        int expected = 29;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromTopBorderByDefault() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStationForTest(10);

        radioStat.nextStation();

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseCurrentStationFromTopBorder() {
        Radio radioStat = new Radio(30);
        radioStat.setCurrentRadioStationForTest(29);

        radioStat.nextStation();

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromMiddleLevelByDefault() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(5);

        radioStat.nextStation();

        int expected = 6;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromMiddleLevel() {
        Radio radioStat = new Radio(30);
        radioStat.setCurrentRadioStation(15);

        radioStat.nextStation();

        int expected = 16;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationFromBottomBorderByDefault() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStationForTest(-1);

        radioStat.prevStation();

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationFromBottomBorder() {
        Radio radioStat = new Radio(30);
        radioStat.setCurrentRadioStationForTest(-1);

        radioStat.prevStation();

        int expected = 29;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationFromMiddleLevelByDefault() {
        Radio radioStat = new Radio();
        radioStat.setCurrentRadioStation(5);

        radioStat.prevStation();

        int expected = 4;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationFromMiddleLevel() {
        Radio radioStat = new Radio(30);
        radioStat.setCurrentRadioStation(18);

        radioStat.prevStation();

        int expected = 17;
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

        int expected = 100;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeTheLevelOfSoundIfAlreadyMax() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(100);

        levelOfSound.turnUpTheLevelOfSound();

        int expected = 100;
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
        levelOfSound.setCurrentLevelOfSound(101);

        levelOfSound.turnUpTheLevelOfSound();

        int expected = 100;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheLevelOfSoundFromMiddleLevel() {
        Radio levelOfSound = new Radio();
        levelOfSound.setCurrentLevelOfSound(53);

        levelOfSound.turnUpTheLevelOfSound();

        int expected = 54;
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
        levelOfSound.setCurrentLevelOfSound(38);

        levelOfSound.turnDownTheLevelOfSound();

        int expected = 37;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }
}