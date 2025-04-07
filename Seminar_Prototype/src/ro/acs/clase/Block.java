package ro.acs.clase;

public abstract class Block implements Cloneable{
    int length;
    int height;
    int depth;

    Block() {
    }

    public int length() {
        return length;
    }

    public Block setLength(int length) {
        this.length = length;
        return this;
    }

    public int height() {
        return height;
    }

    public Block setHeight(int height) {
        this.height = height;
        return this;
    }

    public int depth() {
        return depth;
    }

    public Block setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Block clone=(Block) super.clone();
        clone.length=length;
        clone.depth=depth;
        clone.height=height;
        return clone;
    }
}
