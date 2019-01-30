package com.company.Exercise;

public class E07SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDuartionString(65, 45));
        System.out.println(getDuartionString(3945L));
    }

    public static String getDuartionString (long minutes, long seconds){
        String value = INVALID_VALUE_MESSAGE;

        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            value = hours + "h " + remainingMinutes + "m " + seconds + "s";
        }

        return value;
    }

    public static String getDuartionString (long seconds){
        String value = INVALID_VALUE_MESSAGE;

        if ((seconds >= 0)) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            value = getDuartionString(minutes, remainingSeconds);
        }

        return value;
    }

}
