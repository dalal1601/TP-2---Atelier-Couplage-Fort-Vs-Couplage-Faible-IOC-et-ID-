package com.example.ttp2;

import com.example.ttp2.interfaces.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//PartII
public class PresSpringAnnotation {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.ttp2.impl");
        IMetier metier = (IMetier) applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
