package Chapter05;

import java.util.Scanner;

class Dictionary {
    static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
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
        System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");        
        while(true) {
            System.out.print("�ѱ� �ܾ�? ");
            String kor = sc.next();            
            if (kor.equals("�׸�")) {
                break;
            }            
            String eng = engReturn(kor);
            if (eng == null) {
                System.out.println(kor + "�� ���� ������ �����ϴ�.");
            } else {
                System.out.println(kor + "�� " + eng);
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