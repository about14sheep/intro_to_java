package chapterthree;

public class RandomPoint {
    public static void main(String[] args) {
        int x = -50 + (int)(Math.random() * ((50 - (-50)) + 1));
        int y = -100 + (int)(Math.random() * ((100 - (-100)) + 1));

        System.out.println("Random point is (" + x + ", " + y + ")");
    }
}
