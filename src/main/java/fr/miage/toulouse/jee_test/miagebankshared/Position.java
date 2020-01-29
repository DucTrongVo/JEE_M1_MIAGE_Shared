/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.jee_test.miagebankshared;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author trongvo
 */
public class Position implements Serializable{
    private double solde;
    private Date date;

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Position(double solde, Date date){
        this.solde = solde;
        this.date =date;
    }

}
