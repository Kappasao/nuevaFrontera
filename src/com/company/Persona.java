package com.company;

import java.util.*;

/**
 * Created by 46995932D on 23/02/2017.
 */
public class Persona {

   private String name;

    private String dni;

    public Persona(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "persona{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
