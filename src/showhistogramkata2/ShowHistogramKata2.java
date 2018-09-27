package showhistogramkata2;

import java.util.*;

public class ShowHistogramKata2 {
    
    String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
    Map<String,Integer> histogr;

    public static void main(String[] args) {
        ShowHistogramKata2 showhistogram = new ShowHistogramKata2();
        showhistogram.control();
    }
    
    private void control() {
        process();
        output();
    }

    private void process() {
        Histogram histo = new Histogram(data);
        histogr = histo.getHistogram();
    }

    private void output() {
        for (String key : histogr.keySet()) {
            System.out.println(key + " ===> " + histogr.get(key));
        }
    }
    
}