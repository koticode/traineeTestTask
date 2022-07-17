import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private final String CONST = "const";

    @Test
    public void equalsOneToOne() {
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar() {
        String UNCONST = "newValue"; //здесь переменную CONST заменил на UNCONST, т.к. CONST присвоено неизменное значение в строке 12.
        assertEquals("newValue", UNCONST); //здесь переменную CONST заменил на UNCONST, т.к. CONST присвоено неизменное значение в строке 12.
    }

    @Test
    public void equalsOneToOne2() { // Добавил в название 2 на конце, т.к. возникала ошибка "method equalsOneToOne() is already defined in class WithProblemsTests
        assertEquals(1, 1);
        // также удалил в тесте модификатор доступа static
    }


    @Test
    public void stringsMustBeEquals() {
        String res = "a", bd = "pui"; //инициализировал переменную bd, т.к. без определения ее значения она не могла быть использована в условном операторе. Для успешного прохождения теста присвоил ей значение "pui".
        if (bd == "pui") {
            res = "asd";
        }
        assertEquals("asd", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList() {
        List<String> sourceData = new java.util.ArrayList<>(List.of("1", "viskas", "chupocabra"));
        sourceData.remove(0); // цикл не требуется для удаления первого элемента
        assertFalse(sourceData.contains("1"));
    }

}
