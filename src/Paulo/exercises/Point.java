package Paulo.exercises;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    public double distance (int a, int b) {
        return Math.sqrt((this.x-a)*(this.x-a)+(this.y-b)+(this.y-b));
    }

    public double distance (Point ponto) {
        return Math.sqrt((this.x-ponto.getX())*(this.x-ponto.getX())+(this.y-ponto.getY())*(this.y-ponto.getY()));
    }
}
