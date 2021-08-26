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
public class Personaje {
    private String nombre;
    private char sexo;
    protected double posicionX,posicionY;
    private double damage;
    private double vida;

    //Contructor
    public Personaje(String nombre, char sexo, double x, double y, double damage) {
        this.nombre=nombre;
        this.sexo=sexo;
        this.posicionX=x;
        this.posicionY=y;
        this.damage=damage;
        
        this.vida=100;
        
    }
    
    
    
    
    public void golpear(Personaje p){
        p.recibirImpacto(this.damage/this.calcularDistanciaRespectoPersonaje(p));
       
    }
    
    public void recibirImpacto(double d){
        if(d <=this.getVida()){
           this.setVida(this.getVida()-d);
        }else{
            this.setVida(0);
        }
       
        
    }
    public double calcularDistanciaRespectoPersonaje(Personaje p){
        
        return Math.abs(
                Math.sqrt(
                Math.pow(this.posicionX - p.posicionX,2 )+
                Math.pow(this.posicionY - p.posicionY, 2)));
    }

   public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
    
    
    //Metodos que se insertan
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        if (this.vida>=0 && this.vida<101){
         this.vida = vida;   
        }else{
            this.vida=0;
        }
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", sexo=" + sexo + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", damage=" + damage + ", vida=" + vida ;
    }
    
    
    
    
            
    
}
