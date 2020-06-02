
package com.example.demo.dao;

import com.example.demo.model.Consultor;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ConsultorDataAcessService implements ConsultorDao{

    @Override
    public int insertConsultor(UUID id, Consultor consultor) {
        return 0;
    }

    @Override
    public List<Consultor> selectAllConsultors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Consultor> selectConsultorById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteConsultorById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateConsultorById(UUID id, Consultor consultor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
