package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    Person fullPerson;
    @Before
    public void init() {
        fullPerson = new Person("Jane", 35, 160, 130, true);
    }
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testFullConstructor() {
        Integer expectedAge = 35;
        String expectedName = "Anny";
        Integer expectedHeight = 160;
        Integer expectedWeight = 120;
        boolean expectedMarital = true;

        Person person = new Person(expectedName, expectedAge, expectedHeight, expectedWeight, expectedMarital);

        Integer actualAge =  person.getAge();
        String actualName = person.getName();
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();
        boolean actualMarital = person.getMarital();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedMarital, actualMarital);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetIsMarried() {
        // Given
        Person person = new Person();
        person.setMarital(true);

        boolean actual = person.getMarital();

        Assert.assertEquals(true, actual);
    }

    @Test
    public void testGetIsMarried() {
        boolean expected = true;

        boolean actual = fullPerson.getMarital();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHeight() {
        int expected = 160;

        int actual = fullPerson.getHeight();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        int expected = 180;
        fullPerson.setHeightCm(180);

        int actual = fullPerson.getHeight();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetWeight(){
        int expected = 130;

        int actual = fullPerson.getWeight();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        int expected = 155;
        fullPerson.setWeight(155);

        int actual = fullPerson.getWeight();

        Assert.assertEquals(expected, actual);
    }

}