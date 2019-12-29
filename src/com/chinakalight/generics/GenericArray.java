package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public class GenericArray<T> {

    // This is fine
    public T[] notYetInstantiatedArray;

    // causes compiler error; Cannot create a generic array of T
    public T[] array = new T[5];
}
