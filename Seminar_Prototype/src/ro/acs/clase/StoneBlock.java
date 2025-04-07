package ro.acs.clase;

public class StoneBlock extends Block {
    String type;

     StoneBlock() {
        this.type = "Stone Block";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       StoneBlock clone= (StoneBlock) super.clone();
        if(type!=null){
            clone.type=type;
        }else{
            clone.type=null;
        }
        return clone;
     }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StoneBlock{");
        sb.append("type='").append(type).append('\'');
        sb.append(", height=").append(height);
        sb.append(", depth=").append(depth);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
