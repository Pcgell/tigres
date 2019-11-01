package edu.ujcv.progra2.parcial2;

public abstract class Foo extends Herencia{




    protected int x;
    public String doFoo(){
        return "is foo";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public abstract void onCreate();
}
