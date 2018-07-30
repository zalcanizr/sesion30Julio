package com.cice.impl;

import com.cice.interfaces.IFuncional;

public class Funcional implements IFuncional{

    @Override
    public String test(String mensaje) {
        return String.format("Hola %s, bienvenido al curso Java",mensaje);
    }
}
