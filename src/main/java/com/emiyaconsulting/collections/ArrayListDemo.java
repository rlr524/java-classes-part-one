package com.emiyaconsulting.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        var bandMembers = new ArrayList<String>();
        bandMembers.add("Suzuka");
        bandMembers.add("Rin");
        bandMembers.add("Kanon");
        bandMembers.add("Mizyu");
        
        for (String member : bandMembers) {
            System.out.println(member);
        }
        
        ArrayList<Object> akGirls = new ArrayList<>();
        akGirls.add("Suzuka");
        akGirls.add(12);
        akGirls.add(true);
        
        for (Object girl : akGirls) {
            System.out.println(girl);
        }
        
        akGirls.set(1, "Rin");
        akGirls.set(2, "Kanon");
        akGirls.add("Mizyu");
        
        for (Object girl : akGirls) {
            System.out.println(girl);
        }
    }
}
