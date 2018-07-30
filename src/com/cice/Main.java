package com.cice;

import com.cice.interfaces.IFuncional;
import com.cice.impl.Funcional;

public class Main {

    public static void main(String[] args) {


        Funcional f = new Funcional();
        String resp= f.test("Gustavo");
        System.out.println(resp);


        //como la interfaz funcional solo tienen un metodo abastracto lo que estoy haciendo es asignarle una funcionalidad al métdoo abstracto
        //la interfaz lo que hace es darle una definicion al metodo abstracto de la interfaz
        //parametro de entrada-> funcion logica
        IFuncional fi=mensaje->String.format("Hola %s, bienvenido al curso de Java",mensaje);
        String resp2=fi.test("Gustavo");
        System.out.println(resp2);


        fi=mensaje->String.format("HOLA %s!!!!",mensaje.toUpperCase());
        resp2=fi.test("gustavo");
        System.out.println(resp2);


        //
        /*fi=mensaje->{
            String res=mensaje.toUpperCase();
            res.concat(" ");
            return
        }*/


    }
}
