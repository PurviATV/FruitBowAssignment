package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tv.assignment.*;

public class FruitBowlTest {
    FruitBowl fruitbowl;
    @BeforeClass
        public void CreateFruitBowl()
    {
        fruitbowl = new FruitBowl();
        fruitbowl.addFruit(new Apple("Red","sweet"));
        fruitbowl.addFruit(new Apple("Green","sweet"));
        fruitbowl.addFruit(new Orange("Orange","sour"));
        fruitbowl.addFruit(new Orange("Orange","sweet-tart"));
        fruitbowl.addFruit(new Banana("Yellow","sweet"));
        fruitbowl.addFruit(new Banana("Yellow","sweet"));
        fruitbowl.addFruit(new Banana("Green","bitter"));
    }

    @Test
    public void Test001_Verify_Count_Of_Fruits_In_FruitBowl()
    {
        Assert.assertEquals(fruitbowl.getCountInFruitBowl(),7);
        Reporter.log("Fruit bowl is present with 7 fruits",true);
    }

    @Test
    public void Test002_SegregateFruits_And_Verify_Count_In_Each_Bowl()
    {
        SoftAssert soft=new SoftAssert();
        fruitbowl.segregateFruits();
        soft.assertEquals(fruitbowl.getCountInAppleBowl(),2);
        soft.assertEquals(fruitbowl.getCountInBananaBowl(),3);
        soft.assertEquals(fruitbowl.getCountInOrangeBowl(),2);
        soft.assertAll();
        Reporter.log("Fruit bowl is segregated in 3 bowls",true);
    }
}
