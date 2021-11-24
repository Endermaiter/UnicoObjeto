package com.dam1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Singleton obx;

        obx = Singleton.getInstance();
        obx.setNombre("Sparrow");

        obx.setEdad(30);
        Singleton obx2;

        obx2 = Singleton.getInstance();
        obx2.setNombre("Sparrow");
        obx2.setEdad(30);

        Singleton versionInstancia = Singleton.getInstance();
        versionInstancia.setNombre("version 1.1");

        System.out.println(obx.getNombre());
    }


}
