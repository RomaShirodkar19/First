public class Car {
    private  String make= "Renault";
    private String model="Duster";
    private String color="Pearl white";
    private int doors=4;
    private boolean isConvertible=false;
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void describeCar() {
        System.out.println(doors + "-doors"
                + color + " "
                + make + " "
                + model + " ");
        System.out.println("Is convertible?/n" + isConvertible);
    }

}
