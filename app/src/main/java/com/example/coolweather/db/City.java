package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by uidp4879 on 2017/11/23.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int proviceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public void setProviceId(int proviceId){
        this.proviceId = proviceId;
    }
}
