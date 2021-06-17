package tv.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitBowl {

    List<Fruit> fruitBowl;

    public FruitBowl() {
        fruitBowl = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruitBowl.add(fruit);
    }
    public void addFruits(List<Fruit> fruit)  {
        fruitBowl.addAll(fruit);
    }

    public List<Fruit> getApples()
    {
        return fruitBowl.stream().filter(fruit -> fruit instanceof Apple).collect(Collectors.toList());
    }
    public List<Fruit> getOranges()
    {
        return fruitBowl.stream().filter(fruit -> fruit instanceof Orange).collect(Collectors.toList());
    }
    public List<Fruit> getBananas()
    {
        return fruitBowl.stream().filter(fruit -> fruit instanceof Banana).collect(Collectors.toList());
    }

    public int getSizeOfBowl()
    {
        return fruitBowl.size();
    }


}
