package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.objetoAsegurado.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class UnidadesTarificacionDomain {
    private CharSequence numIdNivTarificacion;
    private TipoPrimaDomain tipoPrimaDomain;
    private MonedaDomain monedaDomain;
    private NivelTarificacionDomain nivelTarificacionDomain;
    private DatoIdentifTarifDomain datoIdentifTarifDomain;
    private FechaDomain fechaDomain;
    private DatosPropiosDomain datosPropiosDomain;
    private PrimaDomain primaDomain;
    private CapitalDomain capitalDomain;
    private List<SobreprimasDomain> sobreprimas;
    private List<BonificacionesDescDomain> bonificacionesDescDomain;
    private List<ComposicionesGarantiasDomain> composicionesGarantiaDomains;
}
