class SecondsLamp {

    String writeSecondsLamp(int seconds) {
        StringBuilder stringBuilder = new StringBuilder();
        if (seconds % 2 == 0) {
            stringBuilder.append("Y");
        } else {
            stringBuilder.append("O");
        }
        return stringBuilder.toString();

    }
}
