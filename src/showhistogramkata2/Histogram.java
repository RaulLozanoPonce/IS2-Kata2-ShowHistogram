package showhistogramkata2;

import java.util.*;

public class Histogram {
    
    private final int data[];

    public Histogram(int[] data) {
        this.data = data;
    }
    
    public int[] getData() {
        return data;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
    
}
