import org.code.neighborhood.*;
public class PainterPlus extends Painter {
  
/**
  *This allows the Painter to turnRight once instead of turning Left 3 times.
*/ 
  public void turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
}

  /**
  This allows the Painter to take all the paint from a bucket.
*/
public void takeAllPaint(){
  while (isOnBucket()){
      takePaint();
  }
}

  /**
  This allows the painter to move foward if it is able to move.
  */
public void moveFast(){
  while (canMove()){
    move();
  }
}

  /**
  This allows the painter to paint foward until there is no paint left.
  */
public void paintToEmpty(String color){
  while (hasPaint()){
     paint(color);
    move();
  }
  }

  /**
  This allows the painter to paint a donut shape.
  */
public void paintDonut(String color){
  while(hasPaint()){
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
  }
}

/**
  This allows the Painter to turn around.
  */
  public void turnAround(){
turnLeft();
    turnLeft();
  }
}