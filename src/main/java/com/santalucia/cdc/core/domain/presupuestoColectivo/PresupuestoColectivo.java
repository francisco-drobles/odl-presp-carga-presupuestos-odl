package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.Metadata;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class PresupuestoColectivo {
    private DatoIdentificativo datoIdentificativo;
    private Producto producto;
    private FechaYEstado fechaYEstado;
    private DatoCobro datoCobro;
    private Figura figura;
    private EstructuraComercial estructuraComercial;
    private EstructuraGeografica estructuraGeografica;
    private List<Campannas> campannas;
    private List<ObjetosAsegurados> objetosAsegurados;
    private Metadata metadata;
}
