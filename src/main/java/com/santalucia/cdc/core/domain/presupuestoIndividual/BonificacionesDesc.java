package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BonificacionesDesc {
    private BonificacionDesc bonificacionDesc;
    private CharSequence porCesionComisionMed;
    private Double impBonificacionDesc;
}
