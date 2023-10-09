/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.pkg7;

import java.util.Scanner;
import java.util.HashMap;

public class Test7 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        HashMap<String, String> dic = new HashMap<String, String>();
        
        int num = Integer.parseInt(myObj.nextLine());
        
        for(int i=0; i < num; i++){
            String[] giria_certa = myObj.nextLine().split(" ");
            dic.put(giria_certa[0], giria_certa[1]);
        }
        String[] frase = myObj.nextLine().split(" ");
        for(int i=0;i<frase.length;i++){
            if(dic.containsKey(frase[i].toLowerCase())){
                frase[i]= dic.get(frase[i].toLowerCase());
            }
        }
        System.out.printf("%s", String.join(" ", frase));
        
    }
    
}
