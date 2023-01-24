package homeWorksGit.polymorphism.task1;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием, введите номер, чтобы выстрелить,-1 чтобы выйти%n", player.getSlotsCount());

        while(true) {
            System.out.println("Введите номер");
            int slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Game over!");
                return;
            }

            player.shotWithWeapon(slot);
        }
    }
}
