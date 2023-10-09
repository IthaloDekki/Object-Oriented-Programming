/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionamento.de.classes;

import java.util.Scanner;

public class RelacionamentoDeClasses {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Veiculos carro = new Veiculos(myObj.next(),myObj.next(),myObj.next(),myObj.next(),myObj.nextInt());
        Motorista motorista = new Motorista(myObj.nextInt(), myObj.next(), myObj.next(), myObj.next());
        Cliente cliente = new Cliente(myObj.nextInt(), myObj.next(), myObj.next(), myObj.next(), myObj.next());
        Chamado chamado = new Chamado(myObj.nextInt(), myObj.next(), myObj.next(),myObj.next(),myObj.next(), myObj.nextFloat(),myObj.nextFloat(), myObj.nextDouble(),myObj.nextDouble(),myObj.nextDouble());
        
        System.out.println(chamado.getIdChamado());
        System.out.println(chamado.getDestino());
        System.out.println(carro.getPlaca());
        System.out.println(cliente.getRG());
        System.out.println(motorista.getNome());
    }
    
   
    
}
