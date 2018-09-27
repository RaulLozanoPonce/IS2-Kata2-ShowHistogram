package showhistogramkata2;

import java.util.*;

public class ShowHistogramKata2 {
    
    Map<Integer,Integer> histogram = new HashMap<>();
    int[] data = new int[20];

    public static void main(String[] args) {
        ShowHistogramKata2 showhistogram = new ShowHistogramKata2();
        showhistogram.control();
    }
    
    private void control() {
        input();
        process();
        output();
    }
    
    private void input() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) Math.floor(Math.random()*10+1);
        }
    }

    private void process() {
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            }else{
                histogram.put(data[i], 1);
            }
        }
    }

    private void output() {
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
    
}