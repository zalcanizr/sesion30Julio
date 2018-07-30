package com.cice.interfaces;

@FunctionalInterface

//interfaz que tienen un unico metodo sin definir pero puede tener muchos más metodos definidos

public interface IFuncional {

    String test(String mensaje);


    //en java 8 ésto ya tb. se permite en una interfaz funcional
    /*default String test2(){
        return null;
    }*/




}
