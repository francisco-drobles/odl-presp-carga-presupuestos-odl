package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.objetoAsegurado.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class UnidadesTarificacion {
    private CharSequence numIdNivTarificacion;
    private TipoPrima tipoPrima;
    private Moneda moneda;
    private NivelTarificacion nivelTarificacion;
    private DatoIdentifTarif datoIdentifTarif;
    private Fecha fecha;
    private DatosPropios datosPropios;
    private Prima prima;
    private Capital capital;
    private List<Sobreprimas> sobreprimas;
    private List<BonificacionesDesc> bonificacionesDesc;
    private List<ComposicionesGarantias> composicionesGarantias;
}
