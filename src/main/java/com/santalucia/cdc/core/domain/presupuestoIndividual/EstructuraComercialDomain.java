package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EstructuraComercialDomain {
    private CanalMediacion canalMediacion;
    private MedioDistribucion medioDistribucion;
    private Agencia agencia;
    private Zona zona;
    private Distrito distrito;
    private Oficina oficina;
    private CharSequence codMediador;
    private TipoMediador tipoMediador;
    private TipoColaborador tipoColaborador;
    private CharSequence codColaborador;
    private TipoColaboradorIni tipoColaboradorIni;
    private CharSequence codColabInicial;
    private CharSequence codMonitor;
    private CharSequence codMonitorInicial;
    private RedVenta redVenta;
    private CharSequence indTipoMedioCom;
}
