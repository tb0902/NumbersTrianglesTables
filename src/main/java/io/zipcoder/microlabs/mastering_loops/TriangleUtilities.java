package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder star = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            star.append(getRow(i) + "\n");
        }
        return star.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder rows = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            rows.append("*");
        }
            return rows.toString();
        }


        public static String getSmallTriangle () {
            return null;
        }


        public static String getLargeTriangle () {
            return null;
        }
    }