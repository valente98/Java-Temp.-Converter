package com.company;
import java.util.Scanner;


public class Main {
//    public static void p(Object a) { System.out.println(a);}

    public static void main(String[] args) {
        System.out.println("Welcome to Temperature Converter.");
        Scanner using = new Scanner(System.in);
        String x = using.next();
        double temperature = Double.valueOf(x.substring(0, x.length() - 1));
        Character source = x.charAt(x.length() - 1);
        using.next();
        String converter = using.next();
        TemperatureConverter tempconverter = new TemperatureConverter(source, converter);
        if (converter.equals("f")) {
            System.out.println(tempconverter.conversion(temperature) + " degrees Fahrenheit");
        } else if (converter.equals("c")){
            System.out.println(tempconverter.conversion(temperature) + " degrees Celsius");
        } else if (converter.equals("k")){
            System.out.println(tempconverter.conversion(temperature) + " degrees Kelvin");
        }
    }
}
