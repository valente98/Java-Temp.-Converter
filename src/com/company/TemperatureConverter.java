package com.company;

public class TemperatureConverter {
    public String source;
    public String converter;

    TemperatureConverter(String source, String converter) {
        this.source = source;
        this.converter = converter;
    }

    public double conversion(double temperature) {
        if (source.equals("f") && converter.toLowerCase().equals("c")) {
            return (temperature - 32) * 9 / 5;
        } else if (source.equals("f") && converter.toLowerCase().equals("k")) {
            return (temperature - 32) * 9 / 5 + 273.15;
        } else if (source.equals("c") && converter.toLowerCase().equals("f")) {
            return temperature * 9 / 5 + 32;
        } else if (source.equals("c") && converter.toLowerCase().equals("k")) {
            return temperature + 273.15;
        } else if (source.equals("k") && converter.toLowerCase().equals("f")) {
            return (temperature - 273.15) * 9 / 5 +32;
        } else if (source.equals("k") && converter.toLowerCase().equals("c")) {
            return temperature - 273.15;
        }else {
            return temperature;
        }
    }
}