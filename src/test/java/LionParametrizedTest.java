import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean hasManeResult;
    private final Feline feline;

    public LionParametrizedTest(String sex, boolean hasManeResult) {
        this.sex = sex;
        this.hasManeResult = hasManeResult;
        this.feline = new Feline();
    }

    @Parameterized.Parameters
    public static Object[][] sexAndManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testDoesLionHasMane() throws Exception{
        Lion lion = new Lion(sex,feline);
        assertEquals(hasManeResult,lion.doesHaveMane());
    }
}
