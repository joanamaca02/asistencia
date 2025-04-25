package ar.edu.itec1misiones.service.impl;

import ar.edu.itec1misiones.dto.request.PearsonRequest;
import ar.edu.itec1misiones.dto.response.PearsonResponse;
import ar.edu.itec1misiones.service.PearsonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PearsonServiceImpl implements PearsonService {

    @Override
    public List<PearsonResponse> findAll() {
        List<PearsonResponse> pearsonResponses = new ArrayList<>();
        PearsonResponse p =  PearsonResponse.builder()
                .firstName("Joana")
                .lastName("Rios")
                .dni("24585456")
                .build();
        pearsonResponses.add(p);
        return pearsonResponses;
    }

    @Override
    public PearsonResponse findByDni(String dni) {
        return  PearsonResponse.builder()
                .firstName("Joana")
                .lastName("Rios")
                .dni("24585456")
                .build();
    }

    @Override
    public void save(PearsonRequest pearsonRequest) {

    }

    @Override
    public void update(PearsonRequest pearsonRequest) {

    }

    @Override
    public void delete(String dni) {

    }
}
