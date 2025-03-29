public class Main {

    public void lection(){
        String phone = "800-555-35-35";
//        Добавляю проверку если ввели -
        phone = phone.replace("-", "");
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


    public static void main(String[] args) {
//        lection();
    }
}