package com.company;

public abstract class AbstractReadWrite<T extends EenDataStructuur> implements Do{

    protected String filename;
    protected EenDataStructuur data;

    public AbstractReadWrite(T data, String filename) {
        this.filename = filename;
        this.data = data;
    }

}
