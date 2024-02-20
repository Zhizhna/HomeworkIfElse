import java.util.Random;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        byte age = 19;
        System.out.println("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task 2");
        byte weather = 8;
        System.out.println("На улице " + weather + "градусов, ");
        if (weather >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (weather <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println("Task 3");
        short speed = 70;
        System.out.println("Если скорость " + speed + ", то ");
        if (speed >= 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }

        System.out.println("Task 4");
        byte childAge = 5;
        System.out.println("Если возраст человека равен" + childAge);
        if (childAge >= 2 || childAge <= 6) {
            System.out.println(" ему нужно ходить в детский сад.");
        }
        if (childAge >= 7 || childAge <= 17) {
            System.out.println(" то ему нужно ходить в школу.");
        }
        if (childAge >= 18 || childAge <= 24) {
            System.out.println("то его место в университете.");
        }
        if (childAge > 24) {
            System.out.println("то ему пора ходить на работу.");
        }

        System.out.println("Task 5");
        byte visitorAge = 14;
        //не указано что происходит, если  ровно 5 лет, указал, что в пять можно в сопровождении
        if (visitorAge == 5) {
            System.out.println("нельзя кататься на аттракционе");
        }
        if (visitorAge >= 5 || visitorAge <= 14) {
            System.out.println(" можно кататься на аттракционе в сопровождении.");
        } else {
            System.out.println("без сопровождения взрослого");
        }

        System.out.println("Task 6");
        byte passengersAlreadyIn = 102;
        byte sittingPlaces = 60;
        byte standingPlaces = (byte) (passengersAlreadyIn - sittingPlaces);
        byte freeSittingPlaces = 59;
        byte freeStandingPlaces = 55;
        if (freeStandingPlaces >= standingPlaces || freeSittingPlaces >= sittingPlaces) {
            System.out.println("No places");
        }
        if (standingPlaces - freeStandingPlaces == 1) {
            System.out.println("There is a standing place");
        }
        if (freeStandingPlaces < (standingPlaces - 1)) {
            System.out.println("There are standing places");
        } else {
            System.out.println("There are no standing places");
        }
        if (sittingPlaces - freeSittingPlaces == 1) {
            System.out.println("There is a sitting place");
        }
        if (freeSittingPlaces < (sittingPlaces - 1)) {
            System.out.println("There are sitting places");
        } else {
            System.out.println("There are no sitting places");
        }

        System.out.println("Task 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one == two || two == three) {
            System.out.println("Equal");
        } else {
            if (one > two) {
                if (one > three) {
                    System.out.println("Number one is the biggest");
                }
            } else {
                if (two > three) {
                    if (two > three) {
                        System.out.println("Number two is the biggest");
                    }
                } else if (three > two) {
                    if (three > one) {
                        System.out.println("Number three is the biggest");
                    }
                }
            }
        }
    }
    }
//https://github.com/Zhizhna/HomeworkIfElse.git