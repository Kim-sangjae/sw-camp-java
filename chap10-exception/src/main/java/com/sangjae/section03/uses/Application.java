package com.sangjae.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        // 예외 처리를 많이 사용하는 io 패키지에서의 예외 처리 구문을 이해

        BufferedReader br = null;

        try {
            // FileReader 생성자에 throws FileNotFoundException 이 던져져있음
            // 호출할때 처리를 해야한다
            br = new BufferedReader(new FileReader("test.txt"));

            String s;
            // readLine() 은 IOException 이 던져짐
            while ((s = br.readLine())!= null){
                System.out.println(s);
            }

            // FileNotFoundException 은 IOException 을 상속받아서
            // 한번에 IOException 으로 처리 할 수 있다
//        } catch (FileNotFoundException e ) {
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
           // 예외가 발생하거나 발생하지않거나 무조건 실행된다
           // 일반적으로 IO에서는 사용한 자원을 닫아주는 부분을 작성한다

            try {
                // close 도 throws IOException 이므로 예외처리 해야한다
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
