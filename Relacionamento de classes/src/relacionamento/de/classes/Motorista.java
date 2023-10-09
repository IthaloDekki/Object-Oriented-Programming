/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamento.de.classes;

public class Motorista {
    private int idMotorista;
    private String nome;
    private String telefone;
    private String CHN;
    
    
    public Motorista(int idMotorista, String nome, String telefone, String CNH){
        this.idMotorista = idMotorista;
        this.nome = nome;
        this.telefone = telefone;
        this.CHN = CNH;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int newidMotorista) {
        this.idMotorista = newidMotorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newnome) {
        this.nome = newnome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String newtelefone) {
        this.telefone = newtelefone;
    }

    public String getCHN() {
        return CHN;
    }

    public void setCHN(String newCHN) {
        this.CHN = newCHN;
    }
    
    
}
