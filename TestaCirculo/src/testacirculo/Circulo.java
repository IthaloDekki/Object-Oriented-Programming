/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testacirculo;

public class Circulo {
    private int x,y,raio;
    public static final double PI =3.14159;
    public Circulo(int x, int y, int raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getRaio(){
        return raio;
    }
    public void setRaio(int raio){
        this.raio = raio;
    }
    public double circunferencia(){
        return 2 * PI * raio;
    }
}
