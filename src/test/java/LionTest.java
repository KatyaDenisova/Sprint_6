import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest extends BaseTest {

    @Mock
    protected Feline feline;
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

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

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        doesHaveManeTest("Самец", true);
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        doesHaveManeTest("Самка", false);
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

    private void doesHaveManeTest(String sex, boolean expectedResult) throws Exception {
        //  Arrange
        Lion lion = new Lion(sex, feline);
        //  Act
        var actualResult = lion.doesHaveMane();
        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
