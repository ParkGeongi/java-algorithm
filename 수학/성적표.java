package 수학;
/**
 * 
 */
import java.util.*;
class Solution2{
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("국어 성적: ");
        int a = scanner.nextInt();
        System.out.println("영어 성적: ");
        int b = scanner.nextInt();
        System.out.println("수학 성적: ");
        int c = scanner.nextInt();
        System.out.println(" ### 성적표 ### ");
        System.out.println("*******************************");
        System.out.println(solution.solution(a, b, c, name));
        System.out.println("*******************************");
        h
    
    }
    String solution(int a, int b, int c, String name){
        
        int total = 0;
        total = a + b + c;
        float avg = 0;
        avg = total / 3;
        String grade = "";
        
        if(avg >= 90){grade = "A";}
        else if(avg >= 80){grade = "B";}
        else if(avg >= 70){grade = "C";}
        else if(avg >= 60){grade = "D";}
        else if(avg >= 50){grade = "E";}
        else {grade = "F";}
        return String.format("이름 국어 영어 수학 총점 평균 학점 \n %s %d %d %d %d %.1f %s ", name, a, b, c, total, avg, grade);
    }
}

