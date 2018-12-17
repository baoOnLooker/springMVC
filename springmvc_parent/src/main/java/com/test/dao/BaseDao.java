package com.test.dao;

import java.util.List;

public interface BaseDao<T> {

    public void insert(T t);

    public void delete(T t);

    public List<T> queryAll();

    public T queryOne(T t);

    public void update(T t);

}
