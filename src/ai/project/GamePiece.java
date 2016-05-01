/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.project;

/**
 *
 * @author Sean
 */
public class GamePiece extends GameSquare {
    private Boolean isPiece = false;
    
    public void makeSquarePlayer(){
        isPiece = true;
    }
    
    public Boolean isPiece(){
        return isPiece;
    }
}
