package Task5;

public class FightRobotNuclear extends FightRobot{

    private String fuel = "атомное";

    @Override
    public String getFuelType() {
        return fuel;
    }

    public FightRobotNuclear(String purpose, String fuel) {
        super(purpose, fuel);
        this.purposeType = purpose;
        this.fuelType = fuel;
    }

    @Override
    public void Fuel() {
        System.out.println("Я использую "+fuel+" топливо");
    }
}

