package com.portfolio.elsio.service;

import java.util.List;

public interface IService <K, O>{
    public void create(O o);
    public void update(O o);
    public void delete(K k);
    public O getById(K k);
    public List<O> toList();
    
}
