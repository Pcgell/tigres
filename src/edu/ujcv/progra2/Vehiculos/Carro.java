package edu.ujcv.progra2.Vehiculos;

import edu.ujcv.progra2.Vehiculos.Aux.Motor;
import edu.ujcv.progra2.Vehiculos.Aux.TipoRuedas;

public class Carro extends VehiculoTerrestre {

    private String modelo;
    private String anio;
    private String color;
    private int numeroRuedas;

    private Motor motor;
    private TipoRuedas tipoRuedas;


    public Carro(String modelo,String anio, String color,
                  Motor motor, TipoRuedas tipoRuedas){
        numeroRuedas = 4;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.motor = motor;
        this.tipoRuedas = tipoRuedas;

    }

    @Override
    public String toString(){
        return  "Carro \nModelo: " + modelo + " \nColor: "+ color +" \nAnio: "+ anio;
    }

    @Override
    public void desplazar() {

    }

    @Override
    public int NumeroDeRuedas() {
        return this.numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public TipoRuedas getTipoRuedas() {
        return tipoRuedas;
    }

    public void setTipoRuedas(TipoRuedas tipoRuedas) {
        this.tipoRuedas = tipoRuedas;
    }
}
