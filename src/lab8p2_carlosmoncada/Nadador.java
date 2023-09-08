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
public class Nadador implements Serializable{
    String nombre;
    Pais nacionalidad;
    int edad;
    double estatura;
    String estilonatacion;
    String distancia;
    int tiempomasrapido;
    int nummedallas;

    public Nadador(String nombre, Pais nacionalidad, int edad, double estatura, String estilonatacion, String distancia, int tiempomasrapido, int nummedallas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.estilonatacion = estilonatacion;
        this.distancia = distancia;
        this.tiempomasrapido = tiempomasrapido;
        this.nummedallas = nummedallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }



    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getEstilonatacion() {
        return estilonatacion;
    }

    public void setEstilonatacion(String estilonatacion) {
        this.estilonatacion = estilonatacion;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

   
    public int getTiempomasrapido() {
        return tiempomasrapido;
    }

    public void setTiempomasrapido(int tiempomasrapido) {
        this.tiempomasrapido = tiempomasrapido;
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
