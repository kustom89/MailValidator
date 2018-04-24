package com.example.andre.mailvalidator;

public class EvenCalculation {

    private EvenCallback callback;

    public EvenCalculation(EvenCallback callback) {
        this.callback = callback;
    }

    public void evenCalculation(String value){
        if(value.trim().length()>0){
            callback.evenResult(value);
        }else{
            callback.blankInput();
        }
    }


}
