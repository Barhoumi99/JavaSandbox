public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Segment(
            double x1,
            double y1,
            double x2,
            double y2
           ) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    // Getters--------
    public Point getP1() {
        return this.p1;
    }
    public Point getP2() {
        return this.p2;
    }

    // Setters ---------
    public void setP1(Point p) {
        this.p1 = p;
    }
    public void setP2(Point p) {
        this.p2 = p;
    }

    // Redefinitions --------
    public boolean equals(Object o) {
        return ((Segment)o).p1.equals(this.p1) && ((Segment)o).p2.equals(this.p2);
    }
    public String toString() {
        return String.format("P1 : %s      P2 : %s", this.p1, this.p2);
    }
    public void translate(double dx, double dy) {
        this.p1.translate(dx, dy);
        this.p2.translate(dx, dy);
    }
    public double longueur() {
        return Math.sqrt(
                Math.pow(this.p1.getX() - this.p2.getX(), 2)
              + Math.pow(this.p1.getY() - this.p2.getY(), 2)
        );
    }
}
