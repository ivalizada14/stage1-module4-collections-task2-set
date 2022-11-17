package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hs = new HashSet<>();
        for (Integer x : sourceList)
        {
            if(x%2==0)
            {
                while(x%2==0)
                {
                    hs.add(x);
                    x/=2;
                }
            }
            else
            {
                hs.add(x);hs.add(2*x);
            }
        }
    return hs;
    }
}
