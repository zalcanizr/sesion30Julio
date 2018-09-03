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
        //parametro de entrada-> funcion logica o implementacion del método
        // mensaje es el parámetro de entrada. Que en el método de la ifuncional le tenemos declarado tipo String
        //el método devuelve lo de la derecha usando el parm. de entrada y sustituyendo %s por el mensaje que le estoy
        //dando en el parámetro mensaje.
        
        IFuncional fi=mensaje->String.format("Hola %s, bienvenido al curso de Java",mensaje);
        //equivale a:
        //String test(String test){ 
        //return String.format("Hola %s", mensaje);
        //}
        
        String resp2=fi.test("Gustavo");
        System.out.println(resp2);


        fi=mensaje->String.format("HOLA %s!!!!",mensaje.toUpperCase());
        resp2=fi.test("gustavo");
        System.out.println(resp2);

        fi=mensaje->{
            if(mensaje.contains("@")){
                File file=new File ("");
            }else{
            }
            return "";
        };   
        //
        /*fi=mensaje->{
            String res=mensaje.toUpperCase();
            res.concat(" ");
            return
        }*/


    }
}
