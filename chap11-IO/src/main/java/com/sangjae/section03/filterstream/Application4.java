package com.sangjae.section03.filterstream;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        /* ObjectInputStream/ObjectOutputStream
         * : 객체 단위 입출력 보조 스트림 */

        Member[] members = {
                new Member("user01", "pass01", 25, '여'),
                new Member("user02", "pass02", 30, '남'),
                new Member("user03", "pass03", 35, '여')
        };

        try (ObjectOutputStream oos
                     = new ObjectOutputStream(new FileOutputStream("member.txt"))) {

            /*for(Member member : members) {
                oos.writeObject(member);
            }*/

            oos.writeObject(members);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Member[] members2 = new Member[10];

        try (ObjectInputStream ois
                     = new ObjectInputStream(new FileInputStream("member.txt"))) {

            /*for(int i = 0; i < members2.length; i++) {
                members2[i] = (Member) ois.readObject();
            }*/

            members2 = (Member[]) ois.readObject();

        } catch(EOFException e ) {
            System.out.println("파일을 다 읽어왔습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            /* 역직렬화 수행 시 해당 클래스가 존재하지 않을 경우 실패하므로
             * ClassNotFoundException 핸들링이 필요하다. */
            e.printStackTrace();
        }

        /* 읽어온 Member2 출력 */
        for(Member member : members2) {
            System.out.println(member);
        }

    }
}