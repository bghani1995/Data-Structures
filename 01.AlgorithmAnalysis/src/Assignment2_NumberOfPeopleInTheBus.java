import java.util.ArrayList;

public class Assignment2_NumberOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> busStops = new ArrayList<>();
        busStops.add(new int[] {10,0});//first stop
        busStops.add(new int[] {3,5});
        busStops.add(new int[] {2,5});//last stop
        System.out.println(countPassengers(busStops));


    }
    public static int countPassengers(ArrayList<int[]> stops) {
       int numberOfPeople = 0;

        for (int i = 0; i < stops.size(); i++) {//Iterate each stop
            numberOfPeople = numberOfPeople+stops.get(i)[0] - stops.get(i)[1];// # of people who get on - # of people who get off bus
        }
        return numberOfPeople;
    }
}
