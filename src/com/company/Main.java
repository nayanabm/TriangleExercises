package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SimpleExercise simpleExercise=new SimpleExercise();
        HorizontalLine horizontalLine=new HorizontalLine();
        VerticalLine verticalLine=new VerticalLine();
        RightTriangle rightTriangle=new RightTriangle();

        System.out.println("Simple star display");
        simpleExercise.printStar();

        System.out.println("Horizontal line of stars");
        horizontalLine.printHorizontalLine(8);

        System.out.println("Vertical line of stars");
        verticalLine.printVerticalLine(3);

        System.out.println("Right triangle of stars");
        rightTriangle.printRightTriangle(5);

    }
}
