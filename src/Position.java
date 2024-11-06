public class Position {
    public static int x,x1,tempX;//宽
    public static int y,y1,tempY;//高
    //public Position pos;
    public String move;


    public Position(int x, int y) {
        this.x = x;
        this.x1 = x;
        this.y = y;
        this.y1 = y;
    }




    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }


    public void movenorth() {
        this.y--;
        move = "north";
    }
    public void movesouth() {
        this.y++;
        move = "south";
    }
    public void movewest() {
        this.x--;
        move = "west";
    }
    public void moveeast() {
        this.x++;
        move = "east";
    }

    public void setX1(int x) {
        this.x1 = x;
    }
    public void setY1(int y) {
        this.y1 = y;
    }

}