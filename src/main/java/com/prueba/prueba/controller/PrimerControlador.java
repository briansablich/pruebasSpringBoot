/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.prueba.prueba.controller;
import com.prueba.prueba.model.Cliente;
import com.prueba.prueba.model.PlatosRestaurante;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Cliente id: " + cli.getId());
        System.out.println("Nombre y apellido: " + cli.getNombre() + " " + cli.getApellido());
    }
    
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"Zlatan","Ibrahimovic"));
        listaClientes.add(new Cliente(2L,"Lionel","Messi"));
        listaClientes.add(new Cliente(3L,"Cristiano","Ronaldo"));
        
    return listaClientes;
    }
    
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Mensaje Response Entity", HttpStatus.OK);
    }
    
    //Ejercicio Restaurante
    
    public ArrayList<PlatosRestaurante> cargarPlatos(){
        ArrayList<PlatosRestaurante> listaPlatos = new ArrayList<PlatosRestaurante>();
        listaPlatos.add(new PlatosRestaurante(1L,"Fideos",100D,"Con salsa"));
        listaPlatos.add(new PlatosRestaurante(2L,"Arroz",150D,"Con vegetales"));
        listaPlatos.add(new PlatosRestaurante(3L,"Ravioles",50D,"Con queso"));
        listaPlatos.add(new PlatosRestaurante(4L,"Pizza",199D,"Napolitana"));
        listaPlatos.add(new PlatosRestaurante(5L,"Lentejas",200D,"Con huevo"));
        return listaPlatos;
    }
    
    @GetMapping("/platos/{idplato}")
    public String platos(@PathVariable long idplato){
        ArrayList<PlatosRestaurante> listaPlatos = cargarPlatos();
        PlatosRestaurante platoSeleccionado = new PlatosRestaurante();
        for(PlatosRestaurante pr:listaPlatos){
            if(pr.getIdPlato() == idplato){
                platoSeleccionado = pr;
            }
        }
        return platoSeleccionado.toString();
    }
    
}
