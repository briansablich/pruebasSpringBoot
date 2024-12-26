
package com.prueba.prueba.service;

import com.prueba.prueba.model.Cliente;
import com.prueba.prueba.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    IClienteRepository repo;
    
    @Override
    public List<Cliente> traerClientes() {
        return repo.traerClientes();
    }
    
}
