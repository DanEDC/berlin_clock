class FiveMinutesRow {

    String writeFiveMinutesRow(int minutes) {
        int yellowMinutesBlock = minutes / 5;
        int blankMinutesBlock = 11 - yellowMinutesBlock;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= yellowMinutesBlock; i++) {
            if (i % 3 == 0) {
                stringBuilder.append("R");
            } else {
                stringBuilder.append("Y");
            }
        }
        for (int j = 0; j < blankMinutesBlock; j++) {
            stringBuilder.append("O");
        }
        return stringBuilder.toString();

    }
}
