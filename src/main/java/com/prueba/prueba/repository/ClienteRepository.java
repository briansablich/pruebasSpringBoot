package com.prueba.prueba.repository;

import com.prueba.prueba.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository implements IClienteRepository{

    @Override
    public void buscarCliente(long idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> traerClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"Juan","Perez"));
        listaClientes.add(new Cliente(2L,"Perdo","Juarez"));
        return listaClientes;
    }
    
}
