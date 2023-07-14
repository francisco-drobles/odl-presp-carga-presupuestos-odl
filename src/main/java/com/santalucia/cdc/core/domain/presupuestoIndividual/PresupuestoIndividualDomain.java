package com.santalucia.amw.domain.presupuestoIndividual;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PresupuestoIndividualDomain {
    private DatoIdentificativo datoIdentificativo;
    private Producto producto;
    private FechaYEstado fechaYEstado;
    private DatoCobro datoCobro;
    private Figura figura;
    private EstructuraComercial estructuraComercial;
    private EstructuraGeografica estructuraGeografica;
    private Importe importe;
    private List<Campannas> campannas;
    private List<ObjetosAsegurados> objetosAsegurados;
    private Metadata metadata;
}
