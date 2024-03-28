package com.trybe.java;

/**
 * Classe.
 **/
public class SmartHouse {

    public boolean lampadaLigada;

    public SmartHouse() {
        this.lampadaLigada = false;
    }

    public void ligarLampada() {
        this.lampadaLigada = true;
    }

    public void desligarLampada() {
        this.lampadaLigada = false;
    }

    public boolean isLampadaLigada() {
        return lampadaLigada;
    }
}

