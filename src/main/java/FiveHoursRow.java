class FiveHoursRow {

    String writeFiveHoursRow(int hours) {
        int redHoursBlock = hours / 5;
        int blankHoursBlock = 4 - redHoursBlock;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= redHoursBlock; i++) {
            stringBuilder.append("R");
        }
        for (int j = 1; j <= blankHoursBlock; j++) {
            stringBuilder.append("O");
        }
        return stringBuilder.toString();

    }
}
