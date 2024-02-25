import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.CalcService;

public class CalcServiceTest {
    @Test
    public void shouldQuantityMonthForRelax(){
        CalcService service = new CalcService();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);


            }
   @Test
   public void shouldQuantityMonthForRelax2(){
        CalcService service = new CalcService();

        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
   }

        }

