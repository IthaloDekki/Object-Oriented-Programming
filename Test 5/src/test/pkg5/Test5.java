/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.pkg5;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        LinkedHashMap<String, Integer> prod_qtd = new LinkedHashMap<String, Integer>();
        int qtd = myObj.nextInt();
        int i;
        
        for(i=0; i < qtd; i++){
            String a = myObj.next();
            int b = myObj.nextInt();
            prod_qtd.put(a, b);
        }
        while(true){
            String prod_retirar = myObj.next();
            
            if(prod_retirar.equals("fim")){
                break;
                
            }else if(prod_qtd.containsKey(prod_retirar)){
                
                int qtd_retirar = myObj.nextInt();
                System.out.println(prod_retirar +" "+ qtd_retirar);
                int new_qtd_retirar = prod_qtd.get(prod_retirar) - qtd_retirar;
                prod_qtd.put(prod_retirar, new_qtd_retirar);
                
            }else{
                System.out.println(prod_retirar + " produto não encontrado");
            }
            
        }
        for(Map.Entry<String, Integer> mapElement : prod_qtd.entrySet()){
            String key = mapElement.getKey();
            Integer value = mapElement.getValue();
            System.out.println(key + " " + value);
                    
        }
    }
}
