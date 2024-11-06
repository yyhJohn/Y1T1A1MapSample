

public class Map {
    public char[][] map;
    public static int width,height;
    private final char EMPTY ='.';
    private String temp="";




    private char MapSymbol='.';
    StringBuffer output= new StringBuffer();


    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.map = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = EMPTY;
            }
        }
    }



    public void placeRoom(Position pos, char symbol) {
        map[pos.getY1()][pos.getX1()]= this.MapSymbol;
        pos.setX1(pos.getX());
        pos.setY1(pos.getY());
        map[pos.getY()][pos.getX()] = symbol;
        if (pos.getX() >= 0 && pos.getX() < width && pos.getY() >= 0 && pos.getY() < height) {
            map[pos.getY()][pos.getX()] = symbol;
        }
    }

    public String display() {
        StringBuilder display = new StringBuilder();
        for (char[] row : map) {
            for (char cells : row) {
                display.append(cells);
            }
            display.append('\n');
        }
        return display.toString();
    }




    public void placePeople(Position pos,char symbol){
        map[pos.getY()][pos.getX()]= symbol;

    }


    public int getwidth() {
        return width;
    }
    public int getheight() {
        return height;
    }


}
