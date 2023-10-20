package com.example.tesmasuya;

import com.google.gson.annotations.SerializedName;
//
//public class Results {
//    @SerializedName("UID")
//    private String superName;
//
//
//    public Results(String name) {
//        this.superName = name;
//    }
//
//    public String getName() {
//        return superName;
//    }
//}

public class Results {

    @SerializedName("UID")
    private String superUID;
    @SerializedName("UName")
    private String superUName;
    @SerializedName("UPW")
    private String superUPW;
    @SerializedName("KdRole")
    private String superKdRole;

    @SerializedName("NmRole")
    private String superNmRole;


    public Results(String UID,String UName,String UPW,String KdRole,String NmRole) {
        this.superUID = UID;
        this.superUName = UName;
        this.superUPW = UPW;
        this.superKdRole=KdRole;
        this.superNmRole=NmRole;
    }
    public void setUId(String UID) {
        this.superUID = UID;
    }
    public void setUName(String UName) {
        this.superUName = UName;
    }
    public void setUPW(String UPW) {
        this.superUPW = UPW;
    }
    public void setNmRole(String NmRole) {
        this.superNmRole = NmRole;
    }
    public void setKdRole(String KdRole) {
        this.superKdRole = KdRole;
    }
    public String getName() {
        return this.superUName;
    }
    public String getUID() {
        return this.superUID;
    }
    public String getUPW() {
        return this.superUPW;
    }
    public String getKdRole(){
        return this.superKdRole;
    }
    public String getNmRole(){
        return this.superNmRole;
    }
}