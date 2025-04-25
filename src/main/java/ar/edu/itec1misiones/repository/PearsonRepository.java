package ar.edu.itec1misiones.repository;

import ar.edu.itec1misiones.model.Pearson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PearsonRepository extends JpaRepository <Pearson, Integer> {
}
