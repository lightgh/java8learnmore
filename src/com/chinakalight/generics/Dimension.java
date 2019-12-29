package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
class Dimension<T> {

    private T length;
    private T width;
    private T height;

    public Dimension(T length, T width, T height){
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return String.format("LENGTH: %s | WIDTH: %s | HEIGHT: %s\n", this.length, this.width, this.height);
    }

}
