/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicicleta;

/**
 *
 * @author Ariane Sousa
 */
public class Bicicleta {
    private String modelo;
    private String marca;
    private String cor;
    private String aro;
    private String acessorio;
    private boolean velocidade;
    
     //METODO CONSTRUTOR
    public Bicicleta() {
    }
    
    public Bicicleta(String marca, String modelo, String cor, boolean velocidade, String aro, String acessorio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
        this.acessorio = acessorio;
        this.aro = aro;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
        
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getAro(){
        return aro;
    }
    public void setAro(String aro){
        this.aro = aro;
    }
    public String getAcessorio(){
        return acessorio;
    }
    public void setAcessorio(String acessorio){
        this.acessorio = acessorio;
    }
    
    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Aro: " + this.aro);
        System.out.println("Acessorio: " + this.acessorio);
    }
    
    void acelerar(){
        System.out.println("Pronto para acelerar.");
        this.velocidade = true;
    }

    void frear(){
        this.velocidade = false;
    }
    void marcha(){
        if (this.velocidade == true) {
            System.out.println("Mudando de marcha");
        } else {
            System.out.println("Mudar de marcha estando parado, pode danificar sua bicicleta");
        }
        
    }
}
