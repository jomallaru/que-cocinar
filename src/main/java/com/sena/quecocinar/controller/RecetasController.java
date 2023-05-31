package com.sena.quecocinar.controller;
import com.sena.quecocinar.model.Recetas;
import com.sena.quecocinar.service.RecetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecetasController {

    @Autowired
    RecetasService recetasService;

    @GetMapping("/recetas")
    private List<Recetas> vereceta (){
    return  recetasService.vereceta();
    }

    @PostMapping ("/recetas")
    private void creareceta(@RequestBody Recetas recetas){
        recetasService.creaYactualizarreceta(recetas);

    }
    @DeleteMapping("/recetas/{id}")
    private void eliminareceta(@PathVariable("id") Long id){
    recetasService.eliminareceta(id);

    }

    @PutMapping("/recetas")
    private void editareceta(@RequestBody Recetas recetas){
        recetasService.creaYactualizarreceta(recetas);

    }
}
