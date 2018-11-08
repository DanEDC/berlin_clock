class SingleMinutesRow {

    String writeSingleMinutesRow(int minutes) {
        int calculateMinutes = minutes / 5;
        int yellowMinutesBlock = minutes - (calculateMinutes * 5);
        int blankMinutesBlock = 4 - yellowMinutesBlock;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= yellowMinutesBlock; i++) {
            stringBuilder.append("Y");
        }
        for (int j = 1; j <= blankMinutesBlock; j++) {
            stringBuilder.append("O");
        }
        return stringBuilder.toString();

    }
}

