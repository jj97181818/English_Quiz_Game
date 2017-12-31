import java.util.Random;
import java.util.Scanner;

public class GameSystem {
    private int mode = 0;   //得知哪一個難度模式
    private int num[] = new int[80];    //題目出過與否 1：出過 0：沒出過
    

    public void start() {
        easy_mode();
    }

    private void show(String A, int right_words[], int words[]) {   //顯示目前猜題狀況
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == 32) {    //空白
                System.out.print(" ");
            }
            else {
                if((A.charAt(i) - 96 > 0) && (A.charAt(i) - 96 < 27)) {  
                    if(words[A.charAt(i) - 96] == 1) {
                        System.out.print((char)(A.charAt(i)));
                    }    
                    else {
                        System.out.print("-");
                    }
                }
            }
        }
    }

    private void quess_words(String A) { //猜英文字母
        int words[] = new int[27];    //記住猜過的英文字母 1 ~ 26 對照 a ~ z
        int right_words[] = new int[27];    //題目用到的字母
        int correct = 0;
        char ans;

        for(int i = 0; i < 27; i++) {   //陣列初始化
            words[i] = 0;
            right_words[i] = 0;
        }

        for(int j = 0; j < A.length(); j++) { //建立題目用到的字母陣列
            for(int k = 1; k < 27; k++) {
                if(A.charAt(j) - 96 == k) {
                    right_words[k] = 1;
                }
            }  
        }

        while(correct == 0) {   //猜到對為止
            System.out.println();
            System.out.println();            
            System.out.println("請輸入猜測的答案 a ~ z");
            Scanner scn = new Scanner(System.in);
            ans = scn.next().charAt(0);

            if(words[ans - 96] == 1) {  //重複輸入
                System.out.println("重複輸入！");
            }
            else {  //新的輸入
                words[ans - 96] = 1;
                if(words[ans - 96] == right_words[ans - 96]) {
                    System.out.println("對的，有" + (char)ans + "這個字母！");
                }
                else {
                    System.out.println("叭叭！答案中沒有這個字母喔！");
                }
            }

            for(int k = 1; k < 27; k++) {   //判斷答對與否
                if(words[k] != right_words[k]) {
                    correct = 0;
                    break;
                }
                else {
                    correct = 1;
                }
            } 
            show(A, right_words, words);    //秀出答題狀況
        }
    }


    private int random_question(int m) {     //隨機選題
        int number = 0;
        int flag = 1;

        while(flag == 1) {
            flag = 0;

            Random ran = new Random();
            number = ran.nextInt(20) + m * 20;  //選出題目 

            //看是否有重複出題
            if(num[number] == 1) {   //重複
                flag = 1;
            }
            else{   //不重複
                num[number] = 1; 
            }    
        }
        return number; //回傳題目題號
    }


    private void easy_mode() {   //簡單模式
        int n = 0;
        mode = 0;
        System.out.println("簡單模式");
        for(int i = 0; i < 5; i++) {    //共 5 題
            n = random_question(mode);  //選題

            Question q = new Question();    //創一個新題目
            System.out.println();
            System.out.println();
            System.out.println(q.read_Q(n));    //印出題目
            quess_words(q.read_A(n));   //開始猜答案
            System.out.println();
            System.out.println("恭喜答對了！");
        }
        medium_mode();
    }


    private void medium_mode() {  //普通模式
        int n = 0;
        mode = 1;
        System.out.println("普通模式");
        for(int i = 0; i < 5; i++) {    //共 5 題
            n = random_question(mode);  //選題

            Question q = new Question();    //創一個新題目
            System.out.println();
            System.out.println();
            System.out.println(q.read_Q(n));    //印出題目
            quess_words(q.read_A(n));   //開始猜答案
            System.out.println();
            System.out.println("恭喜答對了！");
        }
        hard_mode();
    }


    private void hard_mode() {  //困難模式
        int n = 0;
        mode = 2;
        System.out.println("困難模式");
        for(int i = 0; i < 5; i++) {    //共 5 題
            n = random_question(mode);  //選題

            Question q = new Question();    //創一個新題目
            System.out.println();
            System.out.println();
            System.out.println(q.read_Q(n));    //印出題目
            quess_words(q.read_A(n));   //開始猜答案
            System.out.println();
            System.out.println("恭喜答對了！");
        }
        expert_mode();
    }


    private void expert_mode() {  //專家模式
        int n = 0;
        mode = 3;
        System.out.println("專家模式");
        for(int i = 0; i < 5; i++) {    //共 5 題
            n = random_question(mode);  //選題

            Question q = new Question();    //創一個新題目
            System.out.println();
            System.out.println();
            System.out.println(q.read_Q(n));    //印出題目
            quess_words(q.read_A(n));   //開始猜答案
            System.out.println();
            System.out.println("恭喜答對了！");
        }
    }
}
