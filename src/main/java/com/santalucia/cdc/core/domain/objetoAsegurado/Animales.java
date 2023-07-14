package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class Animales {
    private CharSequence indTipoEspecie;
    private Raza raza;
    private CharSequence indTipoAnimalComp;
    private CharSequence numIdentAnimalComp;
    private CharSequence nomMascota;
    private CharSequence numChip;
    private Instant fecNacimiento;
    private Double impValorMascota;
    private CharSequence IndPerroMestizo;
    private CharSequence indPerfEstadoSalud;
}
