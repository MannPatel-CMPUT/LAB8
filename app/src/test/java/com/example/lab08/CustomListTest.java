package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.Delete_city(calgary);
        //This test case failed because there was no functionality inside the Delete_city function.

        assertFalse(list.hasCity(calgary));

    }
    @Test
    public void testCountCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City saskatoon = new City("Saskatoon", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);
        list.addCity(saskatoon);
        //Test will fail because Count_City() not created yet.
        assertEquals(3, list.Count_City());
    }

}
