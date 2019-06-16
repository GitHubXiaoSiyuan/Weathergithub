package com.example.xiaosiyuan.weather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }//输入getid自动补全

    public void setId(int id) {
        this.id = id;
    }//输入setid自动补全

    public String getCityName() {
        return cityName;
    }//getCityName,自动补全

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }//setCityName,自动补全

    public int getCityCode() {
        return cityCode;
    }//getCityCode,自动补全

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }//setCityCode,自动补全

    public int getProvinceId() {
        return provinceId;
    }//getProvinceId,自动补全

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }//setProvinceId,自动补全
}
