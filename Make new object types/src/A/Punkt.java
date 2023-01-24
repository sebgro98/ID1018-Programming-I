package A;

 public class Punkt {
    private String punktName;
    private int x;
    private int y;

    public Punkt(String punktName, int x, int y) {

        this.punktName = punktName;
        this.setX(x);
        this.setY(y);
    }

    public Punkt(Punkt p) {
        this.punktName = p.punktName;
        this.x = p.x;
        this.y = p.y;
    }

    public String toString() {
        return "(" + this.punktName + ", " + this.x + ", " + this.y + ")";
    }

    public String getNamn() {
        return punktName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double avstand(Punkt p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

     public boolean equals(Punkt andra) {
         boolean equal;
         if (this.x == andra.x && this.y == andra.y) {
             equal = true;
         } else {
             equal = false;
         }
         return equal;
     }

}