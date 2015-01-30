package com.bnsantos.navigationdrawer.model;

/**
 * Created by bruno on 30/01/15.
 */
public class Item {
    public final int[] res;
    public final String text;

    public Item(String text, int[] res) {
        this.res = res;
        this.text = text;
    }
}
