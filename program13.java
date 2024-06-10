import java.util.*;
class program13{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the player Info :");
                String info = sc.nextLine();
                StringTokenizer st = new StringTokenizer(info,",");
                String str1= st.nextToken();
                String str2=st.nextToken();
                String str3=st.nextToken();
                String str4=st.nextToken();
                System.out.println(str1);
                System.out.println(str2);
                System.out.println(str3);
                System.out.println(str4);
        }
}

