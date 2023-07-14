package com.santalucia.cdc.core.domain.declaracion;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.Pregunta;
import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.Respuestas;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CaracteristicasDomain {
    private PreguntaDomain preguntaDomain;
    private CharSequence indAplicPregunta;
    private List<RespuestasDomain> respuestas;
}
