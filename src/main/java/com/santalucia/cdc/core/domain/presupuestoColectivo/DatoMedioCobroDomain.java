package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class DatoMedioCobroDomain {
    private DatoCobroBancarioDomain datoCobroBancarioDomain;
    private DatoCobroFisicoDomain datoCobroFisicoDomain;
    private DatoCobroInternoDomain datoCobroInternoDomain;
    private List<DatosCobroOtrosMediosDomain> datosCobroOtrosMedioDomains;
}
