package org.uwb.ichesnokov;

public class Fraction {
    int numerator;
    int denominator;
    int count = 1;

    //constructor
    //if denominator is 0 then the system switches denominator to 1
    public Fraction(int num, int den){
        if (den == 0){
            denominator = 1;
        }
        else{
            denominator = den;
        }
        numerator = num;
    }

    //returns numerator value
    public int getNumerator(){
        return numerator;
    }

    //returns denominator value
    public int getDenominator(){
        return denominator;
    }

    //sets Numerator value
    public void setNumerator(int num){
        numerator = num;
    }

    //sets Denominator value
    public void setDenominator(int den){
        denominator = den;
    }

    //returns count value
    public int getCount(){
        return count;
    }

    public boolean compare(Fraction aFraction){
        if (numerator == aFraction.getNumerator() && denominator == aFraction.getDenominator()) {
            count++;
            return true;
        }
        return false;
    }
}
