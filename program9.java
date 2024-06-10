import java.io.*;
class program9{
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter your Name :");
                String name = br.readLine();
                System.out.print("Enter your Society Name :");
                String socname=br.readLine();
                System.out.print("Enter wing :");
                char wing = (char)br.read();
		br.skip(1);
                System.out.print("Enter Flat number :");
                int flatno=Integer.parseInt(br.readLine());
                System.out.println("Name :"+name);
                System.out.println("Society Name :"+socname);
                System.out.println("Wing :"+wing);
                System.out.println("Flat Number :"+flatno);
        }
}
