package com.sangjae.rdpoject.main_ui;

import com.sangjae.rdpoject.domain.Category;
import com.sangjae.rdpoject.domain.DrawItem;
import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.domain.UserRole;
import com.sangjae.rdpoject.repository.DrawHistoryRepository;
import com.sangjae.rdpoject.repository.storage.FileDrawHistoryStorage;
import com.sangjae.rdpoject.repository.storage.FileDrawStorage;
import com.sangjae.rdpoject.repository.storage.FileUserStorage;
import com.sangjae.rdpoject.repository.UserRepository;
import com.sangjae.rdpoject.repository.DrawRepository;
import com.sangjae.rdpoject.service.ItemInitialAdd;
import com.sangjae.rdpoject.service.UserService;
import com.sangjae.rdpoject.service.DrawService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.sangjae.rdpoject.domain.UserRole.*;

public class UserController {
    private static UserService userService;
    private static DrawService drawService;
    private static Scanner scanner;

    public static void main(String[] args) {
        //
        UserRepository userRepository = new UserRepository(new FileUserStorage());
        //
        DrawRepository drawRepository = new DrawRepository(new FileDrawStorage());
        //
        DrawHistoryRepository drawHistoryRepository = new DrawHistoryRepository(new FileDrawHistoryStorage());


        // 초기 아이템 추가
        if (drawRepository.findAllItems().isEmpty()) {
            drawRepository.saveAllItems(ItemInitialAdd.createInitialItems());
        }

        userService = new UserService(userRepository);
        drawService = new DrawService(drawRepository, drawHistoryRepository);

        scanner = new Scanner(System.in);


        // !!!!!!!!!!!! 관리자는 9988 번으로 들어가주세요 !!!!!!!!!!!!!!
        // !!!!!!!!!!!! 관리자는 9988 번으로 들어가주세요 !!!!!!!!!!!!!!
        // !!!!!!!!!!!! 관리자는 9988 번으로 들어가주세요 !!!!!!!!!!!!!!

        while (true) {
            System.out.println("\n===== 랜덤 뽑기 프로그램 =====");
            System.out.println("1. 로그인");
            System.out.println("2. 회원 가입");
            System.out.println("3. 회원정보찾기");
            System.out.println("4. 전체 뽑기 랭킹");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("잘못 입력하셨습니다");
                scanner.nextLine();
                continue;
            }

            // !!!!!!!!!!!! 관리자는 9988 번으로 들어가주세요 !!!!!!!!!!!!!!

            try {
                switch (choice) {
                    case 1 -> {
                        User loggedUser = loginUser();
                        if (loggedUser != null) {
                            userMenu(loggedUser);
                        }
                    }
                    case 2 -> registerUser();
                    case 3 -> findUser();
                    case 4 -> drawService.printUserRanking();
                    case 9 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    case 9988 -> adminMenu();
                    default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
        }
    }

    private static User loginUser() {
        System.out.println("--- 로그인 ---");
        System.out.print("아이디 입력: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호 입력: ");
        String pw = scanner.nextLine();

        try {
            User loginUser = userService.loginUser(id, pw);
            System.out.println("로그인 성공: " + loginUser.getUserId());
            return loginUser;
        } catch (IllegalArgumentException e) {
            System.out.println("로그인 실패: " + e.getMessage());
            return null;
        }
    }

    private static void registerUser() {
        System.out.println("--- 회원 가입 ---");
        System.out.print("아이디 입력: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호 입력: ");
        String pwd = scanner.nextLine();

        System.out.print("휴대전화번호 입력: ");
        String phone = scanner.nextLine();

        try {
            userService.joinUser(id,pwd,phone, USER);
            System.out.println("회원 가입 성공: " + id);
        } catch (IllegalArgumentException e) {
            System.out.println("회원 가입 실패: " + e.getMessage());
        }
    }

    private static void findUser() {
        System.out.println("\n회원 정보 찾기");
        System.out.println("가입하신 전화번호를 입력해주세요: ");
        String findPhone = scanner.nextLine();
        try {
            User findUser = userService.findByPhonNum(findPhone);
            System.out.println("----------");
            System.out.println("회원찾기 성공");
            System.out.println("id :" + findUser.getUserId());
            System.out.println("password : " + findUser.getUserPassword());
            System.out.println("----------");
        } catch (InputMismatchException e) {
            System.out.println("찾기 실패 : " + e.getMessage());
        }
    }



    // /////////////////
    // 사용자메뉴
    private static void userMenu(User user) {
        while (true) {
            System.out.println("\n===== 사용자 메뉴 =====");
            System.out.println("환영합니다 ( " + user.getUserId() + " ) 님!");
            System.out.println("1. 내 정보 보기");
            System.out.println("2. 포인트 충전");
            System.out.println("3. 정보 수정");
            System.out.println("4. 뽑기 메뉴");
            System.out.println("5. 회원 탈퇴");
            System.out.println("6. 로그아웃");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> printUserInfo(user);
                case 2 -> chargeMoney(user);
                case 3 -> {
                    if (updateUserInfo(user)) return;
                }
                case 4 -> {
                    RandomDrawController drawController =
                            new RandomDrawController(user, userService, drawService);
                    drawController.startDrawMenu();
                }
                case 5 -> {
                    if (leaveUser(user)) return;
                }
                case 6 -> {
                    System.out.println("로그아웃 되었습니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }




    // 내정보
    private static void printUserInfo(User user) {
        System.out.println();
        System.out.println("--- 내정보 ---");
        System.out.println("아이디: " + user.getUserId());
        System.out.println("잔액: " + user.getMoney());
        System.out.println("전화번호: " + user.getPhoneNumber());
        System.out.println("-------------");
    }

    // 잔액 충전
    private static void chargeMoney(User user) {
        System.out.print("비밀번호를 입력해 주세요 : ");
        String inputPw = scanner.nextLine();

        if (!(user.getUserPassword().equals(inputPw))){
            System.out.println("비밀번호가 맞지않습니다");
            return;
        }

        System.out.print("충전 금액 (500원 단위): ");
        int inputMoney = scanner.nextInt();

        try {
            userService.chargeMoney(user, inputMoney);
            System.out.println("충전 완료 되었습니다");
            System.out.println("잔액 : " + user.getMoney());
        } catch (IllegalArgumentException e) {
            System.out.println("충전 실패: " + e.getMessage());
        }
    }

    // 정보수정
    private static boolean updateUserInfo(User user) {
        System.out.print("현재 비밀번호를 입력해 주세요 : ");
        String inputPw = scanner.nextLine();

        if (!(user.getUserPassword().equals(inputPw))){
            System.out.println("비밀번호가 맞지않습니다");
            return false;
        }


        System.out.print("변경할 아이디 입력 (그대로 두려면 Enter): ");
        String newId = scanner.nextLine();
        if(newId.isEmpty()) {newId = user.getUserId(); }

        System.out.print("변경할 비밀번호 입력 (그대로 두려면 Enter): ");
        String newPw = scanner.nextLine();
        if(newPw.isEmpty()) {newPw = user.getUserPassword(); }

        System.out.print("변경할 전화번호 입력 (그대로 두려면 Enter): ");
        String newPhone = scanner.nextLine();
        if(newPhone.isEmpty()) {newPhone = user.getPhoneNumber(); }


        try {
            userService.updateUser(user, inputPw, newId, newPw,newPhone);
            System.out.println("정보 수정 성공 : 재로그인 해주세요");
            return true; // 메인 메뉴로 이동
        } catch (IllegalArgumentException e) {
            System.out.println("정보 수정 실패: " + e.getMessage());
            return false;
        }
    }

    private static boolean leaveUser(User user) {
        System.out.println("\n--- 회원 탈퇴 ---");
        System.out.println("비밀번호 입력 : ");
        String inputPw = scanner.nextLine();

        if (!(user.getUserPassword().equals(inputPw))) {
            System.out.println("비밀번호가 맞지않습니다");
            return false;
        }

        System.out.println("탈퇴 시 남아있던 포인트는 소멸합니다");
        System.out.print("정말 탈퇴하시겠습니까? (y/n): ");
        String check = scanner.nextLine();

        if (check.equalsIgnoreCase("y")) {
            userService.deleteUser(user);
            System.out.println("회원 탈퇴 완료. 이용해 주셔서 감사합니다.");
            return true;
        } else if (check.equalsIgnoreCase("n")) {
            System.out.println("탈퇴가 취소되었습니다.");
            return false;
        } else {
            System.out.println("탈퇴여부를 잘못 입력하셨습니다");
            return false;
        }
    }



    // /////////////////
    //  관리자 메뉴
    private static void adminMenu(){

        User adminUser = null;

        while (true) {
            System.out.println("\n===== 관리자 메뉴 =====");

            if (adminUser == null) {
                System.out.println("1. 관리자 로그인");
                System.out.println("2. 관리자 추가");
                System.out.println("9. 메인메뉴");
                System.out.print("선택: ");
            } else {
                System.out.println(" 현재 접속정보 : " + adminUser.getUserId());
                System.out.println("2. 관리자 추가");
                System.out.println("3. 전체유저 검색");
                System.out.println("4. 뽑기내역 검색");
                System.out.println("5. 상품리스트 검색");
                System.out.println("6. 뽑기상품 추가");
                System.out.println("9. 메인메뉴");
                System.out.print("선택: ");
            }




            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    if(adminUser==null){
                    adminUser = adminLogin();
                    }else{
                        System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    }
                }

                case 2 -> adminRegister();

                case 3 -> showAllUsers();

                case 4 -> showAllDrawHistory();

                case 5 -> showAllItems();

                case 6 -> addDrawItem();

                case 9 -> {
                    System.out.println("메인메뉴로 돌아갑니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

    }


    private static User adminLogin(){
        System.out.println("--- 관리자 로그인 ---");
        System.out.print("아이디 입력: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호 입력: ");
        String pw = scanner.nextLine();

        try {
            User loginAdmin = userService.loginAdmin(id, pw);
            System.out.println("로그인 성공: " + loginAdmin.getUserId());
            return loginAdmin;
        } catch (IllegalArgumentException e) {
            System.out.println("로그인 실패: " + e.getMessage());
            return null;
        }

    }

    private static void adminRegister(){
        System.out.println("--- 관리자 추가 ---");
        System.out.print("아이디 입력: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호 입력: ");
        String pwd = scanner.nextLine();

        System.out.print("휴대전화번호 입력: ");
        String phone = scanner.nextLine();


        try {
            userService.joinUser(id,pwd,phone,ADMIN);
            System.out.println("관리자 가입 성공: " + id);
        } catch (IllegalArgumentException e) {
            System.out.println("관리자 가입 실패: " + e.getMessage());
        }

    }




    private static void addDrawItem() {
        System.out.println("--- 아이템 추가 ---");
        System.out.print("아이템 이름: ");
        String itemName = scanner.nextLine();

        System.out.print("아이템 설명: ");
        String itemContent = scanner.nextLine();

        System.out.println();

        System.out.print("카테고리 ( 포유류 , 어류 , 조류 , 파충류 , 갑각류 ): ");
        Category category = Category.valueOf(scanner.nextLine().trim());


        drawService.addItem(itemName, itemContent, category);
        System.out.println("아이템 추가 완료!");
    }



    // 전체 유저 조회
    private static void showAllUsers() {
        userService.findAllUser().forEach(System.out::println);
    }

    // 전체 뽑기 기록 조회
    private static void showAllDrawHistory() {
        Map<String, List<DrawItem>> allHistory = drawService.getAllHistory();
        if (allHistory.isEmpty()) {
            System.out.println("뽑기 기록이 없습니다.");
            return;
        }

        System.out.println("\n===== 전체 뽑기 기록 =====");
        allHistory.forEach((userId, history) -> {
            System.out.println("[" + userId + "]");
            history.forEach(item -> System.out.println(" - " + item));
        });
        System.out.println("=========================");
    }


    // 전체 아이템 조회
    private static void showAllItems() {
        List<DrawItem> items = drawService.getAllItems();
        if (items.isEmpty()) {
            System.out.println("등록된 아이템이 없습니다.");
            return;
        }

        System.out.println("\n===== 전체 아이템 목록 =====");
        items.forEach(System.out::println);
        System.out.println("==========================");
    }




}// class
