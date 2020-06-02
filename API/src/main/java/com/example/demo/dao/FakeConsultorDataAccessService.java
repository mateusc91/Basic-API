
package com.example.demo.dao;

import com.example.demo.model.Consultor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository("fakeConsultorDao")
public class FakeConsultorDataAccessService implements ConsultorDao {

    private static List<Consultor> DB = new ArrayList<>();
    
    
    @Override
    public int insertConsultor(UUID id, Consultor consultor) {
        DB.add(new Consultor(id, consultor.getNome(),consultor.getClientesCadastrados(),consultor.getLucro()));
        return 1;
    }
    
    public int isEmpty() {
        return 0;
    }

    @Override
    public List<Consultor> selectAllConsultors() {
       return DB;
    }

    @Override
    public Optional<Consultor> selectConsultorById(UUID id) {
        return DB.stream().filter(consultor -> consultor.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteConsultorById(UUID id) {
       Optional<Consultor> consultorMaybe = selectConsultorById(id);
        if (consultorMaybe.equals("")) {
            return 0;
        }
        DB.remove(consultorMaybe.get());
        return 1;
    }

    @Override
    public int updateConsultorById(UUID id, Consultor update) {
        return selectConsultorById(id)
                .map(consultor -> {
                    int indexOfConsultorToUpdate = DB.indexOf(consultor);
                    if (indexOfConsultorToUpdate >= 0) {
                        DB.set(indexOfConsultorToUpdate, new Consultor(id,update.getNome(),update.getClientesCadastrados(),update.getLucro()));
                        return 1;
                    }
                    return 0;

                })
                .orElse(0);
    }
    
}
