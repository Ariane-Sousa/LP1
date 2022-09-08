/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicicleta;

/**
 *
 * @author Ariane Sousa
 */

public class TestaBicicleta {
    public static void main(String[] args) {
        Bicicleta c1 = new Bicicleta();
        //c1.marca = "Caloi";
        //c1.cor = "Preta";
        // c1.modelo = "Velox 2020";
        c1.frear();
        c1.status();
        c1.acelerar();
        c1.marcha();
    }
}
