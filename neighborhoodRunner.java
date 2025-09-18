import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {


    //This code instantiates a background painter named bob to paint the entire background green for my asphalt art project. 
BackgroundPainter bob = new BackgroundPainter();
    bob.paintBackground("green");


    //This part of the code instantiates a CreeperPainter to conduct the code of creating the creeper's face. 
    CreeperPainter rob = new CreeperPainter();

    //This segment of code gets rob to the start position for the creeper's eye to begin painting. 
rob.move();
    rob.move();
    rob.move();
    rob.move();
rob.turnRight();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.paintEye();


    
//This segment of code gets Rob to the starting point for the other eye of the Creeper to begin painting it and use the paintEye method. 
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
    rob.turnRight();
    rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
    rob.turnRight();
    rob.paintEye();

    
    //This last segment of the code gets Rob to the starting position of the Creeper's mouth to begin painting the mouth of the creeper using the paintMouth method. 
    rob.turnRight();
    rob.turnRight();
    rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
     rob.move();
 rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
rob.paintMouth();
    
    
  
  
  
  }
}
