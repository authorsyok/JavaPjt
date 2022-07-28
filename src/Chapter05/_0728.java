package Chapter05;

import java.util.Scanner;

class Dictionary {
    static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
    static String[] eng = { "love", "baby", "money", "future", "hope" };   
    Scanner sc = new Scanner(System.in); 
    
    public Dictionary() {}
    
    String engReturn(String word) {
        for (int i=0; i<kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];
            }
        }
        return null;
    } 
    
    public void run() {
        System.out.println("한영 단어 검색 프로그램입니다.");        
        while(true) {
            System.out.print("한글 단어? ");
            String kor = sc.next();            
            if (kor.equals("그만")) {
                break;
            }            
            String eng = engReturn(kor);
            if (eng == null) {
                System.out.println(kor + "는 저의 사전에 없습니다.");
            } else {
                System.out.println(kor + "은 " + eng);
            }
        }
    }
}
 
public class _0728 {
    public static void main(String[] args) {
        
        Dictionary dic = new Dictionary();
        dic.run();
    }
}