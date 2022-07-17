package Task5;

public class FightRobotCombustion extends FightRobot{

    private String fuel = "горючее"; // бензин, дизель

    @Override
    public String getFuelType() {
        return fuel;
    }

    public FightRobotCombustion(String purpose, String fuel) {
        super(purpose, fuel);
        this.purposeType = purpose;
        this.fuelType = fuel;
    }

    @Override
    public void Fuel() {
        System.out.println("Я использую "+fuel+" топливо");
    }
}

