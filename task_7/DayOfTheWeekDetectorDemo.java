package students.Vkakurin.Task_7;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int getNumber = detector.getDayNumberFromUser();
        String dayOfWeek = detector.findDayOfTheWeek(getNumber);
        System.out.println(dayOfWeek);

    }
}
