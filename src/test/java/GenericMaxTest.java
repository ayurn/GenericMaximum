import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericMaxTest {

    //Refactor-1 Refactor all the 3 to One Generic Method and find the maximum
    // Integer
    @Test
    public void givenThreeIntegers_shouldReturnMaxPosition(){
        GenericMax genericMax = new GenericMax(9,5,2, 3, 4);
        Integer maxInt = (Integer) genericMax.maximumGeneric();
        Assertions.assertEquals(Integer.valueOf(9),maxInt);
    }

    //Float
    @Test
    public void givenThreeFloats_shouldReturnMaxPosition(){
        GenericMax genericMax = new GenericMax(2.7,2.1,2.2, 2.3, 2.5);
        Double maxFloat = (Double) genericMax.maximumGeneric();
        Assertions.assertEquals(Double.valueOf(2.7),maxFloat);
    }

    //String
    @Test
    public void givenThreeStrings_shouldReturnMaxPosition(){
        GenericMax genericMax = new GenericMax("Pineapple", "Apple", "Banana", "Ice", "An");
        String maxString = (String) genericMax.maximumGeneric();
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }
    //refactor2
    @Test
    public void FirstNumMaxTest() {
        GenericMax genericMax = new GenericMax(9,5,2, 3, 4);
        Integer maxInt = (Integer) genericMax.maximumGeneric();
        Assertions.assertEquals(Integer.valueOf(9),maxInt);
    }

    @Test
    public void SecondNumMaxTest() {
        GenericMax genericMax = new GenericMax(5,9,2, 3, 4);
        Integer maxInt = (Integer) genericMax.maximumGeneric();
        Assertions.assertEquals(Integer.valueOf(9),maxInt);
    }

    @Test
    public void ThirdNumMaxTest() {
        GenericMax genericMax = new GenericMax(9,5,21, 4, 8);
        Integer maxInt = (Integer) genericMax.maximumGeneric();
        Assertions.assertEquals(Integer.valueOf(21),maxInt);
    }

    //UC-2 Given 3 Floats find the maximum //TC--2.1 //Floats
    @Test
    public void givenMaxFloatAtFirstPosition(){
        GenericMax genericMax = new GenericMax(2.21,2.1,2.2, 2.19, 2.14);
        Double maxFloat = (Double) genericMax.maximumGeneric();
        Assertions.assertEquals(Double.valueOf(2.21),maxFloat);
    }

    //TC--2.2
    @Test
    public void givenMaxFloatAtSecondPosition(){
        GenericMax genericMax = new GenericMax(2.3,2.34,2.2, 2.22, 2.15);
        Double maxFloat = (Double) genericMax.maximumGeneric();
        Assertions.assertEquals(Double.valueOf(2.34),maxFloat);
    }

    //TC--2.3
    @Test
    public void givenMaxFloatAtThirdPosition(){
        GenericMax genericMax = new GenericMax(2.3,2.1,2.23, 2.22, 2.16);
        Double maxFloat = (Double) genericMax.maximumGeneric();
        Assertions.assertEquals(Double.valueOf(2.23),maxFloat);
    }
    //TC--3.1
    @Test
    public void givenMaxStringAtFirstPosition_shouldReturnSame(){
        GenericMax genericMax = new GenericMax("Pineapple", "Apple", "Banana", "Ice", "An");
        String maxString = (String) genericMax.maximumGeneric();
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }

    //TC--3.2
    @Test
    public void givenMaxStringAtSecondPosition_shouldReturnSame(){
        GenericMax genericMax = new GenericMax("Apple", "Pineapple", "Banana", "An", "Ice");
        String maxString = (String) genericMax.maximumGeneric();
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }

    //TC--3.3
    @Test
    public void givenMaxStringAtThirdPosition_shouldReturnSame(){
        GenericMax genericMax = new GenericMax("Apple", "Banana", "Pineapple", "Ice", "An");
        String maxString = (String) genericMax.maximumGeneric();
        Assertions.assertEquals(String.valueOf("Pineapple"),maxString);
    }

}
