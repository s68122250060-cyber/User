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

## 8
import java.util.Scanner;

public class ReviewMethod {
    // 1-3. สร้าง Method ชื่อ findMax รับ int 2 ตัว และคืนค่าตัวที่มากที่สุด 
    public static int findMax(int a, int b) {
        if (a > b) {
            return a; // ถ้า a มากกว่า คืนค่า a 
        } else {
            return b; // ถ้าไม่ใช่ คืนค่า b 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // [cite: 210]
        
        // 4. ใน main รับค่าจากผู้ใช้ 2 จำนวน 
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        
        // 5. เรียกใช้ Method และแสดงผลลัพธ์ 
        int result = findMax(num1, num2);
        System.out.println("Maximum number = " + result);
        
        scanner.close();
    }
}

## 9
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

## 10
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

## 11
Prompt ที่ใช้ถาม AI: > "ช่วยตรวจสอบโค้ด Java ต่อไปนี้ว่ามีข้อผิดพลาดหรือไม่ และอธิบายอย่างเข้าใจง่าย แต่ไม่ต้องเขียนโค้ดใหม่ทั้งหมด [ใส่โค้ดตอนที่ 9 ลงไป]"

1. AI พบข้อผิดพลาดอะไรหรือไม่
ตอบ: พบข้อผิดพลาดเรื่อง ArrayIndexOutOfBoundsException ในลูป for เนื่องจากการใช้เงื่อนไข i <= numbers.length ซึ่งทำให้ดัชนีเกินแถวของ Array จริง
2. คำแนะนำของ AI ถูกต้องหรือไม่ เพราะเหตุใด
ตอบ: ถูกต้อง เพราะการใช้เงื่อนไขตรวจสอบผิดประเภทของตัวชี้ Index ทำให้ระบบเรียกหาตำแหน่งข้อมูลที่ไม่ได้มีอยู่ในหน่วยความจำจริง การแก้เป็น < จึงเป็นการตัดจบลูปที่สมาชิกตัวสุดท้ายพอดี
3. นักศึกษาแก้ไขโค้ดตาม AI หรือไม่
ตอบ: แก้ไขตามคำแนะนำ โดยปรับเปลี่ยนเครื่องหมายความสัมพันธ์ในเงื่อนไขลูป
4. นักศึกษาได้เรียนรู้อะไรจากการใช้ AI ตรวจโค้ด
ตอบ: ได้เห็นวิธีการจำลองการทำงานในหัวของคอมพิวเตอร์ (Dry Run) ที่ AI อธิบายมาทีละบรรทัด ทำให้เข้าใจชัดเจนว่าข้อผิดพลาดเกิดจากการนับตำแหน่ง Index สับสนระหว่าง 'จำนวนความยาวสมาชิกทั้งหมด' กับ 'ลำดับ Index จริง'
5. มีข้อควรระวังอะไรในการใช้ AI ช่วยเขียนโปรแกรม
ตอบ: AI อาจจะให้คำตอบที่ไม่ถูกต้องร้อยเปอร์เซ็นต์ หรือให้ตรรกะที่ซับซ้อนเกินกว่าโครงสร้างวิชาเรียน ดังนั้นเราต้องเข้าใจทฤษฎีพื้นฐานก่อน เพื่อที่จะสามารถกรองและวิเคราะห์ได้ว่าคำแนะนำของ AI นำมาประยุกต์ใช้ได้เหมาะสมจริงหรือไม่
