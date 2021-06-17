package tv.assignment;

import tv.assignment.Apple;
import tv.assignment.Banana;
import tv.assignment.Orange;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {

    List<Apple> appleBowl;
    List<Banana> bananaBowl ;
    List<Orange> orangeBowl ;
    List<Object> mixFruitBowl;

    public FruitBowl() {
        appleBowl = new ArrayList<>();
        bananaBowl = new ArrayList<>();
        orangeBowl = new ArrayList<>();
        mixFruitBowl = new ArrayList<>();

    }

    public void addFruit(Object fruit) {
        mixFruitBowl.add(fruit);

    }
    public List<Object> getFruitList()
    {
        return mixFruitBowl;
    }

    public void segregateFruits() {
        for (Object fruit : mixFruitBowl)
            if (fruit instanceof Apple)
                appleBowl.add((Apple) fruit);
            else if (fruit instanceof Orange)
                orangeBowl.add((Orange) fruit);
            else if (fruit instanceof Banana)
                bananaBowl.add((Banana) fruit);
    }


    public int getCountInFruitBowl() {
        return mixFruitBowl.size();
    }

    public int getCountInAppleBowl() {
        return appleBowl.size();

    }

    public int getCountInBananaBowl() {
        return bananaBowl.size();
    }


    public int getCountInOrangeBowl() {
        return orangeBowl.size();
    }
}
