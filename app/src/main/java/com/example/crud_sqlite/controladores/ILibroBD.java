package com.example.crud_sqlite.controladores;

import com.example.crud_sqlite.modelos.Libro;

import java.util.List;

public interface ILibroBD {

    Libro elemento(int id);
    Libro elemento(String title);
    List<Libro> lista();
    void agregar(Libro book);
    void actualizar(int id, Libro book);
    void borrar(int id);

}
