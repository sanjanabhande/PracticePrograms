package com.practice.hackerrank;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:05:00AM"));
        System.out.println(timeConversion("12:05:00PM"));
    }

    static String timeConversion(String s) {
        String[] strArray = s.split("(?<=\\G.{2})");
        StringBuilder stringBuilder = new StringBuilder();
        if (strArray[4].equalsIgnoreCase("PM")){
            if (strArray[0].equalsIgnoreCase("12")){
                stringBuilder.append(strArray[0]);
            } else {
                stringBuilder.append(Integer.valueOf(strArray[0]) + 12);
            }
        }else {
            if (strArray[0].equalsIgnoreCase("12")){
                stringBuilder.append("00");
            } else {
                stringBuilder.append(strArray[0]);
            }
        }
        stringBuilder.append(strArray[1]);
        stringBuilder.append(strArray[2]);
        stringBuilder.append(strArray[3]);
        return stringBuilder.toString();
    }

}
