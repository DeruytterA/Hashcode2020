package com.company;

public class WriteFile<T extends EenDataStructuur> extends AbstractReadWrite<T>{

    public WriteFile(T data, String filename) {
        super(data, filename);
    }

    @Override
    public T doYourThing() {
        return null;
    }
}
