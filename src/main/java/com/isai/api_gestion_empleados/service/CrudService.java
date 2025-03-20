package com.isai.api_gestion_empleados.service;

import java.util.List;

public interface CrudService<T> {
    public T create(T T);

    public T update(T T, String code);

    public void delete(String code);

    public T findById(String code);

    List<T> findAll();
}
