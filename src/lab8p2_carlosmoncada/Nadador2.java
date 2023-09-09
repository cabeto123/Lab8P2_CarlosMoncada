/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_carlosmoncada;

import javax.swing.JProgressBar;

/**
 *
 * @author calol
 */
public class Nadador2 extends Thread {
   int distancia;
    JProgressBar pg;
    int random;
    
    public Nadador2(int distancia, JProgressBar pg) {
        this.distancia = distancia;
        this.pg = pg;
    }

    
    
    @Override
    public void run(){
        while (pg.getValue()<distancia) {            
          pg.setValue(pg.getValue()+random);
            try {
                Thread.sleep(0);
            } catch (Exception e) {
            }
        }
    
    
    
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public JProgressBar getPg() {
        return pg;
    }

    public void setPg(JProgressBar pg) {
        this.pg = pg;
    }  
}
