# ใบงานทบทวนภาษา Java
คำชี้แจงสำหรับนักศึกษา
ให้นักศึกษาท าใบงานนี้เพื่อทบทวนความรู้ภาษา Java ที่จ าเป็นต่อการเรียนเรื่องอัลกอริทึม ได้แก่ ตัว
แปร เงื่อนไข วนซ ้า อาร์เรย์ เมธอด และการเขียนโปรแกรมแก้ปัญหาเบื้องต้น
ให้นักศึกษาเขียนโปรแกรมด้วยภาษา Java และส่งไฟล์.java หรืออัปโหลดลง GitHub ตามที่ผู้สอน
กำหนด
จุดประสงค์การเรียนรู้
หลังจากทำใบงานนี้ นักศึกษาสามารถ
1. เขียนโปรแกรม Java รับข้อมูลและแสดงผลได้
2. ใช้คeสั่ง if-else เพื่อตัดสินใจได้
3. ใช้คำสั่ง for และ while เพื่อวนซ ้าได้
4. ใช้ Array ในการเก็บและประมวลผลข้อมูลได้
5. เขียน Method เพื่อแบ่งการท างานของโปรแกรมได้
6. อธิบายขั้นตอนการท างานของโปรแกรมในรูปแบบ Pseudocode ได้
ตอนที่ 1: ทบทวนคำสั ่งพื้นฐาน Java
คำสั่ง
ให้นักศึกษาเติมค าตอบให้ถูกต้อง
## 1.1 คำสั่งแสดงผลข้อความในภาษา Java คืออะไร
ตอบ:System.out.println() (แสดงผลแล้วขึ้นบรรทัดใหม่) หรือ System.out.print() (แสดงผลแบบไม่ขึ้นบรรทัดใหม่)  
## 1.2 คำสั่งรับค่าจากแป้นพิมพ์โดยใช้ Scanner ต้อง import อะไร
ตอบ: import java.util.Scanner;
## 1.3 คำสั่งใดใช้ตรวจสอบเงื่อนไข
ตอบ: คำสั่ง if, if-else, หรือ switch-case
## 1.4 คำสั่งใดใช้วนซ ้าเมื่อทราบจ านวนรอบแน่นอน
ตอบ: ำสั่ง for loop
## 1.5 คำสั่งใดใช้วนซ ้าเมื่อยังไม่ทราบจ านวนรอบแน่นอน
ตอบ: คำสั่ง while loop หรือ do-while loop   

## 2.1โปรแกรมนี้วนซ้ำทั้งหมดกี่รอบ   
ตอบ: 5 รอบ    
## 2.2ค่าของตัวแปร sum หลังจบการทำงานคือเท่าใด   
ตอบ: 15   
## 2.3ผลลัพธ์ที่แสดงออกหน้าจอคืออะไร   
ตอบ: 15   
## 2.4โปรแกรมนี้ทำหน้าที่อะไร   
ตอบ: คำนวณหาผลรวมของตัวเลขตั้งแต่ 1 ถึง 5 

## 3.1 Pseudocode
START
    INPUT number
    IF number MOD 2 == 0 THEN
        OUTPUT "Even number"
    ELSE
        OUTPUT "Odd number"
    ENDIF
END
## 3.2
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = scanner.nextInt(); // รับค่าเลขจำนวนเต็ม [cite: 122]
        
        // ใช้เครื่องหมาย % (Modulo) เพื่อหาเศษจากการหาร
        if (number % 2 == 0) { 
            System.out.println("Even number"); // หาร 2 ลงตัว เศษเป็น 0 [cite: 123]
        } else {
            System.out.println("Odd number");  // หาร 2 ไม่ลงตัว [cite: 124]
        }
        
        scanner.close();
    }
}

## 4.1Pseudocode
START
    INPUT midtermScore
    INPUT finalScore
    totalScore = midtermScore + finalScore
    OUTPUT "Total score = " + totalScore
    IF totalScore >= 50 THEN
        OUTPUT "Pass"
    ELSE
        OUTPUT "Fail"
    ENDIF
END

## 4.2
import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter midterm score: ");
        int midterm = scanner.nextInt(); // รับคะแนนกลางภาค [cite: 139]
        
        System.out.print("Enter final score: ");
        int finalScore = scanner.nextInt(); // รับคะแนนปลายภาค [cite: 140]
        
        int totalScore = midterm + finalScore; // คำนวณคะแนนรวม [cite: 141]
        System.out.println("Total score = " + totalScore);
        
        if (totalScore >= 50) {
            System.out.println("Pass"); // [cite: 142]
        } else {
            System.out.println("Fail"); // [cite: 143]
        }
        
        scanner.close();
    }
}

## 5.1Pseudocode
START
    INPUT num1, num2, num3
    max = num1 // สมมติให้ตัวแรกมากที่สุดก่อน
    IF num2 > max THEN
        max = num2
    ENDIF
    IF num3 > max THEN
        max = num3
    ENDIF
    OUTPUT "Maximum number = " + max
END

## 5.2
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt(); // [cite: 157]
        
        int max = num1; // ขั้นตอนแรก: ตั้งหลักให้ num1 เป็นค่ามากสุดก่อน [cite: 158]
        
        if (num2 > max) {
            max = num2; // ถ้า num2 ดันมากกว่า max ปัจจุบัน ให้เปลี่ยนมาเก็บ num2 แทน [cite: 158]
        }
        if (num3 > max) {
            max = num3; // ถ้า num3 มากกว่า max ปัจจุบัน ให้เปลี่ยนมาเก็บ num3 แทน [cite: 158]
        }
        
        System.out.println("Maximum number = " + max); // [cite: 159]
        scanner.close();
    }
}
