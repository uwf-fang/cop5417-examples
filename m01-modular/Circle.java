public class Circle implements Drawable {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void draw() {
    System.out.println("Drawing a circle with radius " + radius);
    // Draw the circle
  }
}