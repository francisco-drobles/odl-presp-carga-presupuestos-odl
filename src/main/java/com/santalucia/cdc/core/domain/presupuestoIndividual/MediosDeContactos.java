package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MediosDeContactos {
    private MedioContacto medioContacto;
    private PaisOrigen paisOrigen;
    private CharSequence numTelefono;
    private CharSequence nomCorreoElectronico;
}
