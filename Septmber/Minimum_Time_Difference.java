import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Minimum_Time_Difference {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> totalmin = new ArrayList<>();
        for (String str : timePoints) {
            String[] splitarray = str.split(":");

            int hour = Integer.parseInt(splitarray[0]);
            int minutes = Integer.parseInt(splitarray[1]);
            totalmin.add(hour * 60 + minutes);
        }
        Collections.sort(totalmin);

        int totalMinutesInDay = 1440;
        int n = totalmin.size();
        for (int i = 0; i < n; i++) {
            totalmin.add(totalmin.get(i) + totalMinutesInDay);
        }

        int mindifference = Integer.MAX_VALUE;
        for (int i = 1; i < totalmin.size(); i++) {
            mindifference = Math.min(mindifference, totalmin.get(i) - totalmin.get(i - 1));
        }

        return mindifference;
    }
}
