/**
 * Created by YanMing on 2017/5/20.
 */
public class Car {
    public String wheel;
    public String body;
    public String brand;
    public void setCarWheel(String wheel){
        this.wheel = wheel;
    }
    public void setCarBody(String body){
        this.body = body;
    }

    public void setCarBrand(String brand){
        this.brand = brand;
    }
    public void showMyCar(){
        System.out.println("Brand: " + this.brand +"\n"+
                            "Body: " + this.body +"\n" +
                            "Wheel: " + this.wheel + "\n");
    }
}
