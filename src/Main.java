import java.util.*;

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


        salad.addProductInRecipe(tomatoes, 3);
        salad.addProductInRecipe(cucumbers, 2);
        milkshake.addProductInRecipe(bananas, 3);
        milkshake.addProductInRecipe(milk, 2);

        MathTack mathTack = new MathTack();
        mathTack.addInMathTack("6", 6);
        System.out.println(mathTack.taskMap);
        mathTack.addInMathTack("6", 12);
        System.out.println(mathTack.taskMap);

        Map<String, List<Integer>> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add((int) (Math.random() * 1000));
            list2.add((int) (Math.random() * 1000));
            list3.add((int) (Math.random() * 1000));
            list4.add((int) (Math.random() * 1000));
            list5.add((int) (Math.random() * 1000));
        }
        map1.put("keyOne", list);
        map1.put("keyTwo", list2);
        map1.put("keyThree", list3);
        map1.put("keyFour", list4);
        map1.put("keyFive", list5);
        System.out.println(map1);

        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> value : map1.entrySet()) {
            map2.put(value.getKey(), sumVal(value.getValue()));
        }
        System.out.println(map2);
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 11; i++) {
            String s = "value";
            s += i;
            linkedHashMap.put(i, s);
        }
        System.out.println(linkedHashMap);


    }

    public static int sumVal(List<Integer> list) {
        int sum = 0;
        for (Integer value : list) {
            sum += value;
        }
        return sum;
    }
}