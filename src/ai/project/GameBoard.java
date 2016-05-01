/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.project;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.swing.JButton;

/**
 *
 * @author Sean
 */
public class GameBoard extends javax.swing.JFrame {

    /**
     * Creates new form GameBoard
     */
    public GameBoard() {
        initComponents();
        setAllInitialRelativeLoc();
        setChoicesForPlayerColorChoice();
        storeAllSquaresInArr();
        setInitialPlayers();
        setActionForAllSquares();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jPanel1 = new javax.swing.JPanel();
        square0 = new ai.project.GameSquare();
        square1 = new ai.project.GameSquare();
        square2 = new ai.project.GameSquare();
        square3 = new ai.project.GameSquare();
        square4 = new ai.project.GameSquare();
        square5 = new ai.project.GameSquare();
        square6 = new ai.project.GameSquare();
        square7 = new ai.project.GameSquare();
        square8 = new ai.project.GameSquare();
        square9 = new ai.project.GameSquare();
        square10 = new ai.project.GameSquare();
        square11 = new ai.project.GameSquare();
        square12 = new ai.project.GameSquare();
        square13 = new ai.project.GameSquare();
        square14 = new ai.project.GameSquare();
        square15 = new ai.project.GameSquare();
        square16 = new ai.project.GameSquare();
        square17 = new ai.project.GameSquare();
        square18 = new ai.project.GameSquare();
        square19 = new ai.project.GameSquare();
        square20 = new ai.project.GameSquare();
        square21 = new ai.project.GameSquare();
        square22 = new ai.project.GameSquare();
        square23 = new ai.project.GameSquare();
        square24 = new ai.project.GameSquare();
        playerColorChoice = new java.awt.Choice();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 5, 1, 1));

        square0.setBackground(new java.awt.Color(204, 204, 204));
        square0.setOpaque(true);
        jPanel1.add(square0);

        square1.setBackground(new java.awt.Color(0, 0, 0));
        square1.setText("black_1");
        square1.setOpaque(true);
        jPanel1.add(square1);

        square2.setBackground(new java.awt.Color(0, 0, 0));
        square2.setText("black_2");
        square2.setOpaque(true);
        jPanel1.add(square2);

        square3.setBackground(new java.awt.Color(0, 0, 0));
        square3.setText("black_3");
        square3.setOpaque(true);
        jPanel1.add(square3);

        square4.setBackground(new java.awt.Color(204, 204, 204));
        square4.setOpaque(true);
        jPanel1.add(square4);

        square5.setText("white_1");
        square5.setOpaque(true);
        jPanel1.add(square5);

        square6.setBackground(new java.awt.Color(204, 204, 204));
        square6.setOpaque(true);
        jPanel1.add(square6);

        square7.setBackground(new java.awt.Color(204, 204, 204));
        square7.setOpaque(true);
        jPanel1.add(square7);

        square8.setBackground(new java.awt.Color(204, 204, 204));
        square8.setOpaque(true);
        jPanel1.add(square8);

        square9.setText("white_4");
        square9.setOpaque(true);
        jPanel1.add(square9);

        square10.setText("white_2");
        square10.setOpaque(true);
        jPanel1.add(square10);

        square11.setBackground(new java.awt.Color(204, 204, 204));
        square11.setOpaque(true);
        jPanel1.add(square11);

        square12.setBackground(new java.awt.Color(204, 204, 204));
        square12.setOpaque(true);
        jPanel1.add(square12);

        square13.setBackground(new java.awt.Color(204, 204, 204));
        square13.setOpaque(true);
        jPanel1.add(square13);

        square14.setText("white_5");
        square14.setOpaque(true);
        jPanel1.add(square14);

        square15.setText("white_3");
        square15.setOpaque(true);
        jPanel1.add(square15);

        square16.setBackground(new java.awt.Color(204, 204, 204));
        square16.setOpaque(true);
        jPanel1.add(square16);

        square17.setBackground(new java.awt.Color(204, 204, 204));
        square17.setOpaque(true);
        jPanel1.add(square17);

        square18.setBackground(new java.awt.Color(204, 204, 204));
        square18.setOpaque(true);
        jPanel1.add(square18);

        square19.setText("white_6");
        square19.setOpaque(true);
        jPanel1.add(square19);

        square20.setBackground(new java.awt.Color(204, 204, 204));
        square20.setOpaque(true);
        jPanel1.add(square20);

        square21.setBackground(new java.awt.Color(0, 0, 0));
        square21.setText("black_4");
        square21.setOpaque(true);
        jPanel1.add(square21);

        square22.setBackground(new java.awt.Color(0, 0, 0));
        square22.setText("black_5");
        square22.setOpaque(true);
        jPanel1.add(square22);

        square23.setBackground(new java.awt.Color(0, 0, 0));
        square23.setText("black_6");
        square23.setOpaque(true);
        jPanel1.add(square23);

        square24.setBackground(new java.awt.Color(204, 204, 204));
        square24.setOpaque(true);
        jPanel1.add(square24);

        label1.setText("Player Color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerColorChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerColorChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameBoard gb = new GameBoard();
//                gb.setChoicesForPlayerColorChoice();
//                gb.storeAllSquaresInArr();
//                gb.setActionForAllSquares();
                gb.setVisible(true);
//                new GameBoard().setVisible(true);
            }
        });
    }
    
    public void setActionForAllSquares(){
        for (JButton square : squares.values()){
            square.addActionListener(new SquareMovement());
        }
    }
    
    public void setChoicesForPlayerColorChoice(){
        playerColorChoice.addItem("White");
        playerColorChoice.addItem("Black");
        playerColorChoice.addItemListener(new ChoiceListener());
    }
    
    public static void setPlayerColorChoice(String color){
        playerColor = color;
    }
    
    public static String getPlayerColor(){
        return playerColor;
    }
    
    public static Boolean isPointAnEnemy(Point point, Set points){
        return points.contains(point);
    }
    public static int incrementIfPointIsPiece(Point currentPoint, int numOfPieces){
        if (squares.containsKey(currentPoint)){
            if (squares.get(currentPoint).isPiece())
                numOfPieces++;
        }
        return numOfPieces;
    }
    
    public static int getNumOfHorizontalPieces(GameSquare currentSquare){
        
        int currentCol = currentSquare.getRelativeY();
        int currentRow = currentSquare.getRelativeX();
        int numOfPiecesInHorizontal = 0;
        
        // count up from current square to edge & get total num of pieces in direction
        while (currentCol < COLUMNS){
            Point currentPoint = new Point(currentRow, currentCol);
            numOfPiecesInHorizontal = incrementIfPointIsPiece(currentPoint, numOfPiecesInHorizontal);
            currentCol++;
        }
        
        // count down from current square to edge & get total num of pieces in direction
        currentCol = currentSquare.getRelativeY();  
        while (currentCol > 0){
            currentCol--;     
            Point currentPoint = new Point(currentRow, currentCol);
            numOfPiecesInHorizontal = incrementIfPointIsPiece(currentPoint, numOfPiecesInHorizontal);
        }
        
        return numOfPiecesInHorizontal;
        
    }
    
    public static int getNumOfVerticalPieces(GameSquare currentSquare){
        int currentCol = currentSquare.getRelativeY();
        int currentRow = currentSquare.getRelativeX();
        int numOfVerticalPieces = 0;
        
        // count up from current square to edge & get total num of pieces in direction
        while (currentRow < ROWS){
            Point currentPoint = new Point(currentRow, currentCol);
            numOfVerticalPieces = incrementIfPointIsPiece(currentPoint, numOfVerticalPieces);
            currentRow++;
        }
        
        // count down from current square to edge & get total num of pieces in direction
        currentRow = currentSquare.getRelativeX();  
        while (currentRow > 0){
            currentRow--;     
            Point currentPoint = new Point(currentRow, currentCol);
            numOfVerticalPieces = incrementIfPointIsPiece(currentPoint, numOfVerticalPieces);
        }
        
        return numOfVerticalPieces;
    }
    
    public static int getNumOfDiagonalPieces(GameSquare currentSquare){
        int currentCol = currentSquare.getRelativeY();
        int currentRow = currentSquare.getRelativeX();
        int numOfDiagonalPieces = 0;
        while (currentRow < ROWS && currentCol < COLUMNS){
            Point currentPoint = new Point(currentRow, currentCol);
            numOfDiagonalPieces = incrementIfPointIsPiece(currentPoint, numOfDiagonalPieces);
            currentRow++; currentCol++;
        }
        
        currentRow = currentSquare.getRelativeX();  
        currentCol = currentSquare.getRelativeY();
        while (currentRow > 0 && currentCol > 0){
            currentRow--;  currentCol--;    
            Point currentPoint = new Point(currentRow, currentCol);
            numOfDiagonalPieces = incrementIfPointIsPiece(currentPoint, numOfDiagonalPieces);
        }
        
        currentRow = currentSquare.getRelativeX();  
        currentCol = currentSquare.getRelativeY();
        while (currentRow > 0 && currentCol < COLUMNS-1){
            currentRow--;  currentCol++;    
            Point currentPoint = new Point(currentRow, currentCol);
            numOfDiagonalPieces = incrementIfPointIsPiece(currentPoint, numOfDiagonalPieces);
        }
        
        currentRow = currentSquare.getRelativeX();  
        currentCol = currentSquare.getRelativeY();
        while (currentRow < ROWS-1 && currentCol > 0){
            currentRow++;  currentCol--;    
            Point currentPoint = new Point(currentRow, currentCol);
            numOfDiagonalPieces = incrementIfPointIsPiece(currentPoint, numOfDiagonalPieces);
        }
        return numOfDiagonalPieces;
    }
    // TODO - think about switching the check num of pieces in diff directions to simply looping through the players arrayList
    public static void getValidMovesInHorizontal(GameSquare piece, int numOfHorizontalPieces, LinkedHashMap<GameSquare, Boolean> validMoves){
        int currentCol = piece.getRelativeY();
        int currentRow = piece.getRelativeX();
//        if(playerColor.equals("White"))
//                System.out.println("Color is: " + playerColor);
        // check if friendly in location - BAD
        int rightBoundary = currentCol + numOfHorizontalPieces;
        int leftBoundary  = currentCol - numOfHorizontalPieces;
        rightBoundary = (rightBoundary > (COLUMNS-1)) ? -1 : rightBoundary;
        leftBoundary  = (leftBoundary < 0) ? -1 : leftBoundary;
        
        Point rightMove, leftMove;
        if (rightBoundary != -1)
            rightMove = new Point(currentRow, rightBoundary);
        else
            rightMove = null;
        
        if (leftBoundary != -1)
            leftMove  = new Point(currentRow, leftBoundary);
        else 
            leftMove = null;
        
        if (playerPieces.containsKey(rightMove))
            rightMove = null;
        if (playerPieces.containsKey(leftMove))
            leftMove = null;
        
        if (!((rightMove==null) && (leftMove==null)) ){ // checking to see if they 
            // check if enemies in the way to the location - BAD
            currentCol--; 
            while(currentCol > leftBoundary && (leftMove != null)){
                Point currentPoint = new Point(currentRow, currentCol);
                if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                    leftMove = null;
                    break;
                }
                currentCol--;
            }
            
            currentCol = piece.getRelativeY();
            currentCol++;
            while(currentCol < rightBoundary && (rightMove != null)){
                Point currentPoint = new Point(currentRow, currentCol);
                if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                    rightMove = null;
                    break;
                }
                currentCol++;
            }
            
            if ( (rightMove == null) && (leftMove == null) )
                return;
            
            // check if Enemy in location - doesn't really matter at this point... just make sure to check when moving so the GUI can be updated accordingly
            if (leftMove != null){
                Boolean isEnemyInLoc = (isPointAnEnemy(leftMove, enemyPieces.keySet())) ? true : false;
                validMoves.put(squares.get(leftMove), isEnemyInLoc);
            }
                    
            if (rightMove != null){
                Boolean isEnemyInLoc = (isPointAnEnemy(rightMove, enemyPieces.keySet())) ? true : false;
                validMoves.put(squares.get(rightMove), isEnemyInLoc);
            } 
        }
    }
    
    public static void getValidMovesInVertical(GameSquare piece, int numOfVerticalPieces, LinkedHashMap<GameSquare, Boolean> validMoves){
        int currentCol = piece.getRelativeY();
        int currentRow = piece.getRelativeX();
//        if(playerColor.equals("White"))
//                System.out.println("Color is: " + playerColor);
        // check if friendly in location - BAD
        int bottomBoundary = currentRow + numOfVerticalPieces;
        int topBoundary    = currentRow - numOfVerticalPieces;
        bottomBoundary = (bottomBoundary > (ROWS-1)) ? -1 : bottomBoundary;
        topBoundary  = (topBoundary < 0) ? -1 : topBoundary;
        
        Point topMove, bottomMove;
        if (topBoundary != -1)
            topMove = new Point(topBoundary, currentCol);
        else
            topMove = null;
        
        if (bottomBoundary != -1)
            bottomMove  = new Point(bottomBoundary, currentCol);
        else 
            bottomMove = null;
        
        if (playerPieces.containsKey(topMove))
            topMove = null;
        if (playerPieces.containsKey(bottomMove))
            bottomMove = null;
        
        if (!((topMove==null) && (bottomMove==null)) ){ // checking to see if they 
            // check if enemies in the way to the location - BAD
            currentRow--; 
            while(currentRow > topBoundary && (topMove != null)){
                Point currentPoint = new Point(currentRow, currentCol);
                if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                    topMove = null;
                    break;
                }
                currentRow--;
            }
            
            currentRow = piece.getRelativeX();
            currentRow++;
            while(currentCol < bottomBoundary && (bottomMove != null)){
                Point currentPoint = new Point(currentRow, currentCol);
                if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                    bottomMove = null;
                    break;
                }
                currentRow++;
            }
            
            if ( (bottomMove == null) && (topMove == null) )
                return;
            
            // check if Enemy in location - doesn't really matter at this point... just make sure to check when moving so the GUI can be updated accordingly
            if (topMove != null){
                Boolean isEnemyInLoc = (isPointAnEnemy(topMove, enemyPieces.keySet())) ? true : false;
                validMoves.put(squares.get(topMove), isEnemyInLoc);
            }
                    
            if (bottomMove != null){
                Boolean isEnemyInLoc = (isPointAnEnemy(bottomMove, enemyPieces.keySet())) ? true : false;
                validMoves.put(squares.get(bottomMove), isEnemyInLoc);
            } 
        }
    }

    public static void getValidMovesInDiagonal(GameSquare piece, int numOfDiagonalPieces, LinkedHashMap<GameSquare, Boolean> validMoves){
        int currentCol = piece.getRelativeY();
        int currentRow = piece.getRelativeX();

        int highBoundedCol = currentCol + numOfDiagonalPieces;
        int lowBoundedCol  = currentCol - numOfDiagonalPieces;
        int highBoundedRow = currentRow + numOfDiagonalPieces;
        int lowBoundedRow  = currentRow - numOfDiagonalPieces;
        
        highBoundedCol = (highBoundedCol > (COLUMNS-1)) ? -1 : highBoundedCol;
        lowBoundedCol  = (lowBoundedCol < 0)            ? -1 : lowBoundedCol;
        
        highBoundedRow = (highBoundedRow > (ROWS-1)) ? -1 : highBoundedRow;
        lowBoundedRow  = (lowBoundedRow < 0)         ? -1 : lowBoundedRow;
        
        Point topLeftMove, topRightMove, bottomRightMove, bottomLeftMove;
        if ( highBoundedCol != -1 && lowBoundedRow != -1 )
            topRightMove = new Point(lowBoundedRow, highBoundedCol);
        else
            topRightMove = null;
        
        if ( highBoundedCol != -1 && highBoundedRow != -1 )
            bottomRightMove  = new Point(highBoundedRow, highBoundedCol);
        else 
            bottomRightMove = null;
        
        if ( lowBoundedCol != -1 && lowBoundedRow != -1 )
            topLeftMove = new Point(lowBoundedRow, lowBoundedCol);
        else
            topLeftMove = null;
        
        if ( lowBoundedCol != -1 && highBoundedRow != -1 )
            bottomLeftMove = new Point(highBoundedRow, lowBoundedCol);
        else
            bottomLeftMove = null;
        
        if (playerPieces.containsKey(topRightMove))
            topRightMove = null;
        if (playerPieces.containsKey(bottomRightMove))
            bottomLeftMove = null;
        if (playerPieces.containsKey(bottomLeftMove))
            bottomLeftMove = null;
        if (playerPieces.containsKey(topLeftMove))
            bottomLeftMove = null;
        
        if (!((topRightMove==null) && (bottomRightMove==null) && (bottomLeftMove==null) && (topLeftMove==null)) ){ // checking to see if they 
            // check if enemies on the way to topRight loc
            
            if (topRightMove != null){
                currentRow--;
                currentCol++;
                while( (currentCol < highBoundedCol) && (currentRow > lowBoundedRow)){
                    Point currentPoint = new Point(currentRow, currentCol);
                    if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                        topRightMove = null;
                        break;
                    }
                    currentRow--;
                    currentCol++;
                }
            }
            
            currentCol = piece.getRelativeY();
            currentRow = piece.getRelativeX();
            
            // checking if enemies exist on path to bottomRight
            if (bottomRightMove != null){
                currentRow++;
                currentCol++;
                while( (currentCol < highBoundedCol) && (currentRow < highBoundedRow)){
                    Point currentPoint = new Point(currentRow, currentCol);
                    if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                        topRightMove = null;
                        break;
                    }
                    currentRow++;
                    currentCol++;
                }
            }
            
            // checking if enemies exist on path to bottomLeft
            if (bottomLeftMove != null){
                currentRow++;
                currentCol++;
                while( (currentCol < highBoundedCol) && (currentRow < highBoundedRow)){
                    Point currentPoint = new Point(currentRow, currentCol);
                    if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                        topRightMove = null;
                        break;
                    }
                    currentRow++;
                    currentCol++;
                }
            }
            
            currentRow = piece.getRelativeX();
            currentRow++;
            while(currentCol < bottomBoundary && (bottomMove != null)){
                Point currentPoint = new Point(currentRow, currentCol);
                if(isPointAnEnemy(currentPoint, enemyPieces.keySet())){ // cannot jump enemy
                    bottomMove = null;
                    break;
                }
                currentRow++;
            }
            
            if ( (bottomMove == null) && (topMove == null) )
                return;
            
            // check if Enemy in location - doesn't really matter at this point... just make sure to check when moving so the GUI can be updated accordingly
            if (topMove != null){
                Boolean isEnemyInLoc = (isPointAnEnemy(topMove, enemyPieces.keySet())) ? true : false;
                validMoves.put(squares.get(topMove), isEnemyInLoc);
            }
                    
            if (bottomMove != null){
                Boolean isEnemyInLoc = (isPointAnEnemy(bottomMove, enemyPieces.keySet())) ? true : false;
                validMoves.put(squares.get(bottomMove), isEnemyInLoc);
            } 
        }
    }
    
    public static LinkedHashMap<GameSquare, Boolean> getListOfPossibleMoves(GameSquare currentSquare){
        LinkedHashMap<GameSquare, Boolean> validMoves = new LinkedHashMap<>();
        int numHorizontalCheckers = getNumOfHorizontalPieces(currentSquare);
        int numVerticalCheckers   = getNumOfVerticalPieces(currentSquare);
        int numDiagonalCheckers   = getNumOfDiagonalPieces(currentSquare);
        
        getValidMovesInHorizontal(currentSquare, numHorizontalCheckers, validMoves);
//        getValidMovesInCertainDirection(currentSquare, numVerticalCheckers, validMoves, "horizontal");
//        getValidMovesInCertainDirection(currentSquare, numVerticalCheckers, validMoves, "vertical");
        getValidMovesInVertical(currentSquare,   numVerticalCheckers,   validMoves);
        //getValidMovesInDiagonal(numDiagonalCheckers, validMoves); 
        for (GameSquare square : validMoves.keySet()){
            System.out.println("Sqaure Loc: " + square.getRelativeLoc() + " color: " + square.pieceColor());
        }
        return validMoves;
    }
    
    public static void setGrayBoxPropertiesFor(GameSquare oldLoc){
        oldLoc.markSquareAsEmpty();
        oldLoc.setText("");
        oldLoc.setPieceColor("none");
        oldLoc.setBackground(Color.GRAY);
    }
    
    public static void updateBoxColoring(GameSquare oldLoc, GameSquare newLoc){
        newLoc.setBackground(oldLoc.getBackground());
        newLoc.setText(oldLoc.getText());
//        newLoc.setRelativeLoc(oldLoc.getRelativeX(), oldLoc.getRelativeY()); The new loc should retain its own location 
        newLoc.setPieceColor(oldLoc.pieceColor());
        newLoc.makeSquarePlayer();
        setGrayBoxPropertiesFor(oldLoc);
    }
    
    public static void move(GameSquare oldLoc, GameSquare newLoc){
        // Assumes the movement from old to new locations is valid... will only check to see if the movement is eating another player or not
        
        // handle player to enemy loc
        Boolean playerEatingEnemy = SquareMovement.isEnemy(newLoc);
        if (playerEatingEnemy){
            int playersEatCount = (oldLoc.pieceColor().equals("White")) ? numPiecesWhiteAte : numPiecesBlackAte;
            playersEatCount++;
            enemyPieces.remove(newLoc);
        }
        
        playerPieces.remove(oldLoc.getRelativeLoc());
        playerPieces.put(newLoc.getRelativeLoc(), newLoc);
        
        updateBoxColoring(oldLoc, newLoc);
        
        // player to empty spot
    }
    
    public void setAllInitialRelativeLoc(){
        // First Row
        square0.setRelativeLoc(0,0);
        square1.setRelativeLoc(0,1);
        square2.setRelativeLoc(0,2);
        square3.setRelativeLoc(0,3);
        square4.setRelativeLoc(0,4);
        
        // Second Row
        square5.setRelativeLoc(1,0);
        square6.setRelativeLoc(1,1);
        square7.setRelativeLoc(1,2);
        square8.setRelativeLoc(1,3);
        square9.setRelativeLoc(1,4);
        
        // Third Row
        square10.setRelativeLoc(2,0);
        square11.setRelativeLoc(2,1);
        square12.setRelativeLoc(2,2);
        square13.setRelativeLoc(2,3);
        square14.setRelativeLoc(2,4);
        
        // Fourth Row
        square15.setRelativeLoc(3,0);
        square16.setRelativeLoc(3,1);
        square17.setRelativeLoc(3,2);
        square18.setRelativeLoc(3,3);
        square19.setRelativeLoc(3,4);
        
        // Fourth Row
        square20.setRelativeLoc(4,0);
        square21.setRelativeLoc(4,1);
        square22.setRelativeLoc(4,2);
        square23.setRelativeLoc(4,3);
        square24.setRelativeLoc(4,4);
    }
    public void storeAllSquaresInArr(){
        squares.put(square0.getRelativeLoc(), square0);
        squares.put(square1.getRelativeLoc(), square1);
        squares.put(square2.getRelativeLoc(), square2);
        squares.put(square3.getRelativeLoc(), square3);
        squares.put(square4.getRelativeLoc(), square4);
        squares.put(square5.getRelativeLoc(), square5);
        squares.put(square6.getRelativeLoc(), square6);
        squares.put(square7.getRelativeLoc(), square7);
        squares.put(square8.getRelativeLoc(), square8);
        squares.put(square9.getRelativeLoc(), square9);
        squares.put(square10.getRelativeLoc(), square10);
        squares.put(square11.getRelativeLoc(), square11);
        squares.put(square12.getRelativeLoc(), square12);
        squares.put(square13.getRelativeLoc(), square13);
        squares.put(square14.getRelativeLoc(), square14);
        squares.put(square15.getRelativeLoc(), square15);
        squares.put(square16.getRelativeLoc(), square16);
        squares.put(square17.getRelativeLoc(), square17);
        squares.put(square18.getRelativeLoc(), square18);
        squares.put(square19.getRelativeLoc(), square19);
        squares.put(square20.getRelativeLoc(), square20);
        squares.put(square21.getRelativeLoc(), square21);
        squares.put(square22.getRelativeLoc(), square22);
        squares.put(square23.getRelativeLoc(), square23);
        squares.put(square24.getRelativeLoc(), square24);

    }
    
    public void setInitialPlayers(){
        // Adding all initial white players
        blackPlayers.put(square1.getRelativeLoc(), square1);
        blackPlayers.put(square2.getRelativeLoc(), square2);
        blackPlayers.put(square3.getRelativeLoc(), square3);
        
        blackPlayers.put(square21.getRelativeLoc(), square21);
        blackPlayers.put(square22.getRelativeLoc(), square22);
        blackPlayers.put(square23.getRelativeLoc(), square23);
        
        // Adding all initial black players
        whitePlayers.put(square5.getRelativeLoc(), square5);
        whitePlayers.put(square10.getRelativeLoc(), square10);
        whitePlayers.put(square15.getRelativeLoc(), square15);
        
        whitePlayers.put(square9.getRelativeLoc(), square9);
        whitePlayers.put(square14.getRelativeLoc(), square14);
        whitePlayers.put(square19.getRelativeLoc(), square19);
        
        for (GameSquare whitePlayer : whitePlayers.values()){
            whitePlayer.makeSquarePlayer();
            whitePlayer.setPieceColor("White");
        }
        
        for (GameSquare blackPlayer : blackPlayers.values()){
            blackPlayer.makeSquarePlayer();
            blackPlayer.setPieceColor("Black");
        }
        
    }
    
    public static void setCorrespondingGameConfigs(){
        playerPieces = (playerColor.equals("White")) ? whitePlayers : blackPlayers;
        enemyPieces  = (playerColor.equals("White")) ? blackPlayers : whitePlayers;
        enemyColor   = (playerColor.equals("White")) ? "Black" : "White";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Choice playerColorChoice;
    private ai.project.GameSquare square0;
    private ai.project.GameSquare square1;
    private ai.project.GameSquare square10;
    private ai.project.GameSquare square11;
    private ai.project.GameSquare square12;
    private ai.project.GameSquare square13;
    private ai.project.GameSquare square14;
    private ai.project.GameSquare square15;
    private ai.project.GameSquare square16;
    private ai.project.GameSquare square17;
    private ai.project.GameSquare square18;
    private ai.project.GameSquare square19;
    private ai.project.GameSquare square2;
    private ai.project.GameSquare square20;
    private ai.project.GameSquare square21;
    private ai.project.GameSquare square22;
    private ai.project.GameSquare square23;
    private ai.project.GameSquare square24;
    private ai.project.GameSquare square3;
    private ai.project.GameSquare square4;
    private ai.project.GameSquare square5;
    private ai.project.GameSquare square6;
    private ai.project.GameSquare square7;
    private ai.project.GameSquare square8;
    private ai.project.GameSquare square9;
    // End of variables declaration//GEN-END:variables
    private static LinkedHashMap<Point,GameSquare> squares = new LinkedHashMap<>();
    private static LinkedHashMap<Point,GameSquare> whitePlayers  = new LinkedHashMap<>();
    private static LinkedHashMap<Point,GameSquare> blackPlayers  = new LinkedHashMap<>();
    private static LinkedHashMap<Point, GameSquare> playerPieces = new LinkedHashMap();
    private static LinkedHashMap<Point, GameSquare> enemyPieces  = new LinkedHashMap();
    private static String playerColor = "White";
    private static String enemyColor  = "Black";
    
    
    public static final int ROWS = 5;
    public static final int COLUMNS = 5;
    public static int numPiecesWhiteAte = 0;
    public static int numPiecesBlackAte = 0;
}

class SquareMovement implements ActionListener {
    private static Boolean firstClick = true;
    private static GameSquare previousClickedPiece;
    // isEnemyAtLoc, theValidMove
    private static LinkedHashMap<GameSquare, Boolean>  validMoves;
    
    public static Boolean isEnemy(GameSquare piece){
        return validMoves.get(piece);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        GameSquare square = (GameSquare) ae.getSource();
        
        if(!(square.pieceColor().equals(GameBoard.getPlayerColor())) && firstClick){
            System.out.println("Not your color to move... please try again");
            return;
        }
        
        if (square.isPiece() && square.pieceColor().equals(GameBoard.getPlayerColor())){
            if (firstClick){
                System.out.println("First click... getting list of possible moves");
                validMoves = GameBoard.getListOfPossibleMoves(square);
                firstClick = false;
                // highlight all valid moves... optional
                previousClickedPiece = square;
                return;
            }else{
                if (square.equals(previousClickedPiece)){
                    System.out.println("RESETTING CONTROL...");
                    firstClick = true;
                    return;
                }
            }

            System.out.println("Not a valid move... click piece to move again");
        }
        
        if (firstClick){
            System.out.println("Please click your piece to move");
            return;
        }
        
        
        if (validMoves.containsKey(square)){
            System.out.println("Valid Square to move to");   
            GameBoard.move(previousClickedPiece, square);
            firstClick = true;
            //move the piece
        }else{
            System.out.println("Not a valid move... please try again or click on the same piece to reset");
            return;
        }
            
//        System.out.println("Player Color: " + GameBoard.getPlayerColor());
        
        
//        System.out.println("Screen Loc: " +  square.getLocationOnScreen());
//        System.out.println("Screen Loc: " +  square.getRelativeX() + "," + square.getRelativeY());
//        System.out.println("IsPlayer " + square.isPiece());
        
//        getValidMoves(button)
    }
}

class ChoiceListener implements ItemListener{
    
    @Override
    public void itemStateChanged(ItemEvent e){
        GameBoard.setPlayerColorChoice((String) e.getItem());
        Choice colorChoice = (Choice) e.getSource();
        colorChoice.setEnabled(false);
        GameBoard.setCorrespondingGameConfigs();
    }
}