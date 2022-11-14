public class Main {
    public static void main(String[] args) {
        //task 1
        int userYearsOld = 10;
        if (userYearsOld >= 18) {
            System.out.println("возраст совершеннолетия наступил");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил");
        }


        //task 2
        if (userYearsOld >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        } else if (userYearsOld >= 18) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else if (userYearsOld >= 7) {
            System.out.println("ребенок ходит в школу");
        } else {
            System.out.println("ребенок слишком мал");
        }

        // task 3
        int seats = 60;
        int standSeats = 42;
        boolean noSeats = seats + standSeats < 102;

        if (noSeats) {
        } else {
            System.out.println("вагон заполнен, никаких мест нет");
        }

        if (seats < 60) {
            System.out.println("осталось " + (60 - seats) + " сидячих мест");
        } else {
            System.out.println("сидячих мест нет");
        }

        if (standSeats < 42) {
            System.out.println("осталось " + (42 - standSeats) + " стоячих мест");
            ;
        } else {
            System.out.println("стоячих мест нет");
        }

        //task 4
        if (userYearsOld >= 18) {
            System.out.println("возраст совершеннолетия наступил");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил");
        }

        //task 5
        if (userYearsOld >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        } else if (userYearsOld >= 18) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else if (userYearsOld >= 7) {
            System.out.println("ребенок ходит в школу");
        } else {
            System.out.println("ребенок слишком мал");
        }

        //task 6
        int seatsTotal = 102;
        int inputSeatsBusy = 60;
        int inputStandSeatsBusy = 40;

        if (inputSeatsBusy + inputStandSeatsBusy < seatsTotal) {
            if (inputSeatsBusy < 60) {
                System.out.println("есть сидячие места");
            }
            if (inputStandSeatsBusy < seatsTotal - 60) {
                System.out.println("есть стоячие места");
            }
        } else {
            System.out.println("мест нет");
        }


        //task 7
        int yearsOld = 25;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        } else if (yearsOld > 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }

        //task 8
        int childYearsOld = 6;
        if (childYearsOld < 5) {
            System.out.println("ребенку нельзя кататься на аттракционе");
        } else if (childYearsOld >= 5 && childYearsOld < 14) {
            System.out.println("можно кататься в сопровождении взрослого");
        } else {
            System.out.println("можно кататься без сопросождения врослого");
        }


        //task 9
        int one = 1;
        int two = 5;
        int three = 6;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }

    }
}