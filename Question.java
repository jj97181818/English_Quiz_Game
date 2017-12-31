public class Question {
    private String Q = new String();
    private String A = new String();

    public String read_Q(int n) {   //讀取問題
        question_data(n);
        return Q;
    }

    public String read_A(int n) {   //讀取答案
        question_data(n);
        return A;
    }



    private void question_data(int number){ 
        switch(number) {
            case 0:
                Q = "This is  question 0.";
                A = "this is the answer.";
                break;

            case 1:
                Q = "This is question 1.";
                A = "this is the answer.";
                break;
                
            case 2:
                Q = "This is question 2.";
                A = "this is the answer.";
                break;
                
            case 3:
                Q = "This is question 3.";
                A = "this is the answer.";
                break;
                
            case 4:
                Q = "This is question 4.";
                A = "this is the answer.";
                break;
                
            case 5:
                Q = "This is question 5.";
                A = "this is the answer.";
                break;
                
            case 6:
                Q = "This is question 6.";
                A = "this is the answer.";
                break;
                
            case 7:
                Q = "This is question 7.";
                A = "this is the answer.";
                break;
                
            case 8:
                Q = "This is question 8.";
                A = "this is the answer.";
                break;
                
            case 9:
                Q = "This is question 9.";
                A = "this is the answer.";
                break;
                
            case 10:
                Q = "This is question 10.";
                A = "this is the answer.";
                break;
                
            case 11:
                Q = "This is question 11.";
                A = "this is the answer.";
                break;
                
            case 12:
                Q = "This is question 12.";
                A = "this is the answer.";
                break;
                
            case 13:
                Q = "This is question 13.";
                A = "this is the answer.";
                break;
                
            case 14:
                Q = "This is question 14.";
                A = "this is the answer.";
                break;
                
            case 15:
                Q = "This is question 15.";
                A = "this is the answer.";
                break;
                
            case 16:
                Q = "This is question 16.";
                A = "this is the answer.";
                break;

            case 17:
                Q = "This is question 17.";
                A = "this is the answer.";
                break;
                
            case 18:
                Q = "This is question 18.";
                A = "this is the answer.";
                break;
                
            case 19:
                Q = "This is question 19.";
                A = "this is the answer.";
                break;
            
            
                


        }
    }
}