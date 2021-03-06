package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by uidp4879 on 2017/11/23.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public int getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
