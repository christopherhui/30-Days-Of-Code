import java.util.*;

public class day8dictmap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> aMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            aMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(aMap.containsKey(s)) {
                System.out.println(s + "=" + aMap.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
