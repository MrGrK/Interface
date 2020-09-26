package enums;

public enum DaysOfWeek {
    Monday(40), Tuesday(32), Wednesday(24),
    Thursday(16), Friday(8), Saturday(0), Sunday(0);

    private int workHours;

    DaysOfWeek(int hours){
        this.workHours = hours;
    }

    public int getWorkHours() {
        return workHours;
    }
}
