/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_carlosmoncada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author calol
 */
public class Pais implements Serializable {

    String nombre;
    ArrayList<Nadador> nadadores = new ArrayList();
    int nummedallas;

    public Pais() {
    }

    public Pais(String nombre, int nummedallas) {
        this.nombre = nombre;
        this.nummedallas = nummedallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }
    public void añadirnadador(Nadador n){
    nadadores.add(n);
    
    }
    public int getNummedallas() {
        return nummedallas;
    }

    public void setNummedallas(int nummedallas) {
        this.nummedallas = nummedallas;
    }

    @Override
    public String toString() {
        return nombre;
    }


}
