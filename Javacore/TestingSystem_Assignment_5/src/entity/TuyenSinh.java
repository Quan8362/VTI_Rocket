package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private List<Contestant> contestants;
    private Scanner sc;

    public TuyenSinh() {
        sc = new Scanner(System.in);
        contestants = new ArrayList<>();
    }

    @Override
    public void addContestant() {
        System.out.println("Nhập vào tên thí sinh: ");
        String name = sc.next();
        System.out.println("Nhập vào địa chỉ thí sinh: ");
        String addess = sc.next();
        System.out.println("Nhập vào mức ưu tiên thí sinh: ");
        int priority = sc.nextInt();
        System.out.println("Nhập vào khối dự thi của thí sinh: ");
        String block = sc.next();
        Contestant contestant = new Contestant(name, addess, priority, new Block(block));
        contestants.add(contestant);
    }

    @Override
    public void showInfoContestant() {
        for (Contestant conts : contestants) {
            System.out.println(conts);
        }
    }

    @Override
    public void findByIdNum(int id) {
        for (Contestant conts : contestants) {
            if (conts.getIdNumber() == id) {
                System.out.println(conts);
            }
        }
    }
}
