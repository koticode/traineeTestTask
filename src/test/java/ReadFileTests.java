import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException { // throws ����������� �� ������, ���� ���� �� ����� ������. � ����� �� �����������  � ����� main, �� � ���� ������ ���� ����� �� ������������, ������� ���������� �������� ����.
        //write here second task
        String line2 = Files.readAllLines(Paths.get("C:\\Users\\�\\IdeaProjects\\traineeTestTask\\src\\test\\resources\\ReadFileTests.txt")).get(1); //!!!���� � ����� �� ����� ���������� ����� ����������.
        assertTrue(line2.contains("������")); // ����� ���������� false ��-�� ��������� ������������� ��������� � ������� contains. � ���� �� Windows ��� ��������.
    }
    }






