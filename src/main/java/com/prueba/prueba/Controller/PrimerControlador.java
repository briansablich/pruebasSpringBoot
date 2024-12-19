/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba.prueba.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerControlador {
    
    @GetMapping("/hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hola mundo, probando..." + nombre;
    }
    
    @GetMapping("/goodbye/{nombre}/{edad}")
    public String sayGoodBye(@PathVariable String nombre, @PathVariable int edad){
        return "Chau mundo, abandonando..." + " Nombre: " + nombre + " Edad: " + edad;
    }
    
}
