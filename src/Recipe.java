import java.util.*;

public class Recipe {
    private String nameRecipe;
    private HashMap<Product,Integer> productsMap;
    private int costProducts;


    public Recipe(String nameRecipe, int costProducts) {
        this.nameRecipe = nameRecipe;
        this.productsMap = new HashMap<>();
        this.costProducts = costProducts;
    }
    public HashMap<Product,Integer> getProductsMap() {
        return productsMap;
    }
    public String getNamePecipe() {
        return nameRecipe;
    }


    public int getCostProducts() {
        return costProducts;
    }

    public void addProductInRecipe(Product products, int amount) {
        amount = amount == 0 ? 1 : amount;
        this.productsMap.put(products, amount);
        for (Product product : this.productsMap.keySet()) {
            this.costProducts += product.getCost() * this.productsMap.get(product);
        }

    }
    @Override
    public String toString() {
        return "Recipe{" +
                "recipeSet=" + productsMap +
                ", costProducts=" + costProducts +
                ", nameRecipe='" + nameRecipe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return  Objects.equals(nameRecipe, recipe.nameRecipe);
//        return sumProducts == recipe.sumProducts && Objects.equals(productsSet, recipe.productsSet) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsMap, costProducts, nameRecipe);
    }
}