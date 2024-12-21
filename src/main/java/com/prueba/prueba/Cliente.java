/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
    
    private long id;
    private String nombre;
    private String apellido;
    
    public Cliente(long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}
