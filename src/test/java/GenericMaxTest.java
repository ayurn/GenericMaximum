import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericMaxTest {

    //Refactor-1 Refactor all the 3 to One Generic Method and find the maximum
    // Integer
    @Test
    public void givenThreeIntegersShouldReturnMaxPosition(){
        Integer[] intArray = {9, 5, 2, 3, 4};
        GenericMax genericMax = new GenericMax();
        Integer maxInt = (Integer) genericMax.max(intArray);
        Assertions.assertEquals(Integer.valueOf(9),maxInt);
    }

    //Float
    @Test
    public void givenThreeFloatsShouldReturnMaxPosition(){
        Double[] floatArray = {9.1, 5.2, 2.25, 3.63, 4.5};
        GenericMax genericMax = new GenericMax();
        Double maxFloat = (Double) genericMax.max(floatArray);
        Assertions.assertEquals(Double.valueOf(9.1),maxFloat);
    }

    //String
    @Test
    public void givenThreeStringsShouldReturnMaxPosition(){
        String[] stringArray = {"Pineapple", "Apple", "Banana", "Ice", "An"};
        GenericMax genericMax = new GenericMax();
        String maxString = (String) genericMax.max(stringArray);
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }
    //refactor2
    @Test
    public void FirstNumMaxTest() {
        Integer[] intArray = {9, 5, 2, 3, 4};
        GenericMax genericMax = new GenericMax();
        Integer maxInt = (Integer) genericMax.max(intArray);
        Assertions.assertEquals(Integer.valueOf(9),maxInt);
    }

    @Test
    public void SecondNumMaxTest() {
        Integer[] intArray = {5, 9, 2, 3, 4};
        GenericMax genericMax = new GenericMax();
        Integer maxInt = (Integer) genericMax.max(intArray);
        Assertions.assertEquals(Integer.valueOf(9),maxInt);
    }

    @Test
    public void ThirdNumMaxTest() {
        Integer[] intArray = {9, 5, 12, 3, 4};
        GenericMax genericMax = new GenericMax();
        Integer maxInt = (Integer) genericMax.max(intArray);
        Assertions.assertEquals(Integer.valueOf(12),maxInt);
    }

    //UC-2 Given 3 Floats find the maximum //TC--2.1 //Floats
    @Test
    public void givenMaxFloatAtFirstPosition(){
        Double[] floatArray = {9.1, 5.2, 2.25, 3.63, 4.5};
        GenericMax genericMax = new GenericMax();
        Double maxFloat = (Double) genericMax.max(floatArray);
        Assertions.assertEquals(Double.valueOf(9.1),maxFloat);
    }

    //TC--2.2
    @Test
    public void givenMaxFloatAtSecondPosition(){
        Double[] floatArray = {9.1, 51.2, 2.25, 3.63, 4.5};
        GenericMax genericMax = new GenericMax();
        Double maxFloat = (Double) genericMax.max(floatArray);
        Assertions.assertEquals(Double.valueOf(51.2),maxFloat);
    }

    //TC--2.3
    @Test
    public void givenMaxFloatAtThirdPosition(){
        Double[] floatArray = {9.1, 5.2, 27.25, 3.63, 4.5};
        GenericMax genericMax = new GenericMax();
        Double maxFloat = (Double) genericMax.max(floatArray);
        Assertions.assertEquals(Double.valueOf(27.25),maxFloat);
    }
    //TC--3.1
    @Test
    public void givenMaxStringAtFirstPositionShouldReturnSame(){
        String[] stringArray = {"Pineapple", "Apple", "Banana", "Ice", "An"};
        GenericMax genericMax = new GenericMax();
        String maxString = (String) genericMax.max(stringArray);
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }

    //TC--3.2
    @Test
    public void givenMaxStringAtSecondPositionShouldReturnSame(){
        String[] stringArray = {"Apple", "Pineapple", "Banana", "Ice", "An"};
        GenericMax genericMax = new GenericMax();
        String maxString = (String) genericMax.max(stringArray);
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }

    //TC--3.3
    @Test
    public void givenMaxStringAtThirdPositionShouldReturnSame(){
        String[] stringArray = {"Apple", "Banana", "Pineapple", "Ice", "An"};
        GenericMax genericMax = new GenericMax();
        String maxString = (String) genericMax.max(stringArray);
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }

}
