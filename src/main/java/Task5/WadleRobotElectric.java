package Task5;

// Наследование полей и методов от класса сварщиков
public class WadleRobotElectric extends WadleRobot{

    // Для создания подобных классов с другим видом топлива удобно ввести переменную, т.к. в классе тип топлива встречается еще дважды. Меняем значение в одном месте- и, например, класс WadleRobotElectric готов.
    private String fuel = "электрическое"; // Инкапсуляция-фиксируется значение типа топлива для этого класса.

    @Override
    public String getFuelType() {
        return fuel;
    }

    public WadleRobotElectric(String purpose, String fuel) { // по этому конструктору создаются объекты - экземпляры роботов
        super(purpose, fuel);
        this.purposeType = purpose;
        this.fuelType = fuel;
    }

    @Override
    public void Fuel() {
        System.out.println("Я использую "+fuel+" топливо");
    }
}
