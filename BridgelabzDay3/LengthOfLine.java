package com.BridgelabzDay3;

public class LengthOfLine {
    public void calcDistance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance" +  distance);
    }
    public static void main(String[] args ){
        LengthOfLine lc = new LengthOfLine ();
        lc.calcDistance(1,1,5,4);
    }
}

