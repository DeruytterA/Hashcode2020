package hashCode;



public abstract class AbstractReadWrite implements Do{

    protected static final String in = "input/";
    protected static final String out = "output/out_";

    protected String pathname;
    protected EenDataStructuur data;

    public AbstractReadWrite(String pathname) {
        this.pathname = pathname;
    }

    public EenDataStructuur getData() {
        return data;
    }
}
