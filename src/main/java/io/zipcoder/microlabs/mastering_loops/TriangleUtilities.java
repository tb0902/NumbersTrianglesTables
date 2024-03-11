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


    public static String getSmallTriangle() {
        int numberOfRows = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j < numberOfRows; j++) {
                if (i >= j) {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static String getLargeTriangle() {
        int numberOfRows = 10;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j < numberOfRows; j++) {
                if (i >= j) { // when there's more lines than stars, append a star
                    sb.append("*"); // j will add a star for each iteration of i
                }
            }
            sb.append("\n"); // i will add a new line for each row
        }
        return sb.toString();
    }
}