/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.pkg6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int num = myObj.nextInt();
        int i;
        String certa;
        for(i=0; i < num; i++){
            String palavra = myObj.next();
            lista.add(palavra);
        }
        String errada = myObj.next();
        char charArray[] = errada.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
        
        for(i=0; i < lista.size(); i++){
            String atual = lista.get(i);
            certa = atual;
            
            char charArray2[] = atual.toCharArray();
            Arrays.sort(charArray2);
            
            if((charArray == charArray2) && (errada != certa)){
                System.out.print("palavra incorreta\n" + certa + "?");
            }
            
        }
    }
}
