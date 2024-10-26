package com.example.ttp2.impl;


import com.example.ttp2.interfaces.IData;
import org.springframework.stereotype.Component;
@Component("data") //partII
public class DataImpl implements IData {
    private  double data=11.00;
    @Override
    public double getData() {
        System.out.println("dataimpl:::: ");
        return this.data;
    }
}
