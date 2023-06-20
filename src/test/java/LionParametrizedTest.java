import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest extends BaseTest {

    @Mock
    private Feline feline;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true}, {"Самка", false}
        });
    }

    @Parameter
    public String sex;
    @Parameter(1)
    public boolean haveMane;

    @Test
    public void doesHaveManeTest() throws Exception {
        //  Arrange
        Lion lion = new Lion(sex, feline);
        //  Act
        var actualResult = lion.doesHaveMane();
        // Assert
        assertEquals(haveMane, actualResult);
    }
}
