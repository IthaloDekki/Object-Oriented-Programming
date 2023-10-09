/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

public class Retangulo {
    private int comprimento=1, largura=1;
    
    public int perimetro(){
        return  (2 * (comprimento + largura));
    }
    public int área(){
        return (comprimento * largura);
    }
    
    public void setComprimento_setLargura(int new_comprimento, int new_largura){
        if(new_comprimento >0 && new_comprimento < 20){
            this.comprimento = new_comprimento;
        }else{
            this.comprimento = 1;
        }
        
        if(new_largura > 0 && new_largura < 20){
            this.largura = new_largura;
        }else{
            this.largura = 1;
        }
    }
    
    public int getComprimento(){
        return comprimento;
    }
    public int getLargura(){
        return largura;
    }
    
}

