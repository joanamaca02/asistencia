package ar.edu.itec1misiones.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PearsonRequest {
    private String firstName;
    private String lastName;
    private String dni;

}
