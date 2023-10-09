/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamento.de.classes;

public class Cliente {
    private int idCliente;
    private String RG;
    private String CPF;
    private String nome;
    private String telefone;
    
    
    public Cliente(int idCliente, String RG, String CPF, String nome, String telefone){
        this.idCliente = idCliente;
        this.RG = RG;
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int newidCliente) {
        this.idCliente = newidCliente;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String newRG) {
        this.RG = newRG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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
    
    
}
