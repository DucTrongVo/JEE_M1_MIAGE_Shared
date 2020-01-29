/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ejb.Remote;

/**
 *
 * @author trongvo
 */
@Remote
public interface ServicesCollaborateurRemote {
    public void creerClientCollab(String nom, String prenom);
    
    public void ouvrirCompteCollab(Long idClient);
    
    public void listeCompteCollab(Long idClient);
    
    public void fermetureCompteCollab();
}
