package org.example.assets;

import java.util.Date;

public class Account {
    private static int codeCount = 1;
    private int code;
    private String proprietary;
    private double solde;
    private Date creationDate ;

    public Account(String proprietary) {
        this.proprietary = proprietary;
        this.solde = 0;
        this.code = codeCount++;
        this.creationDate = new Date();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProprietary() {
        return proprietary;
    }

    public void setProprietary(String proprietary) {
        this.proprietary = proprietary;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        String result;
        result = "\tAccount [code=" + code + ", proprietary=" + proprietary + ", solde=" + solde + ", creationDate=" + creationDate + "]";
        return result;
    }
}
