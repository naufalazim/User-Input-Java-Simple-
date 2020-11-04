public class CheckAge {

    static void CekAge(int age) {  // create cek age integer variable

        if(age < 18) {

            System.out.print("Access is denied. Umur tidak cukup"); // If age 18 and below, they cant access the system.
        
        }else{

            System.out.print("The Access in the system successful!");
        }

    }

    public static void main(String[] args) {
        
        CekAge(20);  // <<< Enter the user age here!
    }
    
}
