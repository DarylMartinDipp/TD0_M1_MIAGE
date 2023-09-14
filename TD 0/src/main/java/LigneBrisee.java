public class LigneBrisee {
    private Point[] tableauDePoints;
    private final int max;
    private int nombrePoints;

    public LigneBrisee(Point[] tableauDePoints, int max) {
        this.tableauDePoints = tableauDePoints;
        this.max = max;
        this.nombrePoints = 0;
    }

    public void add(Point pointToAdd) {
        if (nombrePoints < max) {
            tableauDePoints[nombrePoints] = pointToAdd;
            nombrePoints++;
        } else
            throw new IllegalStateException("La ligne brisée est pleine, impossible d'ajouter plus de points.");
    }

    public int pointCapacity() {
        return max;
    }

    public int nbPoints() {
        return nombrePoints;
    }

    public boolean contains(Point pointToCheck) {
        for (Point point : tableauDePoints) {
            if (point != null && point.isSamePoint(pointToCheck))
                return true;
        }
        return false;
    }
}
