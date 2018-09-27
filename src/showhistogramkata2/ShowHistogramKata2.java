package showhistogramkata2;

import java.util.*;

public class ShowHistogramKata2 {
    
    Integer[] data = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    Map<Integer,Integer> histogr;

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
        Histogram histo = new Histogram(data);
        histogr = histo.getHistogram();
    }

    private void output() {
        for (Integer key : histogr.keySet()) {
            System.out.println(key + " ===> " + histogr.get(key));
        }
    }
    
}