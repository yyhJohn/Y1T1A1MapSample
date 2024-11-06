import java.util.ArrayList;
import java.util.Scanner;


public class Game  {
    public static void main(String[] args) {

        System.out.println("how to play: move north,move east..." +
                "map,quit,Item,help");
        Inventory in = new Inventory();
        Score sc = new Score(0);

        char people='P';

        //1
        Map ma=new Map(5,5);
        Position po=new Position(0,0);
        ma.placePeople(po, people);

        in.objectAddress = new ArrayList<>();

        sc.visitRoom();






        while (true) {

                Scanner input = new Scanner(System.in);
                String action = input.nextLine();




                if (action.equals("move north")) {
                    po.movenorth();
                    System.out.println("You follow the path " + po.move);
                }
                if (action.equals("move south")) {
                    po.movesouth();
                    System.out.println("You follow the path " + po.move);
                }
                if (action.equals("move east")) {
                    po.moveeast();
                    System.out.println("You follow the path " + po.move);
                }
                if (action.equals("move west")) {
                    po.movewest();
                    System.out.println("You follow the path " + po.move);
                }



                if (action.equals("score")) {
                    System.out.println("your score is "+sc.getScore());
                }


                if (action.equals("look")) {

                }
                if (action.equals("map")) {
                    ma.placeRoom(po,people);
                    System.out.println(ma.display());

                }
                if (action.equals("quit")) {
                    System.out.println("Game over");
                    return;
                }


                if(action.equals("Items")) {
                    in.displayInventory();
                }

                if(action.equals("help")) {
                    System.out.println("how to play: move north,move east..." +
                            "map,quit,Item,help");
                }
                if(action.equals("next room")) {
                    System.out.println("you go to next room");
                    break;
                }

        }
    }
}