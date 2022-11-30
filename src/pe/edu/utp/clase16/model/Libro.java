/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.clase16.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author GamingWorld
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int idlibro;
    private String titulo;
    private int anio;
    private int npaginas;
    private int idautor;
}


