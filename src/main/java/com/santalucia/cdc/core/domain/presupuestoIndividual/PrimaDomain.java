package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PrimaDomain {
    private Double impPrimaTarifa;
    private Double ImpTotalPoliza;
    private Double ImpPrimaPura;
    private Double impPrimaInventario;
    private Double impPrimaCompetencia;
}
