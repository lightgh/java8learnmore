package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public interface DemoInterface<T1, T2> {
    T2 doSomeOperation(T1 t);
    T1 doReverseOperation(T2 t);
}
