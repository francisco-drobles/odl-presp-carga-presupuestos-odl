package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatoIdentificativoDomain {
    private CharSequence idPresupuestoODL;
    private TipoPresupuestoDomain tipoPresupuestoDomain;
    private CompanniaRespServDomain companniaRespServDomain;
    private SistemaOrigenDomain sistemaOrigenDomain;
    private SistemaActualDomain sistemaActualDomain;
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
    private TipoComisionDomain tipoComisionDomain;
    private CharSequence codRenovacion;
    private CharSequence indCompanniaVendedora;
    private CharSequence codOportSalesforce;
    private CharSequence codVersionComercial;
    private PeriodPolizaDomain periodPolizaDomain;
    private CharSequence indOrigRecomendador;
    private CharSequence codEvento;
}
