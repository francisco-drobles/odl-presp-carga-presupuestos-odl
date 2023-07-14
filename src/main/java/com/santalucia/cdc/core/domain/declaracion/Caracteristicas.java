package com.santalucia.cdc.core.domain.declaracion;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.Pregunta;
import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.Respuestas;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Caracteristicas {
    private Pregunta pregunta;
    private CharSequence indAplicPregunta;
    private List<Respuestas> respuestas;
}
