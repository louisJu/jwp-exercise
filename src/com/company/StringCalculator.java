package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String text) {

        if (isBlank(text)) {
            return 0;
        }

        return sum(stringToInts(split(text)));



        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);

        if(m.find()){
            String customDelimeter = m.group(1);
            numbers = m.group(2).split(customDelimeter);
        }

        while(numbers)


        return Integer.parseInt(text);
    }

    private String[] split(String text){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);

        if(m.find()){
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }

        return text.split(", | :");
    }

    private int[] stringToInts(String[] values){
        int[] numbers = new int[values.length];
        for(int i=0; i<numbers.length; i++)
            numbers[i] = toPositive(values[i]);

        return numbers;
    }
    private int toPositive(String value){
        int number = Integer.parseInt(value)
        if(number < 0)
            throw new RuntimeException();

        return number;

    }

    private int sum(int[] numbers){
        int result =0;
        for(int number : numbers){
            result +=number;
        }
        return result;
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }


}
