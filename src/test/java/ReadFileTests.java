import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException { // throws Добавляется на случай, если файл не будет найден. В видео он добавляется  в класс main, но в коде тестов этот класс не используется, поэтому попробовал добавить сюда.
        //write here second task
        String line2 = Files.readAllLines(Paths.get("C:\\Users\\и\\IdeaProjects\\traineeTestTask\\src\\test\\resources\\ReadFileTests.txt")).get(1); //!!!Путь к файлу на вашем компьютере будет отличаться.
        assertTrue(line2.contains("аллоха")); // может возвращать false из-за неверного распознавания кириллицы в условии contains. У меня на Windows все работает.
    }
    }






