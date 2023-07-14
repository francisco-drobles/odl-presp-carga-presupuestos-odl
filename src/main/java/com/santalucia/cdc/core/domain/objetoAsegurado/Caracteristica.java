package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class Caracteristica {
    private List<Domicilios> domicilios;
    private List<Figuras> figuras;
    private List<Animales> animales;
    private List<DispositivosElectr> dispositivosElectr;
}
