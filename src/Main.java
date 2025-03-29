public class Main {

    public void lection(){
        String phone = "800553535";
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11){
            throw new RuntimeException("Телефон слишком длинный");
        }
        else if (phone.length() <11) {
            throw new RuntimeException("Короткий");
        }
        else {
            throw new RuntimeException("Ошибка ввода");
        }
        System.out.println("phone = " + phone);
    }


    public static void main(String[] args) {
//        lection();
    }
}