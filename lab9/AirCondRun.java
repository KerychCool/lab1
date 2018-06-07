public class AirCondRun implements IComand {
    private AirCondition air;

    @Override
    public void execute() {
        air.run();
    }

    AirCondRun(AirCondition air){
        this.air = air;
    }
}
