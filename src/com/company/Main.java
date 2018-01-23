package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner using = new Scanner(System.in);
        System.out.println("Choose the source using. [f]Fahrenheit, [c]Celsius, or [k]Kelvin");
        Scanner convert = new Scanner(System.in);
        String source = using.nextLine();
        System.out.println("Choose the source trying to convert into. [f]Fahrenheit, [c]Celsius, or [k]Kelvin");
        Scanner amount = new Scanner(System.in);
        String converter = convert.nextLine();
        System.out.println("What is the temperature number your are converting");
        Integer temperature = amount.nextInt();
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
