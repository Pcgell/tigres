package edu.ujcv.progra2.parcial2;

public class Bash extends Bar {

    private int x;

    @Override
    public void sumar3x(){
        super.sumar3x();
        this.x +=3;

    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("creando Bash!!");
    }
}
