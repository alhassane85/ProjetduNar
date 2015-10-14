package fst.info.springhibernate.dao;

import java.util.List;

import fst.info.springhibernate.*;
import fst.info.springhibernate.model.Categorie;
import fst.info.springhibernate.model.Client;
import fst.info.springhibernate.model.Commande;
import fst.info.springhibernate.model.Panier;
import fst.info.springhibernate.model.Produit;
public interface IBoutiqueDao {
public Long ajouterCategorie(Categorie c);
public List<Categorie> listCategories();
public Categorie getCategorie(Long idCat);
public void supprimerCategrorie(Long idcat);
public void modifierCategorie(Categorie c);
public
 Long ajouterProduit(Produit p, Long idCat);
public
 List<Produit> listproduits();
public
 List<Produit> produitsParMotCle(String mc);
public
 List<Produit> produitsParCategorie(Long idCat);
public
 List<Produit> produitsSelectionnes();
public
 Produit getProduit(Long idP);
public
 void supprimerProduit(Long idP);
public
 void modifierProduit(Produit p);
//public void ajouterUser(User u);
//public void attribuerRole(Role r,Long userID);
public Commande enregistrerCommande(Panier p,Client c);
}