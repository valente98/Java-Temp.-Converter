package com.company;
import sun.security.util.Length;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Temperature Converter.");
        Scanner using = new Scanner(System.in);
        String x = using.next();
        double temperature = Double.valueOf(x.substring(0, x.length() - 1));
        Character unit_temp = Character.toLowerCase(x.charAt(x.length() - 1));
        String source = Character.toString(unit_temp);
        using.next();
        String converter = using.next();
            TemperatureConverter tempconverter = new TemperatureConverter(source, converter);
            if (converter.length() > 1) {
                System.out.println("Sorry is Invalid Choice.");
            }else if  (source.length() > 1) {
                System.out.println("Sorry is Invalid Choice.");
            } else if (converter.toLowerCase().equals("f")) {
                System.out.println(tempconverter.conversion(temperature) + " degrees Fahrenheit");
            } else if (converter.toLowerCase().equals("c")) {
                System.out.println(tempconverter.conversion(temperature) + " degrees Celsius");
            } else if (converter.toLowerCase().equals("k")) {
                System.out.println(tempconverter.conversion(temperature) + " degrees Kelvin");
            }

    }
}
