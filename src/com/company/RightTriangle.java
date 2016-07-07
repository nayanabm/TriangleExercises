package com.company;

/**
 * Created by Nayana on 7/6/2016.
 */
public class RightTriangle {

    public void printRightTriangle(int numberOfRowsWithEquivalentStar) {

       for (int row=1;row<=numberOfRowsWithEquivalentStar;row++){
           for (int numberOfStar=1;numberOfStar<=row;numberOfStar++){
               System.out.print("*");
           }
           System.out.println("*");
       }
    }
}
