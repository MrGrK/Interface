package enums;

public class Main {
    public static void main(String[] args) {
        checkHours(DaysOfWeek.values());
    }

    public static void checkHours(DaysOfWeek[] pDays){
        for(DaysOfWeek day: pDays){
            if(day.getWorkHours()>0){
                System.out.println("До конца рабочей недели осталось " + day.getWorkHours() +" часов.");
            }
            else
            {
                System.out.println("Сегодня выходной!");
            }
        }
    }
}
