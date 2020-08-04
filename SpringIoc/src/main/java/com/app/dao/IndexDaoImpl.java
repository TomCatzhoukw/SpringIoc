package com.app.dao;

import com.app.service.IndexService;

public class IndexDaoImpl implements IndexDao {

    private IndexService service;

    public IndexDaoImpl(IndexService service) {
        this.service = service;
    }

    public void test(){
        System.out.println("test");
    }

}
