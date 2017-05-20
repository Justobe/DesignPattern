/**
 * Created by YanMing on 2017/5/20.
 */
public class BenzBuilder implements CarBuilder {

    Car benz = new Car();

    @Override
    public void BuildeCarWheel() {
        System.out.println("Benz Wheel building!");
        benz.setCarWheel("Benz Wheel");
    }

    @Override
    public void BuildeCarBody() {
        System.out.println("Benz Body building!");
        benz.setCarBody("Benz Body");
    }

    @Override
    public void BuildeCarBrand() {
        System.out.println("Benz Brand building!");
        benz.setCarBrand("Benz Brand");
    }

    @Override
    public Car FinishBuild() {
        return benz;
    }
}
