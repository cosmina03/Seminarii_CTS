package ro.acs.clase;

public class DirtBlock extends Block{
    String type;

     DirtBlock() {
         this.type="Dirt Block";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DirtBlock clone=(DirtBlock) super.clone();
        if(type!=null){
            clone.type=type;
        }else{
            clone.type=null;
        }
        return clone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DirtBlock{");
        sb.append("type='").append(type).append('\'');
        sb.append(", length=").append(length);
        sb.append(", height=").append(height);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }
}
