public class Ball{
public void move() {
  // Change the y-coordinate of the ball, according to its speed.
}
public void draw() {
  // Draws the ball on the StdDraw window, based on its coordinates.
}
public void changeDirection() {
  // Toggles the speed between positive and negative
}
public boolean atBottom(double paddleHeight) {
  // Returns true if the bottom of the ball is
  // less than or equal to the top of the paddle.
    return true;
}
public boolean isWithin(double leftEdge, double rightEdge) {
  // Returns true if the bottom of the ball is within
  // the two given x-coordinates.
    return true;
}
}