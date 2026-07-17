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

# ตอนที่ 1: ทบทวนคำสั ่งพื้นฐาน Java
คำสั่ง
ให้นักศึกษาเติมคำตอบให้ถูกต้อง

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

# ตอนที่ 2: วิเคราะห์โค้ด Java
คำสั่ง
ให้นักศึกษาอ่านโค้ดต่อไปนี้ แล้วตอบคำถาม

int sum = 0;
for (int i = 1; i <= 5; i++) {
    sum = sum + i;
}
System.out.println(sum);

## 2.1โปรแกรมนี้วนซ้ำทั้งหมดกี่รอบ   
ตอบ: 5 รอบ    
## 2.2ค่าของตัวแปร sum หลังจบการทำงานคือเท่าใด   
ตอบ: 15   
## 2.3ผลลัพธ์ที่แสดงออกหน้าจอคืออะไร   
ตอบ: 15   
## 2.4โปรแกรมนี้ทำหน้าที่อะไร   
ตอบ: คำนวณหาผลรวมของตัวเลขตั้งแต่ 1 ถึง 5 

# ตอนที่ 3: เขียนโปรแกรมตรวจสอบเลขคู่หรือเลขคี่
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับตัวเลขจำนวนเต็ม 1 จำนวน แล้วตรวจสอบว่าเป็นเลขคู่หรือเลขคี่

เงื่อนไขของโปรแกรม

รับค่าตัวเลขจากผู้ใช้

ถ้าตัวเลขหารด้วย 2 ลงตัว ให้แสดงคำว่า Even number

ถ้าหารด้วย 2 ไม่ลงตัว ให้แสดงคำว่า Odd number

ตัวอย่างผลลัพธ์
Enter number: 8
Even number

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

# ตอนที่ 4: เขียนโปรแกรมคำนวณคะแนนรวมและตัดสินผลผ่าน / ไม่ผ่าน
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับคะแนนกลางภาคและคะแนนปลายภาค จากนั้นคำนวณคะแนนรวม และตัดสินว่านักศึกษาผ่านหรือไม่ผ่าน

เงื่อนไขของโปรแกรม

รับคะแนนกลางภาค

รับคะแนนปลายภาค

คำนวณคะแนนรวม

ถ้าคะแนนรวมตั้งแต่ 50 คะแนนขึ้นไป ให้แสดงคำว่า Pass

ถ้าคะแนนรวมน้อยกว่า 50 คะแนน ให้แสดงคำว่า Fail

ตัวอย่างผลลัพธ์
Enter midterm score: 25
Enter final score: 30
Total score = 55
Pass

## 4.1Pseudocode

เริ่มต้น
ประกาศตัวเเปร midterm, finalScore และ total เป็นจำนวนเต็ม

รับค่า คะแนนกลางภาค (midterm)
รับค่า คะแนนปลายภาค (finalScore)
คำ นวณ total = midterm + finalScore
แสดง "Total score = " และคา่ total
ถา้ total >= 50
แสดง "Pass"
มิฉะนั่น
แสดง "Fail"
จบเงื่อนไข 
สิ้นสุดโปรเเกรม
## 4.2
import java.util.Scanner;
public class TotalScore {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter midterm score: ");
int midterm = sc.nextInt();
System.out.print("Enter final score: ");
int finalScore = sc.nextInt();
int total = midterm + finalScore;
System.out.println("Total score = " + total);
if (total >= 50) {
System.out.println("Pass");
} else {
System.out.println("Fail");
}
sc.close();
}
}

# ตอนที่ 5: เขียนโปรแกรมหาค่ามากที่สุดจากตัวเลข 3 จำนวน
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับตัวเลขจำนวนเต็ม 3 จำนวน แล้วแสดงค่าที่มากที่สุด

เงื่อนไขของโปรแกรม

รับตัวเลขจำนวนเต็ม 3 จำนวน

เปรียบเทียบค่าทั้ง 3 จำนวน

แสดงค่าที่มากที่สุด

ตัวอย่างผลลัพธ์
Enter number 1: 12
Enter number 2: 25
Enter number 3: 9
Maximum number = 25

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

# ตอนที่ 6: ทบทวน Array
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อรับคะแนนของนักศึกษา 5 คน เก็บไว้ใน Array แล้วคำนวณคะแนนรวมและค่าเฉลี่ย

เงื่อนไขของโปรแกรม

สร้าง Array สำหรับเก็บคะแนน 5 ค่า

รับคะแนนจากผู้ใช้ทีละคน

คำนวณคะแนนรวม

คำนวณค่าเฉลี่ย

แสดงคะแนนรวมและค่าเฉลี่ย

ตัวอย่างผลลัพธ์
Enter score 1: 70
Enter score 2: 80
Enter score 3: 65
Enter score 4: 90
Enter score 5: 75
Total score = 380
Average score = 76.0

## 6.1Pseudocode
START
    CREATE array scores of size 5
    sum = 0
    FOR i = 0 TO 4 DO
        INPUT scores[i]
        sum = sum + scores[i]
    ENDFOR
    average = sum / 5.0
    OUTPUT "Total score = " + sum
    OUTPUT "Average score = " + average
END

## 6.2 
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5]; // 1. สร้าง Array เก็บ 5 ค่า [cite: 175]
        int sum = 0;
        
        // 2. ใช้ for loop รับคะแนนทีละคน [cite: 177]
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            sum += scores[i]; // 3. เก็บสะสมคะแนนรวม [cite: 178]
        }
        
        // 4. คำนวณค่าเฉลี่ย (แปลง sum เป็น double เพื่อความแม่นยำของทศนิยม) [cite: 179]
        double average = (double) sum / scores.length;
        
        // 5. แสดงผล [cite: 180]
        System.out.println("Total score = " + sum);
        System.out.println("Average score = " + average);
        
        scanner.close();
    }
}

# ตอนที่ 7: ค้นหาข้อมูลใน Array
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java เพื่อค้นหาชื่อในรายชื่อนักศึกษา 5 คน

เงื่อนไขของโปรแกรม

กำหนดรายชื่อนักศึกษา 5 คนไว้ใน Array

รับชื่อที่ต้องการค้นหาจากผู้ใช้

ตรวจสอบว่าชื่อนั้นมีอยู่ใน Array หรือไม่

ถ้าพบ ให้แสดงคำว่า Found

ถ้าไม่พบ ให้แสดงคำว่า Not Found

ตัวอย่างผลลัพธ์
Enter name to search: Somchai
Found

## 7.1Pseudocode
START
    CREATE array names = ["Somchai", "Somsri", "Sompong", "Somnak", "Somjit"]
    INPUT searchName
    found = false
    FOR i = 0 TO 4 DO
        IF names[i] EQUALS searchName THEN
            found = true
            BREAK
        ENDIF
    ENDFOR
    IF found == true THEN
        OUTPUT "Found"
    ELSE
        OUTPUT "Not Found"
    ENDIF
END

## 7.2
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. กำหนดรายชื่อเริ่มต้น 5 คนลงใน Array [cite: 198]
        String[] names = {"Somchai", "Somsri", "Sompong", "Somnak", "Somjit"};
        
        System.out.print("Enter name to search: ");
        String searchName = scanner.next(); // 2. รับชื่อที่ต้องการหา [cite: 199]
        
        boolean isFound = false; // Flag สำหรับเช็คสถานะการค้นหา
        
        // 3. วนลูปเช็คชื่อใน Array [cite: 200]
        for (int i = 0; i < names.length; i++) {
            // สำคัญมาก: ข้อมูลประเภท String ใน Java ต้องเปรียบเทียบด้วย .equals() เท่านั้น!
            if (names[i].equalsIgnoreCase(searchName)) { 
                isFound = true;
                break; // เจอแล้วหลุดลูปทันที (ช่วยเพิ่มความเร็วในการรันโปรแกรม)
            }
        }
        
        // 4-5. ตรวจสอบเงื่อนไขหลังจบลูปแล้วแสดงผล [cite: 201, 202]
        if (isFound) {
            System.out.println("Found"); // [cite: 201]
        } else {
            System.out.println("Not Found"); // [cite: 202]
        }
        
        scanner.close();
    }
}

# ตอนที่ 8: เขียน Method เพื่อหาค่ามากที่สุด
คำสั่ง
ให้นักศึกษาเขียนโปรแกรม Java โดยสร้าง Method ชื่อ findMax เพื่อรับตัวเลข 2 จำนวน แล้วคืนค่าที่มากที่สุด

เงื่อนไขของโปรแกรม

สร้าง Method ชื่อ findMax

Method รับค่าจำนวนเต็ม 2 ค่า

Method คืนค่าจำนวนที่มากที่สุด

ใน main ให้รับค่าจากผู้ใช้ 2 จำนวน

เรียกใช้ Method และแสดงผลลัพธ์

ตัวอย่างผลลัพธ์
Enter number 1: 15
Enter number 2: 22
Maximum number = 22

public class ReviewMethod {
public static int findMax(int a, int b) {
// เขียนคำสั่งที่นี่
if (a > b) {
return a;
} else {
return b;
}
}
public static void main(String[] args) {
// เขียนคำสั่งที่นี่

Scanner sc = new Scanner(System.in);
System.out.print("Enter number 1: ");
int num1 = sc.nextInt();
System.out.print("Enter number 2: ");
int num2 = sc.nextInt();
int max = findMax(num1, num2);
System.out.println("Maximum number = " + max);
sc.close();
}
}

# ตอนที่ 9: Debug โปรแกรม
คำสั่ง
โปรแกรมต่อไปนี้มีข้อผิดพลาด ให้นักศึกษาหาข้อผิดพลาดและแก้ไขให้ถูกต้อง

public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50);
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

1. โปรแกรมนี้ผิดพลาดที่บรรทัดใด
ตอบ: ผิดที่เงื่อนไขของลูป For ในบรรทัดที่เขียนว่า i <= numbers.length;
2. เพราะเหตุใดจึงเกิดข้อผิดพลาด
ตอบ: เพราะดัชนี  ของ Array ใน Java จะเริ่มต้นที่ 0 จนถึง length - 1 เสมอ แต่การตั้งเงื่อนไขเครื่องหมาย <= ทำให้ลูปรอบสุดท้ายพยายามเข้าถึงดัชนีที่เท่ากับ numbers.length (ซึ่งก็คือดัชนีที่ 5 แต่อาร์เรย์มีถึงแค่ดัชนีที่ 4) ส่งผลให้โปรแกรมหยุดทำงานรุนแรง และแจ้งข้อผิดพลาดเป็น ArrayIndexOutOfBoundsException
3. ควรแก้ไขอย่างไร
ตอบ: แก้เครื่องหมายเงื่อนไขจาก <= ให้เหลือแค่ < เพื่อไม่ให้ Index เกินขนาดจริงของ Array   

public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // 
        // แก้ไขไขเงื่อนไขตรง i < numbers.length
        for (int i = 0; i < numbers.length; i++) { 
            System.out.println(numbers[i]);
        }
    }
}

# ตอนที่ 10: Mini Challenge
คำสั่ง
ให้นักศึกษาเลือกทำ 1 ข้อ จากโจทย์ต่อไปนี้

## ตัวเลือกที่ 1: โปรแกรมนับจำนวนเลขคู่และเลขคี่
ให้รับตัวเลขจำนวนเต็ม 10 จำนวน เก็บใน Array แล้วนับว่ามีเลขคู่กี่จำนวน และเลขคี่กี่จำนวน
Output ที่ต้องแสดง
Even count = ...
Odd count = ...

## ตัวเลือกที่ 2: โปรแกรมหาค่าต่ำสุดและค่าสูงสุด
ให้รับตัวเลขจำนวนเต็ม 10 จำนวน เก็บใน Array แล้วแสดงค่าต่ำสุดและค่าสูงสุด
Output ที่ต้องแสดง
Minimum number = ...
Maximum number = ...

## ตัวเลือกที่ 3: โปรแกรมค้นหาคะแนนที่ต้องการ
ให้รับคะแนนของนักศึกษา 10 คน เก็บใน Array จากนั้นรับคะแนนที่ต้องการค้นหา และแสดงว่าพบหรือไม่พบคะแนนนั้น
Output ที่ต้องแสดง
Found หรือ Not Found

2'
import java.util.Scanner;

public class MiniChallengeMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // รับตัวเลขจำนวนเต็ม 10 จำนวน 
        
        System.out.println("กรุณาป้อนตัวเลขจำนวนเต็ม 10 จำนวน:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("ตัวเลขที่ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // กำหนดเริ่มต้นให้ค่าที่ดัชนี 0 เป็นทั้งค่าน้อยสุดและมากสุดเพื่อนำไปเปรียบเทียบ
        int min = numbers[0];
        int max = numbers[0];
        
        // วนลูปเพื่อเปรียบเทียบหาค่าจริง
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // อัปเดตค่าต่ำสุด 
            }
            if (numbers[i] > max) {
                max = numbers[i]; // อัปเดตค่าสูงสุด 
            }
        }
        
        // แสดงผลลัพธ์ตาม Format ที่โจทย์กำหนด 
        System.out.println("Minimum number = " + min); // 
        System.out.println("Maximum number = " + max); // 
        
        scanner.close();
    }
}

# ตอนที่ 11: ใช้ GenAI ช่วยตรวจโค้ด
คำสั่ง
หลังจากเขียนโปรแกรมเสร็จ ให้นักศึกษาใช้ GenAI ช่วยตรวจสอบโค้ด 1 โปรแกรม แล้วตอบคำถามต่อไปนี้

Prompt ที่ใช้ถาม AI
ตัวอย่าง Prompt:
"ช่วยตรวจสอบโค้ด Java ต่อไปนี้ว่ามีข้อผิดพลาดหรือไม่ และอธิบายอย่างเข้าใจง่าย แต่ไม่ต้องเขียนโค้ดใหม่ทั้งหมด”
Prompt ที่ใช้ถาม AI: > "ช่วยตรวจสอบโค้ด Java ต่อไปนี้ว่ามีข้อผิดพลาดหรือไม่ และอธิบายอย่างเข้าใจง่าย แต่ไม่ต้องเขียนโค้ดใหม่ทั้งหมด”

## 1. AI พบข้อผิดพลาดอะไรหรือไม่
ตอบ: พบข้อผิดพลาด เเละ เเนะนำจุดที่ควรเเก้ไข เช่น การใช้เงื่อนไขใน for หรือการเข้าถึงข้อมูลใน Array ให้ถูกต้อง

## 2. คำแนะนำของ AI ถูกต้องหรือไม่ เพราะเหตุใด
ตอบ: ถูกต้อง เพราะคำแนะนำอธิบายสาเหตุของข้อผิดพลาดและเสนอวิธีแก้ไขที่ทำให้โปรแกรมทำงานได้ถูกต้อง

## 3. นักศึกษาแก้ไขโค้ดตาม AI หรือไม่
ตอบ: แก้ไขตามคำแนะนำของ AI และทดสอบจนโปรแกรมทำงานได้ถูกต้อง

## 4. นักศึกษาได้เรียนรู้อะไรจากการใช้ AI ตรวจโค้ด
ตอบ: ได้เรียนรู้วิธีหาข้อผิดพลาดในโปรแกรม เข้าเข้าใจการทำงานของคำสั่งต่าง ๆ มากขึ้น และสามารถนำคำแนะนำไปปรับปรุงโค้ดได้

## 5. มีข้อควรระวังอะไรในการใช้ AI ช่วยเขียนโปรแกรม
ตอบ: ไม่ควรคัดลอกโค้ดจาก AI มาใช้ทันที ควรอ่าน ทำความเข้าใจ และทดสอบโค้ดทุกครั้ง เพื่อให้มั่นใจว่าโค้ดถูกต้องและเหมาะสมกับโจทย์ที่ได้รับ

งานที่ต้องส่ง
ให้นักศึกษาส่งงานดังต่อไปนี้

 # 1.ไฟล์ Java อย่างน้อย 4 โปรแกรม

    ตรวจสอบเลขคู่/เลขคี่
    คำนวณคะแนนรวมและผ่าน/ไม่ผ่าน
    โปรแกรมเกี่ยวกับ Array
    Mini Challenge 1 โปรแกรม

 # 2.เอกสารสั้นหรือ README ประกอบด้วย

ชื่อโปรแกรม
Input
Process
Output
วิธีรันโปรแกรม
สิ่งที่ได้เรียนรู้

 # 3.คำตอบ Reflection จากตอนที่ 11

Reflection หลังทำใบงาน
ให้นักศึกษาตอบคำถามต่อไปนี้

## 1.ส่วนใดของ Java ที่นักศึกษายังไม่มั่นใจมากที่สุด
ตอบ: การ overite หรือ OOP

## 2.โจทย์ข้อใดยากที่สุด เพราะเหตุใด
ตอบ: 10 ครับ คิดไม่ค่อยออก

## 3.การทบทวน Java ครั้งนี้ช่วยเตรียมตัวเรียน Algorithm อย่างไร
ตอบ: ทบทวนสมองก่อนเข้าเรียนจริงครับ เเต่ก็ยังไม่มีครับ

## 4.นักศึกษาคิดว่า Java ส่วนใดสำคัญที่สุดต่อการเรียน Algorithm
ตอบ: อ่านสิ่งที่โจทย์ต้องการออก จะได้คิดเป็นภาพเเล้วเขียนได้

## 5.นักศึกษาจะฝึกเพิ่มเติมเรื่องใดก่อนเรียนสัปดาห์ถัดไป
ตอบ: อ่านทุกอย่าง ทบทวนที่ขาดทั้งหมด
