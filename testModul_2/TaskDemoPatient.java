package students.Vkakurin.testModul_2;

import java.util.*;

public class TaskDemoPatient {
    private static int countRecords;

    /**
     * Используя одну из коллекций, напишите программу
     * «Очередь к врачу». Пациенты могут бронировать любой
     * временной слот (например, 1 - 9:00, 2 - 9:30,
     * 3 - 10:00 и т.д.) для приёма у доктора, при этом
     * указывая в записи своё имя. В день приёма
     * программа должна выводить врачу имя следующего
     * пациента строго в порядке номера временного слота.
     */
    // Создать объект "Patient" с номером очереди и именем
    //метод выбора временного слота с отображением свободных очередей (ввода очереди при записи)
    // метод записи в очередь в  день приема по номеру очереди = индекс+1.
    // метод вывода из очереди следущего пациента( времени приема, ФИО пациента)
    public static void main(String[] args) {

        List<String> time;// лист расписания к врачу  на один день
        time = new LinkedList<>(List.of(" 9:00 - Наберите 1", " 9:30 - Наберите 2 ", "10:00 - Наберите 3 ", "10:30 - Наберите 4 ", "11:00 - Наберите 5 "));

        List<Patients> patientSet = new LinkedList<>();// Лист пациентов

        System.out.println("РАСПИСАНИЕ ПРИЕМА");
        recordsIntoTimetable(time, patientSet);//Логика работы по записи в расписания к врачу

        System.out.println("РАБОЧЕЕ МЕСТО ВРАЧА");
        outPutNextPatientFromTimeTable(patientSet);// Вывод следующего пациента для врача


    }

    // вывод расписания на панель и попросить выбрать время и номер очереди и ввести Имя.
    public static void recordsIntoTimetable(List<String> time, List<Patients> patientSet) {

        Set<Integer> uniqueQue = new HashSet<>();//SET для исключения ввода номера очереди повторно

        System.out.println("Здравствуйте! ");

        countRecords = time.size();
        while (countRecords != 0) {

            System.out.println();
            System.out.println("Выберите удобное для вас время на прием к врачу");
            // System.out.println();
            //метод вывода массива расписания на экран
            printTimeTable(time);
            System.out.println();
            //  предложение выбрать время приема по расписанию нажав "номер очереди" = " время приема" в ввести ИМЯ
            System.out.println("Введите номер очереди: ");

            int lengthQue = time.size();
            int numQue = inputNumber(lengthQue);//Метод ввода номера очереди с проверкой корректности ввода цифры

            System.out.println("Введите Имя: ");

            String namPat = inputNamePatient();//Метод ввода имени Пациента с проверкой корректности ввода букв


            // Подтвердить ввод словом "да" и изменить расписание
            System.out.println("Подтвердите ввод. наберите " + "да");

            String outFromInputRecordsTimetable = inputNamePatient();
            if (!outFromInputRecordsTimetable.equals("да")) {
                System.out.println("Вы набрали не  " + "да. Повторите пожалуйста");
                System.out.println();
                continue;
            } else {

                //Если расписание заполнено вывести на экран" Извините запись на прием окончена"
                // и выход из прораммы записи пациентов.

                if (!isQueExist(uniqueQue, numQue)) { // проверяем чтобы не было записи повторной по номеру очереди
                    setIntoTimeTable(patientSet, numQue, namPat);//Запись пациента на прием

                    // Подтверждение записи
                    String timeShow = time.get(numQue - 1).substring(0, 5);
                    System.out.println();
                    System.out.println("Вы записаны на время:  " + timeShow);
                    takeTicket();//Возьмите талон


                    //Метод подготовки вывода  нового расписание  с учетом резервирования.
                    String timeRecord = time.get(numQue - 1);
                    deleteElementTimeTable(time, timeRecord);
                }

            }

        }
        System.out.println();
        System.out.println("Извините, запись на прием окончена!");
        System.out.println("===============================");

    }


    // Методы
    public static void takeTicket() {
        System.out.println("Возьмите Талончик. ");
    }

    public static void printTimeTable(List<String> time) {//Вывод расписания на экран
        for (String l : time) {
            System.out.println(l);
        }
    }

    //Место выбора времени и очереди в расписании стирается и выводит "Время зарезервировано"
    public static void deleteElementTimeTable(List<String> list, String word) {
        for (int i = 0; i < list.size(); i++) {
            String w = list.get(i);
            if (w.equals(word)) {
                list.set(i, "       Время зарезервировано ");
            }
        }

    }

    public static int inputNumber(int length) {//Ввод номера очереди
        boolean flag = false;
        int isNumber = 0;

        while (!flag) {
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не цифру Повторите набор очереди от 1 до " + length);
                continue;
            }
            isNumber = scanner.nextInt();
            if (isNumber > 0 && isNumber < length + 1) {
                flag = true;
            } else {
                System.out.println("Вы ввели цифру : " + isNumber);
                System.out.println("Это неправильный номер очереди.");
                System.out.println("Повторите набор очереди от 1 до " + length);
            }
        }
        return isNumber;
    }


    public static String inputNamePatient() {//Ввод имени Пациента
        boolean flag = false;
        String isName = "";

        while (!flag) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                System.out.println("Введите  буквами ");
                continue;
            }
            isName = scanner.next();
            flag = true;
        }
        return isName;
    }

    public static void setIntoTimeTable(List<Patients> timeTable, Integer numQue, String namePatient) {
// метод записи Пациента на прием
        timeTable.add(new Patients(numQue, namePatient));
        countRecords--;

        // System.out.println(timeTable);
    }
    // Вывод следущего пациента для врача с сортировкой по номеру очереди
    public static void outPutNextPatientFromTimeTable(List<Patients> patientSet) {
        if (!patientSet.isEmpty()) {
            Collections.sort(patientSet);
            //    System.out.println(patientSet);
            for (int i = 0; i < patientSet.size(); i++) {

                System.out.println("Введите следующего пациента.");
                System.out.println("Введите слово " + "да");

                if (inputNamePatient().equals("да")) {
                    System.out.println("Номер очереди : " + patientSet.get(i).getNumberQueue() + "         Имя пациента :" + patientSet.get(i).getName());
                } else {


                    System.out.println("Вы набрали не  " + "да. Повторите пожалуйста");
                    i--;
                }

            }

        }
        System.out.println();
        System.out.println("Список расписания пуст ");
    }

    // проверка набора повторного номера уже зарезервированной очереди
    public static boolean isQueExist(Set<Integer> uniqueQue, int numQue) {
        boolean isContains = uniqueQue.contains(numQue);
        if (isContains) {
            System.out.println(" Вы набрали очередь: " + numQue + ". Она уже зарезервирована");
            System.out.println(" Повторите выбор из свободного времени приема. ");


        } else {
            uniqueQue.add(numQue);
        }


        return isContains;
    }


}
