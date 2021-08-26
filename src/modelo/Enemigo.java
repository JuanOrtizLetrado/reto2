/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HOME
 */
public class Enemigo extends Personaje {
    //Atributos
    private int evolucionesAplicadas;
    private int resistencia;

    //constructor usando e contructor del papa
    public Enemigo(String nombre, char sexo, double x, double y, double damage) {
       super(nombre,  sexo, x, y, damage);
       this.resistencia=1;
    }
    
    
    
    
    public void evolucionar(){
        if(this.getVida()<31 && this.evolucionesAplicadas==0){
            this.setDamage(this.getDamage()+20);
            this.evolucionesAplicadas++;
        }
        
        if(this.getVida()<11 && this.evolucionesAplicadas==1){
            this.resistencia++;
            this.evolucionesAplicadas++;
        }
        
    }
    
    @Override
    public void recibirImpacto(double d){
        if(d <=this.getVida()){
           this.setVida(this.getVida()-d);
        }else{
            this.setVida(0);
        }
    }

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return super.toString()+ " Evoluciones Aplicadas = " + evolucionesAplicadas + ", resistencia = " + resistencia;
    }
    
    
    
         
    
}
