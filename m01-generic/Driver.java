public class Driver {
  public static void main(String[] args) {
      Box<Integer> integerBox = new Box<>(10);
      System.out.println("Contents of integerBox: " + integerBox.getContents());

      Box<String> stringBox = new Box<>("Hello");
      System.out.println("Contents of stringBox: " + stringBox.getContents());
  }
}