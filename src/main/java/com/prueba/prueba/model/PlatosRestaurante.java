/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PlatosRestaurante {
    private long idPlato;
    private String nombre;
    private double precio;
    private String descripcion;
    
    public PlatosRestaurante(long idPlato, String nombre, double precio, String descripcion){
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public PlatosRestaurante(){
        this.idPlato = 0;
    }
    
    @Override
    public String toString(){
        return "id: " + getIdPlato() + " Nombre: " + getNombre() + " Precio: " + getPrecio() + " Descripcion: " + getDescripcion();
    }
    
}
