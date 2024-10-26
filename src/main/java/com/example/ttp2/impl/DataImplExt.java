package com.example.ttp2.impl;


import com.example.ttp2.interfaces.IData;
import org.springframework.stereotype.Component;

@Component //partII
public class DataImplExt implements IData {
    private double data =20.00;
    @Override
    public double getData(){
        return this.data;
    }
}
