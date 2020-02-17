package com.company;

public class ReadFile<T extends EenDataStructuur> extends AbstractReadWrite<T>{

    public ReadFile(T data, String filename) {
        super(data,filename);
    }

    @Override
    public T doYourThing() {
        return null;
    }

    //todo maak nieuwe thread en schrijf shit weg

}
