/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ana Luiza
 */ 
public class Veiculo {
    String placa;
    String cor;
    int anoFabricacao;
    int anoModelo;
    double valor;
    Marca marca;
    Modelo modelo;

    public Veiculo(String placa, String cor, int anoFabricacao, int anoModelo, double valor, Marca marca, Modelo modelo) {
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.valor = valor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public double getValor() {
        return valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", cor=" + cor + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", valor=" + valor + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
}

