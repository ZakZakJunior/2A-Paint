public class Point {
    private int X;
    private int Y;

    public Point(int X, int Y){

    }

    public int getX(){return X;}
    public void setX(int X){this.X=X;}
    public int getY(){return Y;}
    public void setY(int Y){this.Y=Y;}

    @Override
    public String toString(){return "(X,Y)";}

    public Point(){
        setX(0);
        setY(0);
    }
}
