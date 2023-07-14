package com.santalucia.cdc.core.domain.declaracion;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.RespFacilitada;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Respuestas {
    private RespFacilitada respFacilitada;
    private CharSequence indTipoRespuesta;
}
