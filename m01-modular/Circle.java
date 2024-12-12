public class Circle implements Drawable {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void draw() {
    System.out.println("Drawing a circle with radius " + radius);
    System.out.println("Not implemented yet");
  }
}