package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Prima {
    private Double impPrimaTarifa;
    private Double ImpTotalPoliza;
    private Double ImpPrimaPura;
    private Double impPrimaInventario;
    private Double impPrimaCompetencia;
}
