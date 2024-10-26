package com.example.ttp2;

import com.example.ttp2.impl.DataImpl;
import com.example.ttp2.impl.MetierImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ttp2Application {
    public static void main(String[] args) {
        SpringApplication.run(Ttp2Application.class, args);

        DataImpl data = new DataImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDatacall(data);
        System.out.println("Results::::" + metier.calcul());
    }
}
