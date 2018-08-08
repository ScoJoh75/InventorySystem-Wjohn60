package Model;

import javafx.beans.Observable;
import javafx.collections.ObservableList;

public class Inventory {
    private ObservableList<Product> products;
    private ObservableList<Part> allParts;

    public void addProduct(Product product) {
        this.products.add(product);
    } // end addProduct

    public boolean removeProduct(int productNum) {
        boolean removed;
        try {
            products.remove(productNum);
            removed = true;
        } catch (IndexOutOfBoundsException e) {
            removed = false;
        }
        return removed;
    } // end removeProduct

    public Product lookupProduct(int productNum) {
        return products.get(productNum);
    } // end lookupProduct

    public void updateProduct(int productNum, Product product) {
        products.set(productNum, product);
    } // end updateProduct

    public void addPart(Part part) {
        this.allParts.add(part);
    } // end addPart

    public boolean deletePart(Part partNum) {
        boolean removed;
        try {
            allParts.remove(partNum);
            removed = true;
        } catch (IndexOutOfBoundsException e) {
            removed = false;
        }
        return removed;
    } // end deletePart

    public Part lookupPart(int partNum) {
        return allParts.get(partNum);
    } // end lookupPart

    public void updatePart(int partNum, Part part) {
        allParts.set(partNum, part);
    } // end updatePart

} // end Inventory