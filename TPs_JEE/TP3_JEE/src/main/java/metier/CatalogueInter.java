package metier;

import java.util.List;

public interface CatalogueInter {
public List<Produit> getProduitsParMotCle(String mc);
public void addProduit(Produit p);
}