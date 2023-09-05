package students.Vkakurin.task_7;

public class DayOfWeekDetectorTest {
    public static void main(String[] args) {
        DayOfWeekDetectorTest test = new DayOfWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnWrongGetNumber();
    }

    public void shouldReturnMonday() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }
    public void shouldReturnTuesday() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }
    public void shouldReturnWednesday() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }
    public void shouldReturnThursday() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    public void shouldReturnFriday() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }
    public void shouldReturnWrongGetNumber() {
        students.Vkakurin.Task_7.DayOfTheWeekDetector detector = new students.Vkakurin.Task_7.DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(0);
        checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not correct day number");
    }


    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }


}
