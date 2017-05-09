package com.example.dd.retrofit2;

/**
 * Created by dd on 08.05.2017.
 */

public class AndroidVersion {

    private String ver;
    private String name;
    private String api;

    public AndroidVersion(String ver, String name, String api) {
        this.ver = ver;
        this.name = name;
        this.api = api;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
