
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

//you will need to implement two functions in this file.
public class Piece {
    private final boolean color;
    private BufferedImage img;
    
    public Piece(boolean isWhite, String img_file) {
        this.color = isWhite;
        
        try {
            if (this.img == null) {
              this.img = ImageIO.read(getClass().getResource(img_file));
            }
          } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
          }
    }
    
    

    
    public boolean getColor() {
        return color;
    }
    
    public Image getImage() {
        return img;
    }
    
    public void draw(Graphics g, Square currentSquare) {
        int x = currentSquare.getX();
        int y = currentSquare.getY();
        
        g.drawImage(this.img, x, y, null);
    }
    
    
    // PreCondition: Requires a square grid structure as well as a Square instance that represents the current Piece's initial starting point.
    // PostCondition: Returns an Arraylist with square instances that are the places that the piece controls and could capture or is currently defending. 
    public ArrayList<Square> getControlledSquares(Square[][] b, Square start) {
      ArrayList<Square> moves = new ArrayList<Square>();
      // Rook Movement
      System.out.println("this was called");

      // Vertical Movement
      
      for (int colRow=start.getRow(); colRow<8; colRow++) {
        if (start.getRow() != colRow) {
          if (b[colRow][start.getCol()].getOccupyingPiece() == null) {
            moves.add(b[colRow][start.getCol()]);
          } else {
            if (b[colRow][start.getCol()].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor() ) {
              moves.add(b[colRow][start.getCol()]);
              break;
            } else {
              moves.add(b[colRow][start.getCol()]);
              break;
            }

            
          }
        }
      }


      for (int colRow=start.getRow(); colRow>=0; colRow--) {
        if (start.getRow() != colRow) {
          if (b[colRow][start.getCol()].getOccupyingPiece() == null) {
            moves.add(b[colRow][start.getCol()]);

          } else {
            if (b[colRow][start.getCol()].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor() ) {
              moves.add(b[colRow][start.getCol()]);
              break;
            } else {
              moves.add(b[colRow][start.getCol()]);
              break;
            }

            
          }
        }
      }


      // for (int i=0; i<moves.size(); i++) {
      //   System.out.println(moves.get(i).getRow());
      //   System.out.println(moves.get(i).getCol());
      // }
      

      // Horizontal Movement
   


      for (int rowCol=start.getCol(); rowCol<8; rowCol++) {
        if (start.getCol() != rowCol) {
          if (b[start.getRow()][rowCol].getOccupyingPiece() == null) {
            moves.add(b[start.getRow()][rowCol]);

          } else {
            if (b[start.getRow()][rowCol].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor()) {
              moves.add(b[start.getRow()][rowCol]);
              break;
            
            } else {
              moves.add(b[start.getRow()][rowCol]);
              break;
            }

            
          }
        }
      }

      for (int rowCol=start.getCol(); rowCol>=0; rowCol--) {
        if (start.getCol() != rowCol) {
          if (b[start.getRow()][rowCol].getOccupyingPiece() == null) {
            moves.add(b[start.getRow()][rowCol]);

          } else {
            if (b[start.getRow()][rowCol].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor() ) {
              moves.add(b[start.getRow()][rowCol]);
              break;
              
             

            } else {
              moves.add(b[start.getRow()][rowCol]);
              break;
            }
          }
        }
      }





    	return moves;
    }
    

    // PreCondition: Requires a board instance and Square instance to be passed when the function is called.
    // PostCondition: Returns an ArrayList with Square instances that are the places that the piece could move to.
    public ArrayList<Square> getLegalMoves(Board b, Square start){
      ArrayList<Square> moves = new ArrayList<Square>();
      // Rook Movement
      System.out.println("this was called");

      // Vertical Movement
      
      for (int colRow=start.getRow(); colRow<8; colRow++) {
        if (start.getRow() != colRow) {
          if (b.getSquareArray()[colRow][start.getCol()].getOccupyingPiece() == null) {
            moves.add(b.getSquareArray()[colRow][start.getCol()]);
          } else {
            if (b.getSquareArray()[colRow][start.getCol()].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor() ) {
              // moves.add(b.getSquareArray()[colRow][start.getCol()]);
              break;
            } else {
              moves.add(b.getSquareArray()[colRow][start.getCol()]);
              break;
            }

            
          }
        }
      }


      for (int colRow=start.getRow(); colRow>=0; colRow--) {
        if (start.getRow() != colRow) {
          if (b.getSquareArray()[colRow][start.getCol()].getOccupyingPiece() == null) {
            moves.add(b.getSquareArray()[colRow][start.getCol()]);

          } else {
            if (b.getSquareArray()[colRow][start.getCol()].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor() ) {
              // moves.add(b.getSquareArray()[colRow][start.getCol()]);
              break;
            } else {
              moves.add(b.getSquareArray()[colRow][start.getCol()]);
              break;
            }

            
          }
        }
      }


      // for (int i=0; i<moves.size(); i++) {
      //   System.out.println(moves.get(i).getRow());
      //   System.out.println(moves.get(i).getCol());
      // }
      

      // Horizontal Movement
   


      for (int rowCol=start.getCol(); rowCol<8; rowCol++) {
        if (start.getCol() != rowCol) {
          if (b.getSquareArray()[start.getRow()][rowCol].getOccupyingPiece() == null) {
            moves.add(b.getSquareArray()[start.getRow()][rowCol]);

          } else {
            if (b.getSquareArray()[start.getRow()][rowCol].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor()) {
              break;
              // moves.add(b.getSquareArray()[start.getRow()][rowCol]);
            } else {
              moves.add(b.getSquareArray()[start.getRow()][rowCol]);
              break;
            }

            
          }
        }
      }

      for (int rowCol=start.getCol(); rowCol>=0; rowCol--) {
        if (start.getCol() != rowCol) {
          if (b.getSquareArray()[start.getRow()][rowCol].getOccupyingPiece() == null) {
            moves.add(b.getSquareArray()[start.getRow()][rowCol]);

          } else {
            if (b.getSquareArray()[start.getRow()][rowCol].getOccupyingPiece().getColor() == start.getOccupyingPiece().getColor() ) {
              break;
              // moves.add(b.getSquareArray()[start.getRow()][rowCol]);
             

            } else {
              moves.add(b.getSquareArray()[start.getRow()][rowCol]);
              break;
            }
          }
        }
      }





    	return moves;
    }
}