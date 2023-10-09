/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaimpressora;


public class Impressora {
    String modelo, cor, tipoPapel;
    boolean bluetooth =  true, wifi = true, colorida = true, ligada, papel= true, digitalizadora= true, copiadora;
    
    public void ligar(){
        if (ligada == false){
            System.out.println("ligando...\n");
            ligada = true;
        }
    }
    public void desligar(){
        if (ligada == true){
            System.out.println("desligando...\n");
            ligada = false;
        }
    }
    public void imprimir(){
        if (ligada == true && papel == true){
        System.out.println("imprimindo...\n");
        }
        else if (ligada == true && papel == false){
            System.out.println("sem papel\n");
        }
        else{
            System.out.println("impressora desligada\n");
        }
    }
    public void digitalizar(){
        if (ligada == true && digitalizadora == true){
            System.out.println("digitalização sendo realizada...\n");
        }
        else if (ligada == true && copiadora == false){
            System.out.println("não é possível digitalizar\n");
        }
        else{
            System.out.println("impressora desligada\n");
        }
    }
    
    public void copiar(){
        if(ligada == true && copiadora == true){
            System.out.println("cópia sendo realizada...\n");
        }else if (ligada == true && copiadora == false){
            System.out.println("não é possível copiar\n");
        }else{
            System.out.println("impressora desligada\n");
        }
    }
    public void  status (){
        System.out.println(modelo + "\n");
        System.out.println(cor + "\n");
        System.out.println(tipoPapel + "\n");
        if (bluetooth){
            System.out.println("bluetooth on\n");
        }else{
            System.out.println("bluetooth off\n");
        }
        
        if (wifi){
            System.out.println("wifi on\n");
        }else{
            System.out.println("wifi off\n");
        }
        
        if (colorida){
            System.out.println("impressão colorida\n");
        }else{
            System.out.println("impressão preto e branco\n");
        }
        
        if (ligada){
            System.out.println("impressora on\n");
        }else{
            System.out.println("impressora off\n");
        }
        
        if (papel){
            System.out.println("tem papel\n");
        }else{
            System.out.println("não tem papel\n");
        }
        
        if (digitalizadora){
         System.out.println("digitalizadora on\n");
        }else{
            System.out.println("digitalizadora off\n");
        }
        
        if(copiadora){
            System.out.println("copiadora on\n");
        }else{
            System.out.println("copiadora off\n");
        }
        
        }
    }
            


