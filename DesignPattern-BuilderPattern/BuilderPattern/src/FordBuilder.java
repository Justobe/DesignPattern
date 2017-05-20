/**
 * Created by YanMing on 2017/5/20.
 */
public class FordBuilder implements CarBuilder {
    Car ford = new Car();

    @Override
    public void BuildeCarWheel() {
        System.out.println("Ford Wheel building!");
        ford.setCarWheel("Ford Wheel");
    }

    @Override
    public void BuildeCarBody() {
        System.out.println("Ford Body building!");
        ford.setCarBody("Ford Body");
    }

    @Override
    public void BuildeCarBrand() {
        System.out.println("Ford Brand building!");
        ford.setCarBrand("Ford Brand");
    }

    @Override
    public Car FinishBuild() {
        return ford;
    }
}
