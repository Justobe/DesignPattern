/**
 * Created by YanMing on 2017/5/20.
 */
public class CarDirector {
    public void Construct(CarBuilder cb){
        cb.BuildeCarBrand();
        cb.BuildeCarBody();
        cb.BuildeCarWheel();
    }
}
