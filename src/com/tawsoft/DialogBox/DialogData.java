/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tawsoft.DialogBox;

/**
 *
 * @author tawsoft
 */
public class DialogData {
    //Class used to store data
    public  static String dTitle;
    public static String dBody;
    public static int dOk;
    public static int dCancel;
    public static String dbodyto;
    
    private void setDTitle(String v){
        dTitle=v;
    }
    
    private void setDBody(String v){
        dTitle=v;
    }
    private void setdOk(int v){
        dOk=v;
    }
    private void setdCancel(int v){
        dCancel=v;
    }
    private void setDbodyto(String v){
        dbodyto=v;
    }
    
    private String getDTitle(){
        return dTitle;
    }
    
    private String getDBody(){
        return dTitle;
    }
      private int getdOk(){
        return dOk;
    }
    private int getdCancel(){
        return dCancel;
    }
      private String getDbodyto(){
        return dbodyto;
    }
}
