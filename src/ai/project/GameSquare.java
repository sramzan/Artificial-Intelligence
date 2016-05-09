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
    Point relativeLoc = new Point(0,0);
    private Boolean isPiece = false;
    String pieceColor = "none";
    
    public void setRelativeLoc(int x, int y){
        relativeLoc.setLocation(x, y);
    }
    
    public void makeSquarePlayer(){
        isPiece = true;
    }
    
    public void markSquareAsEmpty(){
        isPiece = false;
    }
    
    public int getRelativeX(){
        return (int) relativeLoc.getX();
    }
    
    public int getRelativeY(){
        return (int) relativeLoc.getY();
    }
    
    public Boolean isPiece(){
        return isPiece;
    }
    public String pieceColor(){
        return pieceColor;
    }
    
    public void setPieceColor(String color){
        pieceColor = color;
    }
    
    public Point getRelativeLoc(){
        return relativeLoc;
    }
    
    @Override
    public boolean equals(Object object){
        return ( this.relativeLoc.equals(((GameSquare) object).getRelativeLoc()) );
    }
    
    @Override 
    public int hashCode(){
        return (int) (relativeLoc.getX() + relativeLoc.getY());
    }
    
    public GameSquare clone() throws CloneNotSupportedException {
        return (GameSquare) super.clone();
    }

}
