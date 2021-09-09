/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.upeu.edu.pe.tarea01.Service;

import com.tarea.upeu.edu.pe.tarea01.Entitty.Productos;
import java.util.List;
import java.util.Map;
/**
 *
 * @author NITRO5
 */
public interface ServProducto {
    List<Map<String, Object>> readAll();
    int create(Productos p);
    int update(Productos p);
    int delete(int id);
    Productos read(int id);
    Productos searchProducto(String nombre);
}
