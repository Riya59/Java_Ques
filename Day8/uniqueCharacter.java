import java.util.*;
public class uniqueCharacter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt[] = new int[26];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;  
        }
        int index = -1;
        for(int i=0;i<s.length();i++){
            if(cnt[s.charAt(i)-'a']==1){
                System.out.println(i);
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println(index);
        }
        
        sc.close();
    }
}