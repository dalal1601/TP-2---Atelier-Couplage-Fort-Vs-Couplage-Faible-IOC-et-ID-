package com.example.ttp2.impl;


import com.example.ttp2.interfaces.IData;
import com.example.ttp2.interfaces.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //partII
public class MetierImpl implements IMetier {
    @Qualifier("data") //partII
    @Autowired //partII
    private IData datacall;
    @Override
    public double calcul() {

        return datacall.getData()*2;
    }
    public void setDatacall(DataImpl datacall) {
        this.datacall = datacall;
    }
}