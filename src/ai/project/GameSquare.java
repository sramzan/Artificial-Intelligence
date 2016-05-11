/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.project;

import java.awt.Point;
import javax.swing.JButton;

/**
 *
 * @author Sean
 */
public class GameSquare extends JButton implements Cloneable{
    /*
     - Custom button class for use with the Lines of Action game
     - A GameSquare will kepp track of its
        - Color
        - Whether or not it is a playable piece OR a square that can be moved into
        - It's location on the board
     - It will be used to update the GUI as well
    */
    Point relativeLoc = new Point(0,0); // a Point for knowing where a square is located on the board
    private Boolean isPiece = false;
    String pieceColor = "none"; // "none" is for a square that is not a black or white piece
    
    public void setRelativeLoc(int x, int y){
        /*
         - @param1 : x location
         - @param2 : y location
         - Sets the x & y location of the square in space on the board
        */
        relativeLoc.setLocation(x, y);
    }
    
    public void makeSquarePlayer(){
        // marks the square as a playable piece
        isPiece = true;
    }
    
    public void markSquareAsEmpty(){
        // marks the square as a regular square and NOT a piece
        isPiece = false;
    }
    
    public int getRelativeX(){
        // return the relative x location of the square/piece
        return (int) relativeLoc.getX();
    }
    
    public int getRelativeY(){
        // return the relative y location of the square/piece
        return (int) relativeLoc.getY();
    }
    
    public Boolean isPiece(){
        // returns whether the specific square is a playable piece or not
        return isPiece;
    }
    public String pieceColor(){
        // returns the color of the square in question
        return pieceColor;
    }
    
    public void setPieceColor(String color){
        // sets the square's color (should be "Black" or "White" is made into a playable piece
        pieceColor = color;
    }
    
    public Point getRelativeLoc(){
        // returns the relative location of the square on the game board
        return relativeLoc;
    }
    
    @Override
    public boolean equals(Object object){
        // a function defining that two squares are equal if they have the same relative location
        return ( this.relativeLoc.equals(((GameSquare) object).getRelativeLoc()) );
    }
    
    @Override 
    public int hashCode(){
        // a hash code for storing the squares in a linkedhashmap... the hash is defined as the squares sum of x & y position
        return (int) (relativeLoc.getX() + relativeLoc.getY());
    }
    
    public GameSquare clone() throws CloneNotSupportedException {
        // mandatory implementation to implement Cloneable for enabling deep copies
        return (GameSquare) super.clone();
    }

}
