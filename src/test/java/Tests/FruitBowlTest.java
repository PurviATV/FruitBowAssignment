package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
        Assert.assertEquals(fruitbowl.getSizeOfBowl(),7);
        Reporter.log("Fruit bowl is present with 7 fruits",true);
    }

    @Test
    public void Test002_Get_Apple_Bowl_From_FruitsBowl()
    {
        FruitBowl apples=new FruitBowl();
        apples.addFruits(fruitbowl.getApples());
        Assert.assertEquals(apples.getSizeOfBowl(),2);
        Reporter.log("Apple bowl is created",true);
    }
    @Test
    public void Test003_Get_Orange_Bowl_From_FruitsBowl()
    {
        FruitBowl oranges=new FruitBowl();
        oranges.addFruits(fruitbowl.getOranges());
        Assert.assertEquals(oranges.getSizeOfBowl(),2);
        Reporter.log("Orange bowl is created",true);
    }
    @Test
    public void Test004_Get_Banana_Bowl_From_FruitsBowl()
    {
        FruitBowl bananas=new FruitBowl();
        bananas.addFruits(fruitbowl.getBananas());
        Assert.assertEquals(bananas.getSizeOfBowl(),3);
        Reporter.log("Banana bowl is created",true);
    }

}
