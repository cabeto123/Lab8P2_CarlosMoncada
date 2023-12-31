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
public class Nadador1 extends Thread {
    int distancia;
    JProgressBar pg;
    int random=0;
    boolean ganador;
    
    public Nadador1(int distancia, JProgressBar pg) {
        this.distancia = distancia;
        this.pg = pg;
        
    }

    
    
    @Override
    public void run(){
        while (pg.getValue()<distancia) {            
          pg.setValue(pg.getValue()+random);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            if (pg.getValue()==distancia) {
               ganador=true; 
               break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    
    
    
    }
    

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
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
