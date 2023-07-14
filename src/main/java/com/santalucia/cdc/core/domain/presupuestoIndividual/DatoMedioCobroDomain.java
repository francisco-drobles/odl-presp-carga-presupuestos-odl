package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatoMedioCobroDomain {
    private DatoCobroBancario datoCobroBancario;
    private DatoCobroFisico datoCobroFisico;
    private DatoCobroInterno datoCobroInterno;
}
