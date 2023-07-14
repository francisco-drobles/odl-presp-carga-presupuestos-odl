package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatoIdentifTarif {
    private TipoComplemento tipoComplemento;
    private Categoria categoria;
    private AgrupGarantia agrupGarantia;
    private CharSequence numOrdenAgrupGar;
    private CharSequence agrupGarantiaHog;
    private GarantiaUnitaria garantiaUnitaria;
    private CharSequence numOrdenPersonaRol;
    private Riesgo riesgo;
    private CharSequence edadTarificacion;
    private CharSequence codAplicacion;
}
