
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import javax.validation.constraints.NotBlank;

public class Person {

    private final UUID id;
    private final String produto;
    private final Double valor;
    
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id, 
                  @JsonProperty("name") String name,
                  @JsonProperty("produto") String produto,
                  @JsonProperty("valor") Double valor
                  
                  
                  ) {
        
        this.id = id;
        this.name = name;
        this.produto = produto;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProduto() {
        return produto;
    }

    public Double getValor() {
        return valor;
    }
    
    
}
