package com.free;

import java.util.ArrayList;

public class Reverse {

    public ArrayList<String> reverseArrayList(ArrayList<String> List){

        for (int i = 0; i < List.size() / 2; i++) {
            String temp = List.get(i);
            List.set(i, List.get(List.size() - i - 1));
            List.set(List.size() - i - 1, temp);
        }
        return List;



    }
}
