package com.dm_02_tbdapp.controller;


import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm_02_tbdapp.dao.CatalogDAO;
import com.dm_02_tbdapp.dao.CatalogProductDAO;
import com.dm_02_tbdapp.dao.ImageDAO;


@Service
public class CatalogManager {

    @Autowired
    private CatalogProductDAO productObj;
    
    @Autowired
    private CatalogDAO catalogObj;
    
    @Autowired
    private ImageDAO imageObj;
    
	public JSONObject catalogDetails() {
	JSONObject jsonObj=catalogObj.showMenu();
    return jsonObj;
	}

    public JSONObject retriveProductDetails() {
    	JSONObject jsonObj=productObj.retriveProduct();
    	return jsonObj;
    }
    public String insertImg() {
    	String image=imageObj.insertImage();
    	return image;
    }
    
	}
