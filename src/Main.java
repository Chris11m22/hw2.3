import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Product> foodBasket = new HashSet<>();

        Product bread = new Product("Хлеб", 69.6, 2);
        Product milk = new Product("Молоко", 48, 1);
        Product bananas = new Product("Бананы", 85, 3);
        Product tomatoes = new Product("Помидоры", 118.9, 2);
        Product cucumbers = new Product("Огурцы", 87, 3);

        bread.addProductsInFoodBasket(foodBasket);
        milk.addProductsInFoodBasket(foodBasket);
        bananas.addProductsInFoodBasket(foodBasket);
        tomatoes.addProductsInFoodBasket(foodBasket);
        cucumbers.addProductsInFoodBasket(foodBasket);
        foodBasket.remove(bananas);
        //System.out.println(foodBasket);


        Set<Recipe> allRecipe = new HashSet<>();
        Recipe salad = new Recipe("Салат", 0);
        Recipe milkshake = new Recipe("Молочный коктейль", 0);

        salad.addProductInRecipe(tomatoes, cucumbers);
        milkshake.addProductInRecipe(milk, bananas);

        salad.addRecipeInSet(allRecipe);
        milkshake.addRecipeInSet(allRecipe);
        //System.out.println(allRecipe);

        Set<Integer> number = new HashSet<>();
        for (int i = 0; i < 21; i++) {
            number.add((int) (Math.random() * 1000) + 1);
        }
        number.removeIf(integer -> integer % 2 != 0);
        System.out.println(number);

    Passport passportOne = new Passport(45676789L, "Злобина ", "Дарья ", "Валерьевна ", "22.11.1997");
    Passport passportTwo = new Passport(234567890L, "Иванов ", "Иван ", "Иванович ", "11.03.2000");
    Passport passportThree = new Passport(45679806L, "Трофимов ", "Олег ", "Михайлович ", "03.12.1976");

    HashMap<Long, Passport> passportMap = new HashMap<>();

        passportMap.put(passportOne.getNumPassport(),passportOne);
        passportMap.put(passportTwo.getNumPassport(),passportTwo);
        passportMap.put(passportThree.getNumPassport(),passportThree);
        System.out.println(passportMap);


        System.out.println(passportMap.get(234567890L));
}
}