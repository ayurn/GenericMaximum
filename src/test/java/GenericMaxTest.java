import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericMaxTest {

    @Test
    public void FirstNumMaxTest() {
        GenericMax genericMax = new GenericMax();
        Integer maxInteger = genericMax.MaximumIntiger(9,5,2);
        Assertions.assertEquals(Integer.valueOf(9),maxInteger);
    }

    @Test
    public void SecondNumMaxTest() {
        GenericMax genericMax = new GenericMax();
        Integer maxInteger = genericMax.MaximumIntiger(9,15,8);
        Assertions.assertEquals(Integer.valueOf(15),maxInteger);
    }

    @Test
    public void ThirdNumMaxTest() {
        GenericMax genericMax = new GenericMax();
        Integer maxInteger = genericMax.MaximumIntiger(9,15,21);
        Assertions.assertEquals(Integer.valueOf(21),maxInteger);
    }

    //UC-2 Given 3 Floats find the maximum //TC--2.1 //Floats
    @Test
    public void givenMaxFloatAtFirstPosition(){
        GenericMax genericMax = new GenericMax();
        Double maxDouble = genericMax.maxPositionDouble(2.5,2.3,2.1);
        Assertions.assertEquals(Double.valueOf(2.5),maxDouble);
    }

    //TC--2.2
    @Test
    public void givenMaxFloatAtSecondPosition(){
        GenericMax genericMax = new GenericMax();
        Double maxDouble = genericMax.maxPositionDouble(2.5,2.6,2.1);
        Assertions.assertEquals(Double.valueOf(2.6),maxDouble);
    }

    //TC--2.3
    @Test
    public void givenMaxFloatAtThirdPosition(){
        GenericMax genericMax = new GenericMax();
        Double maxDouble = genericMax.maxPositionDouble(2.5,2.3,2.7);
        Assertions.assertEquals(Double.valueOf(2.7),maxDouble);
    }

}
