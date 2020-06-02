
package com.example.demo.service;

import com.example.demo.dao.ConsultorDao;
import com.example.demo.model.Consultor;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class ConsultorService {
    
    private final ConsultorDao consultorDao;
    
    @Autowired
    public ConsultorService(@Qualifier("fakeConsultorDao")ConsultorDao consultorDao){
        this.consultorDao = consultorDao;
    }
    
    public int addConsultor(Consultor consultor){
        return consultorDao.insertConsultor(consultor);
    }
    
    public List<Consultor> getAllConsultores(){
        return consultorDao.selectAllConsultors();
    }
    
    public Optional<Consultor> getConsultorById(UUID id){
        return consultorDao.selectConsultorById(id);
        
    }
    
    public int deleteConsultor(UUID id){
        return consultorDao.deleteConsultorById(id);
    }
    
    public int updateConsultor(UUID id, Consultor newConsultor){
        return consultorDao.updateConsultorById(id, newConsultor);
    }
}
