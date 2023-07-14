package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FechaYEstadoDomain {
    private Fecha fecha;
    private Estado estado;
}
