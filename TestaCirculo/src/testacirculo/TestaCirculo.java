/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testacirculo;

public class TestaCirculo {

    public static void main(String[] args) {
        // Criação do vetor de 3 objetos Circulo
        Circulo[] vetor1 = new Circulo[3];
        vetor1[0] = new Circulo(3,3,1);
        vetor1[1] = new Circulo(4,3,2);
        vetor1[2] = new Circulo(6,2,3);
        
        // Declaração de outra referência do tipo Circulo[]
        Circulo[] vetor2;
        
        // Copia a referência do primeiro vetor para o segundo
        vetor2 = vetor1;
        
        // Criação do terceiro vetor do tipo Circulo de tamanho 3
        Circulo[] vetor3 = new Circulo[3];
        
        // Copia os objetos do primeiro vetor para o terceiro
        for(int i=0; i<3; i++){
            vetor3[i] = new Circulo(vetor1[i].getX(), vetor1[i].getY(), vetor1[i].getRaio());
        }
        
        // Altera os valores de raio para os objetos do primeiro vetor
        vetor1[0].setRaio(2);
        vetor1[1].setRaio(1);
        vetor1[2].setRaio(4);
        
        // Imprime os valores x, y e raio de cada objeto para os três vetores
        System.out.println("vetor1:");
        for (Circulo circulo : vetor1) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }

        System.out.println("vetor2:");
        for (Circulo circulo : vetor2) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }

        System.out.println("vetor3:");
        for (Circulo circulo : vetor3) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }   
        
    }
    
}
