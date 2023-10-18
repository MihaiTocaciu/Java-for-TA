package lesson13.homework;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class CarComponent implements Serializable {
    private String name;
    private int constructionTime;

    public CarComponent(String name, int constructionTime) {
        this.name = name;
        this.constructionTime = constructionTime;
    }

    public void build(int componentNumber) {
        System.out.println("Building " + name +   "...");
        try {
            Thread.sleep(constructionTime * 1000); // Sleep to simulate construction time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name +  " is built.");
    }
}


class Car implements Serializable {
    private CarComponent[] components;

    public Car(CarComponent[] components) {
        this.components = components;
    }

    public void assemble(int componentNumber) {
        components[componentNumber - 1].build(componentNumber);
    }
}

public class CarAssemblyLine {
    public static void main(String[] args) {

        CarComponent[] components = {
                new CarComponent("Tire", 2),
                new CarComponent("Tire", 2),
                new CarComponent("Tire", 2),
                new CarComponent("Tire", 2),
                new CarComponent("Seat", 3),
                new CarComponent("Seat", 3),
                new CarComponent("Seat", 3),
                new CarComponent("Seat", 3),
                new CarComponent("Seat", 3),
                new CarComponent("Engine", 7),
                new CarComponent("Frame", 5)
        };


        Car car = new Car(components);

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        for (int i = 0; i < components.length; i++) {
            final int componentNumber = i + 1;
            executorService.submit(() -> car.assemble(componentNumber));
        }


        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream("car.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(car);
            System.out.println("Car assembly is complete and saved as car.ser.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

