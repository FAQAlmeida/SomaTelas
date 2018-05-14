package com.example.fqa.somatelas;

import android.text.Editable;
import android.widget.EditText;

public class Util {
    public boolean tryParse(String str){
        try {
            Double.parseDouble(str);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
    public boolean tryParse(Editable str){
        try {
            Double.parseDouble(str.toString());
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
