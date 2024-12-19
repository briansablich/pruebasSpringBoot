/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba.prueba.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerControlador {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Hola mundo, probando...";
    }
    
    @GetMapping("/goodbye")
    public String sayGoodBye(){
        return "Chau mundo, abandonando...";                
    }
    
}
