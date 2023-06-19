import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest extends BaseTest {
    @Mock
    protected Feline feline;

    @Test
    public void getSoundTest() {
        //  Arrange
        Cat cat = new Cat(feline);
        var expectedResult = "Мяу";
        //  Act
        var actualResult = cat.getSound();
        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        //  Arrange
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        var expectedResult = List.of("Животные", "Птицы", "Рыба");
        //  Act
        var actualResult = cat.getFood();
        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
