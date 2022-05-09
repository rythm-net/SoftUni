package moreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vehicles = Integer.parseInt(scanner.nextLine());
        List <Car> cars = new ArrayList<>();

        for (int i = 0; i < vehicles; i++) {
            String input = scanner.nextLine();
            Car car = Car.parseCar(input);
            cars.add(car);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "fragile":
                List<String> model = new ArrayList<>();
                for (int i = 0; i < cars.size(); i++) {
                    if (cars.get(i).getCargo().getCargoType().equals("fragile")) {
                        if (cars.get(i).getTires().get(0).getTirePressure1() < 1 ||
                                cars.get(i).getTires().get(0).getTirePressure2() < 1 ||
                                cars.get(i).getTires().get(0).getTirePressure3() < 1 ||
                                cars.get(i).getTires().get(0).getTirePressure4() < 1) {
                            model.add(cars.get(i).getModel());
                        }
                    }
                }

                model.forEach(System.out::println);
                break;
            case "flamable":
                cars.forEach(e -> {
                    if (e.getCargo().getCargoType().equals("flamable")
                            && e.getEngine().getEnginePower() > 250) {
                        System.out.println(String.format("%s", e.getModel()));
                    }
                });
                break;
        }
    }

    public static class Car {
        private final String model;
        private final Engine engine;
        private final Cargo cargo;
        private final List<Tire> tires;

        public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tires = tires;
        }

        public static Car parseCar(String text) {
            String[] carsParameters = text.split(" ");
            String model  = carsParameters[0];
            Engine engine = new Engine(Integer.parseInt(carsParameters[1]), Integer.parseInt(carsParameters[2]));
            Cargo cargo   = new Cargo(Integer.parseInt(carsParameters[3]), carsParameters[4]);

            List <Tire> tires = new ArrayList<>();
            Tire tire = new Tire(Double.parseDouble(carsParameters[5]), Integer.parseInt(carsParameters[6]),
                    Double.parseDouble(carsParameters[7]), Integer.parseInt(carsParameters[8]),
                    Double.parseDouble(carsParameters[9]), Integer.parseInt(carsParameters[10]),
                    Double.parseDouble(carsParameters[11]), Integer.parseInt(carsParameters[12]));
            tires.add(tire);
            return new Car(model, engine, cargo, tires);
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public List<Tire> getTires() {
            return tires;
        }
    }

    public static class Engine {
        private final int engineSpeed;
        private final int enginePower;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

        public int getEnginePower() {
            return enginePower;
        }
    }

    public static class Cargo {
        private final int cargoWeight;
        private final String cargoType;

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
        }

        public String getCargoType() {
            return cargoType;
        }
    }

    public static class Tire {
        private double tirePressure1;
        private int tireAge1;
        private double tirePressure2;
        private int tireAge2;
        private double tirePressure3;
        private int tireAge3;
        private double tirePressure4;
        private int tireAge4;

        public Tire(double tirePressure1, int tireAge1, double tirePressure2, int tireAge2,
                    double tirePressure3, int tireAge3, double tirePressure4, int tireAge4) {
            this.tirePressure1 = tirePressure1;
            this.tireAge1      = tireAge1;
            this.tirePressure2 = tirePressure2;
            this.tireAge2      = tireAge2;
            this.tirePressure3 = tirePressure3;
            this.tireAge3      = tireAge3;
            this.tirePressure4 = tirePressure4;
            this.tireAge4      = tireAge4;
        }

        public void setTirePressure1(double tirePressure1) {
            this.tirePressure1 = tirePressure1;
        }

        public void setTireAge1(int tireAge1) {
            this.tireAge1 = tireAge1;
        }

        public void setTirePressure2(double tirePressure2) {
            this.tirePressure2 = tirePressure2;
        }

        public void setTireAge2(int tireAge2) {
            this.tireAge2 = tireAge2;
        }

        public void setTirePressure3(double tirePressure3) {
            this.tirePressure3 = tirePressure3;
        }

        public void setTireAge3(int tireAge3) {
            this.tireAge3 = tireAge3;
        }

        public void setTirePressure4(double tirePressure4) {
            this.tirePressure4 = tirePressure4;
        }

        public void setTireAge4(int tireAge4) {
            this.tireAge4 = tireAge4;
        }

        public double getTirePressure1() {
            return tirePressure1;
        }

        public int getTireAge1() {
            return tireAge1;
        }

        public double getTirePressure2() {
            return tirePressure2;
        }

        public int getTireAge2() {
            return tireAge2;
        }

        public double getTirePressure3() {
            return tirePressure3;
        }

        public int getTireAge3() {
            return tireAge3;
        }

        public double getTirePressure4() {
            return tirePressure4;
        }

        public int getTireAge4() {
            return tireAge4;
        }
    }
}