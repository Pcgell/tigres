package edu.ujcv.progra2;

import edu.ujcv.progra2.Vehiculos.Aux.Motor;
import edu.ujcv.progra2.Vehiculos.Aux.TipoRuedas;
import edu.ujcv.progra2.Vehiculos.Carro;
import edu.ujcv.progra2.parcial2.Bar;
import edu.ujcv.progra2.parcial2.Bash;
import edu.ujcv.progra2.parcial2.Foo;
import edu.ujcv.progra2.parcial2.Herencia;


import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {


        Bar b = new Bar();

        Bash bash = new Bash();

        ArrayList<Foo> fooList = new ArrayList<>();

        fooList.add(bash);
        fooList.add(b);

        for (int i = 0; i <fooList.size(); i++) {
            System.out.println(fooList.get(i));
        }

    }



    public static <T>void initArray(T[]array, T elemento){
        for (int i = 0; i < array.length; i++) {
            array[i] = elemento;
        }
    }

    public static <T>T[] concatArray(T[] array, T[] array2){
        T[] retval = (T[])new Object[array.length + array2.length];

        int midpoint = 0;

        //System.arraycopy(array,0,retval,0,array.length);
        //System.arraycopy(array2,0,retval,array.length,array2.length);
        for (int i = 0; i < array.length; i++) {
            retval[i] = array[i];
            midpoint++;
        }

        for (int i = 0; i <array2.length ; i++) {

            retval[midpoint+i] = array2[i];

        }

        return retval;

    }
    public static <T>T[] intercalar(T[] a1, T[] a2){
        T[] retval = (T[])new Object[a1.length+ a2.length];

        int min = Math.min(a1.length,a2.length);
        for (int i = 0 ; i < min ; i++) {
            retval[i*2] = a1[i];
            retval[i*2+1] = a2[i];
        }
        if(a1.length< a2.length){
            System.arraycopy(a2,a1.length,retval,a1.length * 2, a2.length - a1.length);
        }else
        {
            System.arraycopy(a1,a2.length,retval,a2.length * 2,a1.length - a2.length);
        }
        return retval;
    }

    public static <T>void printArray(T[] a){

        if(a == null)
            return;

        for (int i = 0; i < a.length; i++) {
            if(i == a.length -1)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+", ");
        }
        System.out.println();
    }

    public static <T>T[] separar(T[] a1, T[] a2){
        int tamano= 0;

        for (int i = 0; i < a1.length; i++) {
            boolean cuento = true;
            for (int j = i; j < a2.length ; j++) {
                if(a1[i] == a2[j]){
                    cuento = false;
                    break;
                }
            }
            if(cuento && i < a2.length) tamano++;

        }

        T[] retval = (T[])new Object[tamano];

        for (int i = 0, k = 0; i < a1.length; i++) {
            boolean agrego = true;
            for (int j = i; j < a2.length ; j++) {
                if(a1[i] == a2[j]){
                    agrego = false;
                    break;
                }
            }
            if(agrego && i < a2.length) retval[k++] = a1[i];

        }



        return  retval;
    }



    //Repaso
    // programacion imperativa  - paradigma
    // tipos de datos
    // metodos
    // objetos poo - paradigma
    // encapsular y extender* - 1 proteger datos 2. accesores mutadores 3. constructores
    // arreglos - objeto
    // plantillas - genericas


    //pop - paradigma
    //lisp - paradigma
    // funcional-

    // Foo a = new Foo();
    // superficial
    // Foo b = a;
    // profunda
    // Foo b = new Foo(a);



    //dada una lista de elementos eliminar los duplicados
    // retornar una lista de duplicados




}

