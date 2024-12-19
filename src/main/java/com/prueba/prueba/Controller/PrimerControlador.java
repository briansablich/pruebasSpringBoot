/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba.prueba.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerControlador {
    
    @GetMapping("/hello")
    public String sayHello(@RequestParam String nombre, @RequestParam String email){
        return "Hola mundo, probando..." + nombre + " Email: " + email;
    }
    
    @GetMapping("/goodbye/{nombre}/{edad}")
    public String sayGoodBye(@PathVariable String nombre, @PathVariable int edad){
        return "Chau mundo, abandonando..." + " Nombre: " + nombre + " Edad: " + edad;
    }
    
    @GetMapping("/conversion")
    public String convertir(@RequestParam double cantidad){
        double resultado = cantidad / 3.78541;
        return resultado + " galones";
    }
    
}
