import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// BufferedReader는 객체 생성시 생성자의 입력값으로 InputStreamReader의 객체가 필요함
// InputStreamReader - character / BufferedReader - String
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // readLine method를 쓸 때 InputStream==null일 경우 오류가 생기므로 예외처리를 함
        // readLine : String 값으로 개행 문자를 포함하여 읽음

        int y = Integer.parseInt(str);
        // Integer.parseInt(String) : 문자열을 인자값으로 받으면 해당 값을 10진수의 Integer형으로 변환

        if(y%4==0) {
            if(y%400==0) System.out.println("1");
            else if(y%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");

        // System.out.print((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0");
    }
}