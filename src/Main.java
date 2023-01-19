public class Main {
    public static void main(String[] args) {
        int age = 5;
        if ( age >= 18) {
            System.out.println("Если возраст человека равен 18 он совершенолетний");
        } else {
            System.out.println("Не достиг совершеннолетия, нужно немного подождать");
            }
        float degree = 5F;
        if ( degree < 5) {
            System.out.println("Нужно надеть шапку");
        } else {
            System.out.println("Шапку можно не надевать");
        }

        int speed = 60;
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }

            int ageFor = 29;
            if (ageFor >=2 && ageFor <= 6) {
                System.out.println("Нужно ходить в детский сад");
            }
         if (ageFor > 6 && ageFor <= 18) {
                System.out.println("Нужно ходить в школу");
            }
            if (ageFor > 18 && ageFor <= 24) {
                System.out.println("Нужно ходить в университет");
            }
            if (ageFor > 24) {
                System.out.println("Пора ходить на работу");
            }

            int allowable = 10;
            if ( allowable <5) {
                System.out.println("Кататься на аттракционах нельзя");
            } else if (allowable >5 && allowable <14) {
                System.out.println("Кататься на аттракционах можно в сопровождении взрослых");
            } else if (allowable >14) {
                System.out.println("Кататься на аттракционах можно без сопровождения взрослых");
            }

            int totalSeats = 102;
            int standingPlace = 40;
            int sittingPlace = 60;
            if (sittingPlace ==0 && standingPlace ==0) {
                System.out.println("Вагон забит");
            } else if (standingPlace <60 && sittingPlace == 60){
                System.out.println("Есть стоячее место");
            } else if (sittingPlace <60 && standingPlace == 60){
                System.out.println("Есть сидячее место");
            }

            int one = 1;
            int two = 2;
            int three = 3;
            if (one > two && one >three) {
                System.out.println(one + " Самое большое число");
            } else if (two > one && two > three) {
                System.out.println(two + " Самое большое число" );
            } else if (three > two && three > one) {
                System.out.println(three +" Самое большое число");
            }





            






        }//

    }//
