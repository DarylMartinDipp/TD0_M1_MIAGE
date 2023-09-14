public class Point {
    private int x;
    private int y;
    private static int count = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
        count++;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 3);
        System.out.println(p.affichePoint());

        int x = 1;
        int y = 2;
        Point point = new Point(3,4);
        Point p1 = new Point(x, y);
        Point p2 = new Point(point);
        System.out.println(p1.affichePoint());
        System.out.println(p2.affichePoint());

        Point p3 = new Point(3, 4);
        Point p4 = new Point(point);
        Point p5 = new Point(7, 8);
        Point p6 = new Point(point);
        System.out.println(p3.isSamePoint(p4));
        System.out.println(p5.isSamePoint(p6));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getCount() {
        return count;
    }

    public String affichePoint() {
        return "(" + x + ", " + y + ")";
    }

    public boolean isSamePoint(Point pointToCompare) {
        return pointToCompare.getX() == x && pointToCompare.getY() == y;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
