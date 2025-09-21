package com.sangjae.rdpoject.main_ui;

import com.sangjae.rdpoject.domain.Category;
import com.sangjae.rdpoject.domain.DrawItem;
import com.sangjae.rdpoject.domain.User;
import com.sangjae.rdpoject.repository.UserRepository;
import com.sangjae.rdpoject.repository.DrawRepository;
import com.sangjae.rdpoject.service.DrawService;
import com.sangjae.rdpoject.service.UserService;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomDrawController {
    private final User user;
    private final UserService userService;
    private final DrawService drawService;
    private final Scanner scanner = new Scanner(System.in);


    public RandomDrawController(User user, UserService userService, DrawService drawService) {
        this.user = user;
        this.userService = userService;
        this.drawService = drawService;
    }

    public void startDrawMenu() {
        while (true) {
            int checkItem = drawService.getAllItems().size();

            System.out.println("\n===== 랜덤 뽑기 메뉴 =====");
            System.out.println("1. 랜덤뽑기 500p ( 잔여수량: " + checkItem +"개 )");
            System.out.println("2. 뽑기 기록 조회");
            System.out.println("3. 전체 뽑기 랭킹");
            System.out.println("4. 뒤로가기");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> drawItem();
                case 2 -> showDrawHistory();
                case 3 -> showUserRanking();
                case 4 -> {
                    System.out.println("사용자 메뉴로 돌아갑니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력");
            }
        }
    }

    private void drawItem() {

        try {
            int cost = 500;
            System.out.println("뽑기 결과: ");
           drawService.startDraw(user, cost);

        } catch (IllegalArgumentException e) {
            System.out.println("실패 : " +e.getMessage());
        }
    }

    private void showDrawHistory() {
        List<DrawItem> history = drawService.getDrawHistory(user);
        if (history.isEmpty()) {
            System.out.println("뽑기 기록이 없습니다.");
            return;
        }

        while (true) {
            System.out.println("\n--- 뽑기 기록 ---");
            for (int i = 0; i < history.size(); i++) {
                DrawItem item = history.get(i);
                System.out.printf("%d. %s \n", i + 1, item.getItemName());
            }
            System.out.println("0. 돌아가기");
            System.out.print("상세보기 번호 선택: ");

            int choice = 0;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            if (choice == 0) {
                break;

            } else if (choice > 0 && choice <= history.size()) {

                DrawItem selectedItem = history.get(choice - 1);
                drawService.itemView(selectedItem);
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 랭킹
    private void showUserRanking() {
        System.out.println("\n===== 뽑기 랭킹 =====");
        drawService.printUserRanking();
    }
}
