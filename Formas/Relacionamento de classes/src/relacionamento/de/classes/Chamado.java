/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamento.de.classes;


public class Chamado {
    private int idChamado;
    private String data, tipo, origem, destino;
    private double totalChamado, partida, retorno, inicial, chegada;
    private Cliente cliente;
    private Motorista motora;
    private Veiculos carro;
    
    public Chamado(int idChamado, String data, String tipo, String origem, String destino,double partida, double retorno,
                    double inicial, double chegada, double totalChamado){
    
        this.idChamado = idChamado;
        this.data = data;
        this.tipo = tipo;
        this.origem= origem;
        this.destino = destino;
        this.partida = partida;
        this.retorno = retorno;
        this.inicial = inicial;
        this.chegada = chegada;
        this.totalChamado = totalChamado;
       
    }

    public int getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(int idChamado) {
        this.idChamado = idChamado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getTotalChamado() {
        return totalChamado;
    }

    public void setTotalChamado(double totalChamado) {
        this.totalChamado = totalChamado;
    }

    public double getPartida() {
        return partida;
    }

    public void setPartida(double partida) {
        this.partida = partida;
    }

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }

    public double getInicial() {
        return inicial;
    }

    public void setInicial(double inicial) {
        this.inicial = inicial;
    }

    public double getChegada() {
        return chegada;
    }

    public void setChegada(double chegada) {
        this.chegada = chegada;
    }

    
    
    
    
    
}
