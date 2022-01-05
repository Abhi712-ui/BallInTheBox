package com.company;

public class Ball {
    private int Radius;
    private Point P;
    private int Speed;
    private int Direction;
    
    private int ReflectX = 1;
    private int ReflectY = 1;


    public Ball(int Radius, Point P, int Speed, int Direction){
        this.Radius = Radius;
        this.P = P;
        this.Speed = Speed;
        this.Direction = Direction;
    }

    public void setXY(int x, int y){
        this.P.setLocation(x, y); //Got this method from Abhinav
    }

    public void move(){
        Double a = ReflectX * Speed * Math.cos(Math.toRadians(Direction));
        int DeltaX = a.intValue();
        Double b = ReflectY * Speed * Math.sin(Math.toRadians(Direction));
        int DeltaY = b.intValue();
        this.P.translate(DeltaX, DeltaY);
    }

    public int getRadius(){
        return this.Radius;
    }

    public Point getPoint(){
        return this.P;
    }

    public int getSpeed(){
        return this.Speed;
    }

    public int getDirection(){
        return this.Direction;
    }

    public void ReflectByX(){
        ReflectX *= -1;
    }

    public void ReflectByY(){
        ReflectX *= -1;
    }


}
