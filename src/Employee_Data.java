public class Employee_Data {
    public static void main(String[] args) {
        int present = (int)(Math.random()*2);

        System.out.println(present);

        if(present == 1){
            System.out.println("Employee is Present");
        }else if(present == 0){
            System.out.println("No Employee");
        }
    }
}
