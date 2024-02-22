import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionAppProduits {
    public static void main(String[] args) {
        List<Produit> Produits_list = new ArrayList<>();

        Produits_list.add(new Produit(1, "laptop", 10000));
        Produits_list.add(new Produit(2, "phone", 6000));
        Produits_list.add(new Produit(3, "book", 100));

        System.out.println(Produits_list);

        // remove product by index
        Produits_list.remove(1);
        // display list
        System.out.println(Produits_list);
        // modify product by index
        // modify the product id 3
        for(Produit produit:Produits_list) {
            if (produit.getId() == 3) {
                produit.setNom("book 1");
                produit.setPrix(120);
                break;
            }
        }
        // display list
        System.out.println(Produits_list);

        // display product by inserting name by the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of the product !!");
        String product_name = scanner.nextLine();

        boolean found = false;
        for(Produit produit : Produits_list) {
            if (produit.getNom().equalsIgnoreCase(product_name)){
                System.out.println("product found");
                System.out.println(produit);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Product not found");
        }
    }
}
