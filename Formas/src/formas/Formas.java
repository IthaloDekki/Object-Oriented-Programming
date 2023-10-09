/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formas;

import java.util.Scanner;

public class Formas {

    public static void main(String[] args) {
        
        
        
        Scanner myObj = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();
        
        retangulo1.setComprimento_setLargura(myObj.nextInt(), myObj.nextInt());
        System.out.println(retangulo1.getComprimento() + " "+retangulo1.getLargura()+" "+ retangulo1.perimetro()+" "+ retangulo1.área());
        retangulo1.setComprimento_setLargura(myObj.nextInt(), myObj.nextInt());
        System.out.println(retangulo1.getComprimento() + " "+retangulo1.getLargura()+" "+ retangulo1.perimetro()+" "+ retangulo1.área());
        
    }
    
}
