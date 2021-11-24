package com.dam1;

public class Singleton {
    private String nombre;
    private int edad;

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton obx1 = new Singleton();
        return obx1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

