/**
 * Created by YanMing on 2017/5/20.
 */
public class BuilderPattern {
    public static void main(String arrgs []){
        CarDirector director = new CarDirector();
        BenzBuilder benzBuilder = new BenzBuilder();
        FordBuilder fordBuilder = new FordBuilder();

        director.Construct(benzBuilder);

        Car benz = benzBuilder.FinishBuild();
        benz.showMyCar();
    }
}
