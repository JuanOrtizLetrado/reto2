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
public class Jugador extends Personaje {
    //Atributos 
    private int numeroBotiquines;
    
    //constructor usando e contructor del papa
    
   public Jugador(String nombre, char sexo, double x, double y, double damage){
     super(nombre, sexo, x,  y, damage);  
   } 

    //Metodos
    public void moverDerecha(double d) {
        this.posicionX +=d;
    }
   
   public void moverIzquierda(double d){
      this.posicionX -=d; 
   } 
   
   public void moverAbajo(double d){
       this.posicionY-=d; 
   } 
   
   public void moverArriba(double d){
       this.posicionY+=d;   
   } 
   
   public void recogerBotiquin(){
       this.numeroBotiquines++;
   }
   
   public void usarBotiquin(){
       if(this.numeroBotiquines>0){
           this.numeroBotiquines--;
           double condicion=this.getVida()+5;
           if(condicion<101){
              this.setVida(this.getVida()+5); 
           }else{
               this.setVida(100);
           }
           
               
       }
   }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
   
   
   
   public void golpear(Enemigo p){
     super.golpear(p);
     p.evolucionar();
   }

    @Override
    public String toString() {
        return super.toString()+ " Numero de Botiquines = " + numeroBotiquines ;
    }
  
   
    
}
