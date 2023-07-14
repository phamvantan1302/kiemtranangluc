
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class CountNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] kyTu = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
        Pattern p = Pattern.compile("^[A-Za-z0-9]+$");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String save = "";
        String chuoi = "";
        Boolean check;
        do {
            System.out.println("Nhập vào chuỗi bất kỳ(chữ hoặc số): ");
            chuoi = scanner.nextLine();
            if (chuoi.isEmpty() | !p.matcher(chuoi).find()) {
                System.out.println("Chuỗi chứa ký tự đặc biệt hoặc khoảng trắng hoặc còn trống");
            }
        } while (chuoi.isEmpty() | !p.matcher(chuoi).find());

        for (int i = 0; i < kyTu.length; i++) {
            if (chuoi.contains(kyTu[i])) {
                save = save + kyTu[i] + " ";
                count++;
            }

        }
        System.out.println(count + "(" + save + ")");

    }

}
