import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String nameRecipe;
    private Set<Product> productsSet;
    private int costProducts;


    public Recipe(String nameRecipe, int costProducts) {
        this.nameRecipe = nameRecipe;
        this.productsSet = new HashSet<>();
        this.costProducts = costProducts;
    }

    public String getNamePecipe() {
        return nameRecipe;
    }

    public Set<Product> getProductsSet() {
        return productsSet;
    }

    public int getCostProducts() {
        return costProducts;
    }

    public void addProductInRecipe(Product... products) {
        this.productsSet.addAll(Arrays.asList(products));
        for (Product prod : this.productsSet) {
            this.costProducts += prod.getCost();
        }
    }

    public void addRecipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.nameRecipe + " уже существует");
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeSet=" + productsSet +
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
        return Objects.hash(productsSet, costProducts, nameRecipe);
    }
}