package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't

        assertTrue(list.hasCity(calgary));
    }
@Test
public void testDeleteCity() {
    CustomList list = new CustomList();
    City city = new City("Edmonton", "AB");
    list.addCity(city);
    list.deleteCity(city);
    assertFalse(list.hasCity(city));
}
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Toronto", "ON"));
        assertEquals(2, list.countCities());
    }
}