package ro.acs.clase;

import java.util.HashMap;

public class Inventatory {
    private HashMap<String,Block> stringBlockHashMap=new HashMap<>();

    public Inventatory(){
        stringBlockHashMap.put("Dirt",new DirtBlock());
        stringBlockHashMap.put("Stone",new StoneBlock());
    }
    public Block getBlock(String type){
        try {
            return(Block) stringBlockHashMap.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
