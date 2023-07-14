package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DomicilioPresupuesto {
    private CharSequence idDomicilio;
    private PaisPresup paisPresup;
    private LocalidadPresup localidadPresup;
    private ProvinciaPresup provinciaPresup;
    private CharSequence codMunicipio;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucleoPobla;
    private DenomPoblaPresup denomPoblaPresup;
    private CharSequence codPostal;
    private TipoViaPresup tipoViaPresup;
    private CharSequence desDomicilio;
    private CharSequence numNumero;
    private CharSequence numComplemento;
    private CharSequence numBloque;
    private CharSequence numPortal;
    private CharSequence numEscalera;
    private CharSequence numPiso;
    private CharSequence numPuerta;
    private CharSequence bINormalizado;
    private CharSequence desOtrosDatos;
}