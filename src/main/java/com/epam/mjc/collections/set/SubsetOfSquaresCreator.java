package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(Integer x : sourceList)
            if(x*x>=lowerBound && x*x <=upperBound)
                ts.add(x*x);
        return ts;
    }
}
