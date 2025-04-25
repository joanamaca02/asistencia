package ar.edu.itec1misiones.service;

import ar.edu.itec1misiones.dto.request.PearsonRequest;
import ar.edu.itec1misiones.dto.response.PearsonResponse;

import java.util.List;

public interface PearsonService {
    List<PearsonResponse> findAll();

    PearsonResponse findByDni(String dni);

    void save(PearsonRequest pearsonRequest);

    void update(PearsonRequest pearsonRequest);

    void delete(String dni);

}
