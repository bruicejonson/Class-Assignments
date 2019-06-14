package com.tts.oop.model;

import com.tts.oop.Interface.Loanable;

import java.time.LocalDate;
import java.util.ArrayList;

public class CardHolder {
    String name;
    LocalDate joinDate;
    ArrayList<Loanable>loaned = new ArrayList();
    public CardHolder(String name, LocalDate joinDate){
        this.name = name;
        this.joinDate = joinDate;
    }
    public void checkOut(Loanable l){
        if(l.isLoaned){
           loaned.add(l);
        }
    }


}
