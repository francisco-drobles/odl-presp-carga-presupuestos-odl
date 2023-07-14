package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.Metadata;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ObjetosAsegurados {
    private DatoIdentificativo datoIdentificativo;
    private Caracteristica caracteristica;
    private List<UnidadesTarificacion> unidadesTarificacion;
    private List<Campannas> campannas;
    private Metadata metadata;
}
