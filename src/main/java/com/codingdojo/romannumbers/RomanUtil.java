package com.codingdojo.romannumbers;

public class RomanUtil {
    public String toRoman(int number){
        return convertToRoman(number);
    }

    public String convertToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        if(number > 0){
            if(number>=1000) {
                sb.append("M").append(convertToRoman(number - 1000));
            }else if(number>= 900){
                sb.append("CM").append((convertToRoman(number-900)));
            }else if(number >= 500) {
                sb.append("D").append(convertToRoman(number - 500));
            }else if(number >= 400) {
                sb.append("CD").append(convertToRoman(number-400));
            }else if(number >= 100) {
                sb.append("C").append(convertToRoman(number - 100));
            }else if(number >= 90){
                sb.append("XC").append(convertToRoman(number-90));
            }else if(number >= 50) {
                sb.append("L").append(convertToRoman(number - 50));
            }else if(number>= 40) {
                sb.append("XL").append(convertToRoman(number-40));
            }else if(number >= 10) {
                sb.append("X").append(convertToRoman(number-10));
            }else if(number == 9) {
                sb.append("IX");
            }else if(number >=5) {
                sb.append("V").append(convertToRoman(number-5));
            }else if(number == 4) {
                sb.append("IV");
            }else {
                sb.append("I").append(convertToRoman(number-1));
            }

        }
        return sb.toString();
    }
}
