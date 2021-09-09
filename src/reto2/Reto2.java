/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import modelo.*;

/**
 *
 * @author HOME
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador gamer = new Jugador("Juan",'m',0,5,100);
        Enemigo enemy = new Enemigo("Bitter",'f',0,0,80);
        System.out.println(" 1.\n "+gamer+"\n \n"+enemy+"\n");
        gamer.golpear(enemy);
        gamer.golpear(enemy);
        gamer.moverDerecha(10);
        gamer.moverAbajo(5);
        System.out.println("2.\n "+gamer+"\n \n"+enemy+"\n");
        
        enemy.golpear(gamer);
        enemy.golpear(gamer);
        gamer.recogerBotiquin();
        System.out.println("3.\n "+gamer+"\n \n"+enemy+"\n");
        
        gamer.usarBotiquin();
        gamer.usarBotiquin();
        gamer.golpear(enemy);
        gamer.golpear(enemy);
        gamer.golpear(enemy);
        System.out.println("4.\n "+gamer+"\n \n"+enemy+"\n");
        
        enemy.golpear(gamer);
        enemy.golpear(gamer);
        System.out.println("5.\n "+gamer+"\n \n"+enemy+"\n");
        
        gamer.golpear(enemy);
        gamer.golpear(enemy);
        System.out.println("6.\n "+gamer+"\n \n"+enemy+"\n");
        
        gamer.golpear(enemy);
        gamer.golpear(enemy);
        gamer.golpear(enemy);
        System.out.println("7.\n "+gamer+"\n \n"+enemy+"\n");
        
         
        
        
        
        
        
        
        
        
    }
    
}
