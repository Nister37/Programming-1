package ex01;

public enum DayOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isWeekend;

    DayOfWeek(boolean isWeekend){
        setIsWeekend(isWeekend);
    }
    public boolean getIsWeekend(){
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    @Override
    public String toString() {
        return String.format("%s (day %d, weekday = %b)", name().toUpperCase(), ordinal(), getIsWeekend());
    }
}
