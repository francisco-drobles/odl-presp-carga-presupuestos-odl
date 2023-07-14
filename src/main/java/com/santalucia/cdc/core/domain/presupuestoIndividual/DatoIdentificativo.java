package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatoIdentificativo {
    private CharSequence idPresupuestoODL;
    private TipoPresupuesto tipoPresupuesto;
    private CompanniaRespServ companniaRespServ;
    private SistemaOrigen sistemaOrigen;
    private SistemaActual sistemaActual;
    private CharSequence numIdentificacion;
    private CharSequence codIdentificacion;
    private CharSequence numIdAgrupacion;
    private CharSequence codIdAgrupacion;
    private CharSequence versPresupuesto;
    private CharSequence versPresupuestoODL;
    private CharSequence indVersSeleccionada;
    private CharSequence idPolizaOrigen;
    private CharSequence idMensaje;
    private CharSequence codPackComercial;
    private CharSequence numPoliza;
    private CharSequence numPackPoliza;
    private TipoComision tipoComision;
    private CharSequence codRenovacion;
    private CharSequence indCompanniaVendedora;
    private CharSequence codOportSalesforce;
    private CharSequence codVersionComercial;
    private PeriodPoliza periodPoliza;
    private CharSequence indOrigRecomendador;
    private CharSequence codEvento;
}
