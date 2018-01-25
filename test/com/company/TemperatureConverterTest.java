package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void KelvintoFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter("k", "f");
        assertEquals(32, converter.conversion(273.15));
    }
    @Test
    void KelvintoCelsius() {
        TemperatureConverter converter = new TemperatureConverter("k", "c");
        assertEquals(0, converter.conversion(273.15));
    }
    @Test
    void KelvintoKelvin() {
        TemperatureConverter converter = new TemperatureConverter("k", "k");
        assertEquals(273.15, converter.conversion(273.15));
    }
    @Test
    void FahrenheittoFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter("f", "f");
        assertEquals(12, converter.conversion(12));
    }
    @Test
    void FahrenheittoCelsius() {
        TemperatureConverter converter = new TemperatureConverter("f", "c");
        assertEquals(0, converter.conversion(32));
    }
    @Test
    void FahrenheittoKelvin() {
        TemperatureConverter converter = new TemperatureConverter("f", "k");
        assertEquals(273.15, converter.conversion(32));
    }
    @Test
    void CelsiustoCelsius() {
        TemperatureConverter converter = new TemperatureConverter("c", "c");
        assertEquals(32, converter.conversion(32));
    }
    @Test
    void CelsiustoFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter("c", "f");
        assertEquals(32, converter.conversion(0));
    }
    @Test
    void CelsiustoKelvin() {
        TemperatureConverter converter = new TemperatureConverter("c", "k");
        assertEquals(273.15, converter.conversion(0));
    }
}