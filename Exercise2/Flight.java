package Exercise2;

import java.util.Scanner;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
    number = 0;
    destination = "";
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    public void display(){
        if(number < 0){
            System.out.println("Number cannot be smaller than 0");
        }
        else {
            System.out.println("Number : " + number);
            System.out.println("Destination :" + destination);
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

}
