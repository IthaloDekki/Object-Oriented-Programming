/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usaimpressora;
import java.util.Scanner;

public class UsaImpressora {
    
    public static void main(String[] args) {
       Impressora impressora1 = new Impressora();
       Scanner myObj = new Scanner(System.in);
       
       impressora1.modelo = myObj.next();
       impressora1.cor = myObj.next();
       impressora1.tipoPapel = myObj.next();
       
       impressora1.status();
       impressora1.ligar();
       impressora1.digitalizar();
       impressora1.copiar();
       impressora1.desligar();
       impressora1.imprimir();
    }
    
}
