import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int peopleGettingOn =0;
        int peopleDisembarking =0;
        for (int i = 0; i < stops.size(); i++) {
            int[] busStop = stops.get(i);
            peopleGettingOn = peopleGettingOn + busStop[0];
            peopleDisembarking = peopleDisembarking + busStop[1];
        }
        int peopleOnTheLastBusSTop = peopleGettingOn-peopleDisembarking;

        return peopleOnTheLastBusSTop;
    }
}