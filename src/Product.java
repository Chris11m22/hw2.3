import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private double price;
    private int weight;

    private boolean bought;

    public Product(String name, double price, int weight) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return price;
    }

    public void setCost(double cost) {
        this.price = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void addProductsInFoodBasket(Set<Product> foodBasket) {
        if (!foodBasket.contains(this)) {
            foodBasket.add(this);
            this.bought = true;
        } else {
            throw new UnsupportedOperationException("Продукт " + this.name + " уже находится в корзине");
        }
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product products = (Product) o;
        return Double.compare(products.price, price) == 0 && Double.compare(products.weight, weight) == 0 && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }
}