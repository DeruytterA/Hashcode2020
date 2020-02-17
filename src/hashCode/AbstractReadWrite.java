package hashCode;


public abstract class AbstractReadWrite<T extends EenDataStructuur> implements Do{

    protected static final String in = "/input/";
    protected static final String out = "/output/";

    protected String pathname;
    protected EenDataStructuur data;

    public AbstractReadWrite(T data, String pathname) {
        this.pathname = pathname;
        this.data = data;
    }

    public EenDataStructuur getData() {
        return data;
    }
}
