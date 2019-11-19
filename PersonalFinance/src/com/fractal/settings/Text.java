package com.fractal.settings;

import java.util.HashMap;

final public class Text {
    private static final HashMap<String, String> data = new HashMap();

    public static String get(String key) {
        return data.get(key);
    }

    public static String[] getMonths() {
        String[] months = new String[12];
        months[0] = get("JANUARY");
        months[1] = get("FEBRUARY");
        months[2] = get("MARCH");
        months[3] = get("APRIL");
        months[4] = get("MAY");
        months[5] = get("JUNE");
        months[6] = get("JULY");
        months[7] = get("AUGUST");
        months[8] = get("SEPTEMBER");
        months[9] = get("OCTOBER");
        months[10] = get("NOVEMBER");
        months[11] = get("DECEMBER");
        return months;
    }

    public static void init() {
        //putting menu items
        data.put("PROGRAM_NAME", "Accounting Assistant");
        data.put("PROGRAM_FILE", "File");
        data.put("PROGRAM_EDIT", "Edit");
        data.put("PROGRAM_VIEW", "View");
        data.put("PROGRAM_HELP", "Help");
        //putting months
        data.put("JANUARY", "January");
        data.put("FEBRUARY", "February");
        data.put("MARCH", "March");
        data.put("APRIL", "April");
        data.put("MAY", "May");
        data.put("JUNE", "June");
        data.put("JULY", "July");
        data.put("AUGUST", "August");
        data.put("SEPTEMBER", "September");
        data.put("OCTOBER", "October");
        data.put("NOVEMBER", "November");
        data.put("DECEMBER", "December");
        //putting weekdays
        data.put("MONDAY", "Monday");
        data.put("TUESDAY", "Tuesday");
        data.put("WEDNESDAY", "Wednesday");
        data.put("THURSDAY", "Thursday");
        data.put("FRIDAY", "Friday");
        data.put("SATURDAY", "Saturday");
        data.put("SUNDAY", "Sunday");
    }
}
