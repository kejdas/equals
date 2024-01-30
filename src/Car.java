public class Car {

     int  yearOfProduction;
    private String carName;
    private int odometerMileage;

    public Car(int yearOfProduction, String carName, int odometerMileage) {
        this.yearOfProduction = yearOfProduction;
        this.carName = carName;
        this.odometerMileage = odometerMileage;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCarName() {
        return carName;
    }

    public int getOdometerMileage() {
        return odometerMileage;
    }

    public static void kmPerHour(int speed) {
        System.out.println("Your speed is " + speed);
    }

    public void changeOdometerMileage(int newOdometerMileage){
        this.odometerMileage = newOdometerMileage;
        System.out.println("Your new odemeter milage is " + newOdometerMileage);
    }

    public void isOldTimer(){
        if (yearOfProduction <= 2000){
            System.out.println("Your car is old as fuck");
        } else if (yearOfProduction > 2000 & yearOfProduction < 2010) {
            System.out.printf("Your car is not that old");
        }
        else {
            System.out.println("Your car is new");
        }
    }

}