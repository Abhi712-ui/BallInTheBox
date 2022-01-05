package com.company;

public class Container {
    private Point UpperLeft;
    private Point LowerRight;

    public Container(Point UpperLeft, Point LowerRight){
        this.UpperLeft = UpperLeft;
        this.LowerRight = LowerRight;
    }

    public int getWidth(){
        return Math.abs(UpperLeft.getX() - this.LowerRight.getX());
    }

    public int getHeight(){
        return Math.abs(UpperLeft.getY() - this.LowerRight.getY());
    }

    public void collidesWith(Ball b){ //Got This Method from Abhinav
        if(b.getPoint().getX() < 0 || b.getPoint().getX() > (LowerRight.getX()-b.getRadius())){
            System.out.println("OUT X");
            b.ReflectByX();
        }

        if(b.getPoint().getY() > (UpperLeft.getY()-b.getRadius()) || b.getPoint().getY() < 0){
            System.out.println("OUT Y");
            b.ReflectByY();
        }
    }
}
