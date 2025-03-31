public class Main {

    public static void lection(){
        String phone = "800-555-35-35";
//        Добавляю проверку если ввели -
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11){
            throw new RuntimeException("Телефон слишком длинный");
        }
        else if (phone.length() <11) {
            throw new RuntimeException("Короткий");
//            Добавляю проверку если не с 7 начинается
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        } else {
            throw new RuntimeException("Ошибка ввода");
        }
        System.out.println("phone = " + phone);
    }

    public static void homeWork1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        char first = firstName.charAt(0);
        char second = lastName.charAt(0);
        char thrid = middleName.charAt(0);
        System.out.println("Ф. И. О. сотрудника —" + first + second + thrid);
    }

    public static void homeWork2(){
        String fullName = "ivanov ivan ivanovich";
        String fullNameFIO = fullName.toUpperCase();
        System.out.println("fullNameFIO = " + fullNameFIO);
    }

    public static void homeWork3(){
        String fio = "Иванов Семён Семёнович";
        String withoutYo = fio.replace("ё", "е");
        System.out.println("withoutYo = " + withoutYo);
    }

    public static void homeWork4(){

    }

    public static void main(String[] args) {
//        lection();
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();
    }
}