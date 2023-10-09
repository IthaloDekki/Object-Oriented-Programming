/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamento.de.classes;

public class Veiculos {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    
    
    public Veiculos(String placa, String marca, String modelo, String cor, int ano){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String newplaca) {
        this.placa = newplaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String newmarca) {
        this.marca = newmarca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String newmodelo) {
        this.modelo = newmodelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String newcor) {
        this.cor = newcor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int newano) {
        this.ano = newano;
    }
    
    
}
