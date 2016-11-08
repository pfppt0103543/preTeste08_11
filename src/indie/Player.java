/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indie;

/**
 *
 * @author UserPL022Pc02
 */
public class Player {
    int fatigue;
    int atack;
    int defense;
    char faceTo;

    public void pass(){
        
    }
       public void shoot(){
        
    }
    public Player(int fatigue, int atack, int defense, char faceTo) {
        this.fatigue = fatigue;
        this.atack = atack;
        this.defense = defense;
        this.faceTo = faceTo;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public char getFaceTo() {
        return faceTo;
    }

    public void setFaceTo(char faceTo) {
        this.faceTo = faceTo;
    }
    
    
}
