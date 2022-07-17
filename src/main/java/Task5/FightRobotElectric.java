package Task5;

public class FightRobotElectric extends FightRobot{

    private String fuel = "электрическое"; // бензин, дизель

    @Override
    public String getFuelType() {
        return fuel;
    }

    public FightRobotElectric(String purpose, String fuel) {
        super(purpose, fuel);
        this.purposeType = purpose;
        this.fuelType = fuel;
    }

    @Override
    public void Fuel() {
        System.out.println("Я использую "+fuel+" топливо");
    }
}

