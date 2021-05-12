import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericMaxTest {



    @Test
    public void FirstNumMaxTest() {
        GenericMax genericMax = new GenericMax();
        Integer maxInteger = genericMax.MaximumIntiger(9,5,2);
        Assertions.assertEquals(Integer.valueOf(9),maxInteger);
    }
}
