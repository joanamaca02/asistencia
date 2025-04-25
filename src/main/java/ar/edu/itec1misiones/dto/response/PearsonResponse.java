package ar.edu.itec1misiones.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PearsonResponse {
    private String firstName;
    private String lastName;
    private String dni;
}
