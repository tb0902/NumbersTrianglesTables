package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5; // table size has to be 5 for a 4/4 table, since it begins at 0

        StringBuilder sb2 = new StringBuilder();
        for (int row = 1; row < (tableSize+1); row++) {
            for (int column = 1; column < (tableSize+1); column++) {
                sb2.append((String.format("%3d", (row * column)))); // basically the same code
                sb2.append(" |");
                if (column == tableSize) {
                    sb2.append("\n");
                }
            }
        }
        return sb2.toString();
    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10; // table size has to be at 10 for a 9/9 array

        StringBuilder sb3 = new StringBuilder();
        for (int row = 1; row < (tableSize+1); row++) {
            for (int column = 1; column < (tableSize+1); column++) {
                sb3.append((String.format("%3d", (row * column))));
                sb3.append(" |");
                if (column == tableSize) { // basically the same code
                    sb3.append("\n");
                }
            }
        }
        return sb3.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for (int row = 1; row < (tableSize+1); row++) { // row must be +1 since were using numbers > 0 same as tableSize
            for (int column = 1; column < (tableSize+1); column++) { // same for column. must iterate through all numbers < tablesize
                sb.append((String.format("%3d", (row * column)))); // append row * column with the format of 3 digits
                sb.append(" |"); // append a | at the end with a space
                if (column == tableSize) { // if column reaches the maximum number were *ing by,
                    sb.append("\n"); // make a new line
                }
            }
        }
        return sb.toString(); // return the table as a string
    }
}
