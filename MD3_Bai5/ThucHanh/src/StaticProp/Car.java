package StaticProp;

public class Car {
 private String name;
 private String engine;
 private String tranmistion;
 public  static int numberCar;

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getTranmistion() {
        return tranmistion;
    }

    public static int getNumberCar() {
        return numberCar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTranmistion(String tranmistion) {
        this.tranmistion = tranmistion;
    }

    public Car(String name, String engine, String tranmistion) {
        this.name = name;
        this.engine = engine;
        this.tranmistion = tranmistion;
        numberCar++;
    }
    static  String display(){
        return  "Car's Number is:\t"+numberCar;
    }
}
