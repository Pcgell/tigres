package edu.ujcv.progra2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ListasColores {
    private String id;
    private String listaColores;
    private ArrayList<String> coloresArray;

    public ListasColores(){

    }

    public ListasColores(String id,String listaColores){
        this.id = id;
        this.listaColores = listaColores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListaColores() {
        return listaColores;
    }

    public void setListaColores(String listaColores) {
        this.listaColores = listaColores;
    }

    public void inflate() {
        StringTokenizer strTok = new StringTokenizer(listaColores,"|",false);
        coloresArray = new ArrayList<>();


        while (strTok.hasMoreTokens()){
            coloresArray.add(strTok.nextToken());
        }


    }
}
