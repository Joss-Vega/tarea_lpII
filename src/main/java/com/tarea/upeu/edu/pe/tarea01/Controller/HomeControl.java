/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.upeu.edu.pe.tarea01.Controller;

import com.tarea.upeu.edu.pe.tarea01.Service.ServProducto;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author NITRO5
 */
public class HomeControl {
    @Autowired
    private ServProducto sp;
    @GetMapping("/productos")
    List<Map<String, Object>>mensaje(){
    return sp.readAll();
}
    }
