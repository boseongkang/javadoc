package assignment1;

public class MyTime
{
    /**
     * Prints the difference between two times (second - first)
     * in format of "XX hour(s) YY minute(s)"
     *
     * @param time1 first time in military format hhmm.
     * @param time2 second time in military format hhmm <br> (if first > second, second is on the next day)
     */
    public static void printTimeDifference(String time1, String time2)
    {
        int t1 = militaryToMinutes(time1);
        int t2 = militaryToMinutes(time2);
        int diff = t2 - t1;

        if (diff < 0)
            diff += 24 * 60;
        int hour = diff / 60;
        int min = diff % 60;

        System.out.printf("%d hour(s) %d minute(s)", hour, min);
    }

    private static int militaryToMinutes(String time)
    {
        //1256 -> 12*60 +56
        int splitIndex = 2;
        String h = time.substring(0, splitIndex);
        String m = time.substring(splitIndex);
        int hours = Integer.parseInt(h);
        int minutes = Integer.parseInt(m);

        return hours * 60 + minutes;
    }
}

