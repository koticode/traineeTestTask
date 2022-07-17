package Task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Robots> CreateRobots=new ArrayList<>(); // Заводим массив для создаваемых роботов, чтобы было удобно проводить проверку по каждому из них.

// Создаем роботов по каждому виду назначения с каждым видом топлива - это будут объекты различных классов(для каждой разновидности создан свой класс)
// Роботы создаются по конструктору с 2-мя вводными - назначением робота и типом топлива.В конструкторе при задании вводных можно допустить ошибку. Ниже, в цикле, выполняется проверка заданных назначения и вида топлива на корректность.
        FightRobotNuclear robot1=new FightRobotNuclear("боевой","атомное");
        FightRobotCombustion robot2=new FightRobotCombustion("сварщик","горючее");//для негативной проверки при создании неправильно выбрано назначение робота-оно не соответствует классу, объект которого мы создаем.
        FightRobotElectric robot3=new FightRobotElectric("боевой","горючее");// для негативной проверки при создании неправильно выбран тип топлива-оно не соответствует классу, объект которого мы создаем.
        WadleRobotNuclear robot4=new WadleRobotNuclear("сварщик","атомное");
        WadleRobotCombustion robot5=new WadleRobotCombustion("сварщик","горючее");
        WadleRobotElectric robot6=new WadleRobotElectric("сварщик","электрическое");
        CookRobotNuclear robot7=new CookRobotNuclear("повар","атомное");
        CookRobotCombustion robot8=new CookRobotCombustion("повар","горючее");
        CookRobotElectric robot9=new CookRobotElectric("повар","электрическое");
// Создаем 9 роботов, согласно заданию:
        CreateRobots.add(robot1);
        CreateRobots.add(robot2);
        CreateRobots.add(robot3);
        CreateRobots.add(robot4);
        CreateRobots.add(robot5);
        CreateRobots.add(robot6);
        CreateRobots.add(robot7);
        CreateRobots.add(robot8);
        CreateRobots.add(robot9);

        int i;
        for (i=0; i< CreateRobots.size(); i++) {
            System.out.println("Робот " + (i+1)+":");
//            Проверка робота по назначению и топливу, корректно ли создан робот(в конструкторе данные purpose и fuel могли быть введены неверно):
            if (!CreateRobots.get(i).purposeType.equals(CreateRobots.get(i).getPurposeType()) ) {
                System.out.println("Внимание!!!Задано назначение, не соответсвующее моей спецификации. Исправьте назначение на "+'"'+CreateRobots.get(i).getPurposeType()+'"'+" или используйте другой класс для создания робота назначения " + '"' + CreateRobots.get(i).purposeType + '"');
            }
            else if (!CreateRobots.get(i).fuelType.equals(CreateRobots.get(i).getFuelType())) {
                System.out.println("Внимание!!!Задан тип топлива, не соответсвующий моей спецификации.Исправьте тип топлива на "+'"'+CreateRobots.get(i).getFuelType()+'"'+" или используйте другой класс для создания робота c типом топлива " +'"'+CreateRobots.get(i).fuelType+'"');
            }
            // После проведения проверки и добавления комментария в случае ошибки, выводим информацию о роботе
            CreateRobots.get(i).aboutMe();
//              Проверка, требуется ли роботу заправка. Если требуется, тогда заправляем. По условию задачи, надо продемонстрировать заправку каждого робота, поэтому критерии установлены так, чтобы запрос на заправку возникал у всех.
            if (CreateRobots.get(i).getNeedfuel().equals("Заправьте меня, пожалуйста")){ //Если робот сообщил, что ему нужна заправка
                validfuel = CreateRobots.get(i).getFuelType(); // Узнаем, какое топливо нужно роботу
                RefuelWhenAsk(); //Выполняем заправку робота требуемым топливом
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    public static String validfuel; // Поле хранит значение, какое топливо нужно роботу.
    public static void RefuelWhenAsk(){ //Чтобы мы могли заправлять робота по его просьбе, создан отдельный метод. Допустим, что заправкой занимается какой-то техник.
        String selectFuel=validfuel; //узнаем, какое топливо нужно именно для этого робота.
        System.out.println("Ответ техника: Твоя просьба выполнена-ты заправлен! Тип топлива-"+selectFuel+".Это то, что тебе нужно!");
    }
}
