package 수학;
import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;

class Solution3{
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("키 : ");
        float cm = scanner.nextFloat();
        System.out.println("몸무게 : ");
        int kg = scanner.nextInt();
        
        System.out.println(solution.solution(cm, kg, name));
        
    }
    String solution(float cm, int kg, String name){
        String title = "        ###### 비만도 계산 ###### " ;
        float bmi = 0;
        float meter = 0;
        String biman = "";
        meter = cm / 100;
        bmi = (kg / (meter*meter));
        
        if(bmi >= 35){biman = "고도 비만";}
        else if(bmi >= 30.0){biman = "중도 비만";}
        else if(bmi >= 25.0){biman = "경도 비만";}
        else if(bmi >= 23.0){biman = "과체중";}
        else if(bmi >= 18.5){biman = "정상";}
        else {biman = "저체중";}
        return String.format(
        "%s\n ****************************************"
        +"\n 이름       키     몸무게   비만도    bmi"
        +"\n ****************************************"
        +"\n %s   %.1fcm   %dkg    %s   %.1f "
        +"\n ****************************************", title, name, cm, kg, biman, bmi);

    }

}