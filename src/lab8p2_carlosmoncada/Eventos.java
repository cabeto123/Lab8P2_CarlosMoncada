/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_carlosmoncada;

import java.io.Serializable;

/**
 *
 * @author calol
 */
public class Eventos implements Serializable {

    String estilo;
    String distancia;
    int records;

    public Eventos() {
    }
    
    public Eventos(String estilo, String distancia, int records) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.records = records;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return estilo;
    }

}
