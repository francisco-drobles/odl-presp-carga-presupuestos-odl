package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class DatoMedioCobro {
    private DatoCobroBancario datoCobroBancario;
    private DatoCobroFisico datoCobroFisico;
    private DatoCobroInterno datoCobroInterno;
    private List<DatosCobroOtrosMedios> datosCobroOtrosMedios;
}
