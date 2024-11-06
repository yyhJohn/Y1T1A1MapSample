import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;



public class Inventory {
    private ArrayList<String> Items = new ArrayList<>();
    private int randomW, randomH;
    final int MAX_ITEMS = 10;
    List<int[]> objectAddress;
    private int countO,countRemoveO;

    //门
    private int randomWD, randomHD;

    private int H,W;
    private int TH1,TH2,TH3,TH4;
    private int TW1,TW2,TW3,TW4;
    private int countT;



    public void addItem(String item){
        Items.add(item);
    }
    public int hasItem(String item){
        if(Items.contains(item)){
            return Items.indexOf(item);
        }else{
            return -1;
        }
    }
    public void removeItem(String item){
        Items.remove(item);
    }

    //
    public String displayInventory(){
        String output = "";
        for(int i = 0; i<Items.size(); i++){
            output += Items.get(i) + " ";
        }
        return output;
    }


    public void resetAddress(){
        objectAddress = new ArrayList<>();
    }




}
