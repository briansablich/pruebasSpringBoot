
package com.prueba.prueba.repository;

import com.prueba.prueba.model.Cliente;
import java.util.List;

public interface IClienteRepository {
    public void buscarCliente(long idCliente);
    public List<Cliente> traerClientes();
}
