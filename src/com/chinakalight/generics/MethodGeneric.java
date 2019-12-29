package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public class MethodGeneric {

    public static <T> int countAllOccurrences(T[] list, T item){
        int count = 0;
        if(item == null){
            for(T listItem : list){
                if(listItem == null)
                    count++;
            }
        }else{
            for(T listItem : list)
                if(item.equals(listItem))
                    count++;
        }
        return count;
    }
}
