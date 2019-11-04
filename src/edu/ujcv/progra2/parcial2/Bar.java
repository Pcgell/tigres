package edu.ujcv.progra2.parcial2;

public class Bar extends Foo {

    protected int x;


    public void sumar3x(){
        this.x+=3;
        super.x+=3;
    }

    @Override
    public void onCreate() {
        System.out.println(super.toString());
        System.out.println("creando bar");
    }

    @Override
    public String toString(){
        return doBar();
    }

    public String doBar(){
        return "is Bar";
    }

}
