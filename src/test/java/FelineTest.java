import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest extends BaseTest {

    @Test
    public void eatMeatTest() throws Exception {
        //  Arrange
        Feline feline = new Feline();
        var expectedResult = List.of("Животные", "Птицы", "Рыба");
        //  Act
        var actualResult = feline.eatMeat();
        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyTest() {
        //  Arrange
        Feline feline = new Feline();
        var expectedResult = "Кошачьи";
        //  Act
        var actualResult = feline.getFamily();
        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensSimpleTest() {
        //  Arrange
        Feline feline = new Feline();
        var expectedResult = 1;
        //  Act
        var actualResult = feline.getKittens();
        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParameterTest() {
        //  Arrange
        Feline feline = new Feline();
        var expectedResult = 5;
        //  Act
        var actualResult = feline.getKittens(5);
        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
