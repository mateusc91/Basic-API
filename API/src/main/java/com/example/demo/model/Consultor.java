
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;


public class Consultor {
    private final UUID id;
    private final String nome;
    private final String clientesCadastrados;
    private final double lucro = 0.02;

    public Consultor(@JsonProperty("id") UUID id, 
                  @JsonProperty("nome") String nome,
                  @JsonProperty("clientes cadastrados") String clientesCadastrados,
                  @JsonProperty("lucro") Double lucro
            ) {
        this.id = id;
        this.nome = nome;
        this.clientesCadastrados = clientesCadastrados;
      
    }
    


    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getClientesCadastrados() {
        return clientesCadastrados;
    }

    public double getLucro() {
        return lucro;
    }
    
    
}
