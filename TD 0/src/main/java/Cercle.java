public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public void translate(int dx, int dy) {
        centre.translate(dx, dy);
    }

    public double surface() {
        return rayon * rayon * Math.PI;
    }

    public boolean contains(Point p) {
        int distanceX = p.getX() - centre.getX();
        int distanceY = p.getY() - centre.getY();
        double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
        return distance <= rayon;
    }

    public static boolean contains(Point p, Cercle... circles) {
        for (Cercle cercle : circles) {
            if (cercle.contains(p)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cercle de centre " + centre.affichePoint() +
                ", de rayon " + rayon + " et de surface " + surface() + ".";
    }

    public static void main(String[] args) {
        Point centreCercle1 = new Point(2, 3);
        double rayonCercle1 = 5.0;
        Cercle cercle1 = new Cercle(centreCercle1, rayonCercle1);

        Point centreCercle2 = new Point(7, 8);
        double rayonCercle2 = 3.0;
        Cercle cercle2 = new Cercle(centreCercle2, rayonCercle2);

        System.out.println(cercle1);
        System.out.println(cercle2);

        Point pointA = new Point(4, 6);
        Point pointB = new Point(2, 9);

        System.out.println(cercle1.contains(pointA)); // true
        System.out.println(Cercle.contains(pointB, cercle1, cercle2)); // false
    }
}
