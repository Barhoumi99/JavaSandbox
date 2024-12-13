public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(0, 0);
    }

    //  Getters: ---------
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    // Setters -----
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    // Redefinitions --------
    public boolean equals(Object o) {
        return ((Point)o).x == this.x && ((Point)o).y == this.y;
    }
    public String toString() {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}
