
package com.example.demo.dao;

import com.example.demo.model.Consultor;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ConsultorDao {

    int insertConsultor(UUID id,Consultor consultor);
    
    default int insertConsultor(Consultor consultor){
        UUID id = UUID.randomUUID();
        return insertConsultor(id,consultor);
        
    }
    
    List<Consultor> selectAllConsultors();
    
    Optional<Consultor> selectConsultorById(UUID id);
    
    int deleteConsultorById (UUID id);
    
    int updateConsultorById (UUID id, Consultor consultor);
    
}
