class EntireBerlinClock {

    SecondsLamp secondsLamp = new SecondsLamp();
    FiveHoursRow fiveHoursRow = new FiveHoursRow();
    SingleHoursRow singleHoursRow = new SingleHoursRow();
    FiveMinutesRow fiveMinutesRow = new FiveMinutesRow();
    SingleMinutesRow singleMinutesRow = new SingleMinutesRow();

    String writeBerlinClock(int hours, int minutes, int seconds) {

        return secondsLamp.writeSecondsLamp(seconds) +
                fiveHoursRow.writeFiveHoursRow(hours) +
                singleHoursRow.writeSingleHoursRow(hours) +
                fiveMinutesRow.writeFiveMinutesRow(minutes) +
                singleMinutesRow.writeSingleMinutesRow(minutes);

    }

}
