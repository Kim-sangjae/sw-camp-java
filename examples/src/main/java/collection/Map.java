package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        //이름을 입력하면 전화번호를 검색할 수 있도록 전화번호부를 구현하세요.
//        이름과 전화번호를 띄어쓰기 기준으로 입력하세요(검색하려면 'search', 종료하려면 'exit'):홍길동010 - 1234 - 5678
//        입력이 잘못 되었습니다.다음 양식으로 입력해주세요: <이름 > < 전화번호 >
//        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'):홍길동 010 - 1234 - 5678
//        추가 완료 :홍길동 010 - 1234 - 5678
//        이름과 전화번호를 띄어쓰기 기준으로 입력하세요(검색하려면 'search', 종료하려면 'exit'):유관순 010 - 9876 - 5432
//        추가 완료 :유관순 010 - 9876 - 5432
//        이름과 전화번호를 띄어쓰기 기준으로 입력하세요(검색하려면 'search', 종료하려면 'exit'):search
//        검색 할 이름:
//        유관순
//        유관순씨의 전화번호 :010 - 9876 - 5432
//        이름과 전화번호를 띄어쓰기 기준으로 입력하세요(검색하려면 'search', 종료하려면 'exit'):search
//        검색 할 이름:
//        이순신
//        이순신씨의 번호는 등록 되어 있지 않습니다.
//        이름과 전화번호를 띄어쓰기 기준으로 입력하세요(검색하려면 'search', 종료하려면 'exit'):exit

        Scanner sc = new Scanner(System.in);

        try {
            boolean check = true;
            HashMap<String, String> hashInfo = new HashMap<>();
            while (check) {
                System.out.println("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit') : ");
                String cusInfo = sc.nextLine();
                String[] info = cusInfo.split(" ");
                if (cusInfo.equals("exit")){
                    break;
                }

                if (cusInfo.equals("search")) {
                    System.out.print("검색할 이름 : ");
                    String searchKey = sc.nextLine().trim();

                    if (hashInfo.containsKey(searchKey)) {
                        System.out.println(searchKey + "씨의 전화번호 : " + hashInfo.get(searchKey));
                    } else {
                        System.out.println(searchKey + "씨의 번호는 등록되어 있지 않습니다.");
                    }
                    continue; // 다음 입력 대기
                }


                if (cusInfo.isEmpty() || info.length != 2) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                    continue;
                } else {

                    hashInfo.put(info[0], info[1]);
                    Iterator<String> keyIter = hashInfo.keySet().iterator();

                    while(keyIter.hasNext()) {

                        String key = (String)keyIter.next();

                        if(key.equals(info[0])){

                            System.out.println("추가 완료 : " + key + " " + hashInfo.get(key));
                        }
                    }



                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
