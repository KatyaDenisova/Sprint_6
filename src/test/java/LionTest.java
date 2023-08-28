import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest extends BaseTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        //  Arrange
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        var expectedResult = 1;
        //  Act
        var actualResult = lion.getKittens();
        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = Exception.class)
    public void doesHaveManeNegativeTest() throws Exception {
        //  Arrange
        Lion lion = new Lion("хехехе", feline);
        //  Act
        lion.doesHaveMane();
    }

    @Test
    public void getFoodTest() throws Exception {
        //  Arrange
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        var expectedResult = List.of("Животные", "Птицы", "Рыба");
        //  Act
        var actualResult = lion.getFood();
        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
