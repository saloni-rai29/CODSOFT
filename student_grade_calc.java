import java.util.Scanner;
public class student_grade_calc {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject :");
        int num = sc.nextInt();
        float [] marks = new float[num];
        float total =0;
        String grade ;
        System.out.println("enter marks obtained out of 100 ");
        for(int i=0;i<num;i++){
            System.out.println("subject "+ (i+1) +": ");
            marks[i]= sc.nextFloat();
            total+=marks[i];
        }
        float avg = total/(num*100);
        float percent = avg*100;
        if(percent <= 100 && percent > 90){
            grade ="A+" ;
        }
        else if(percent<= 90 && percent > 80 ){
            grade=" A";
        }
        else if (percent<=80 && percent>70){
            grade="B+";
        }
        else if (percent<= 70 && percent > 60){
            grade="B";
        }
        else if(percent <=60 && percent >50){
            grade = "C+";
        }
        else if (percent <= 50 && percent>40){
            grade ="C";
        }
        else if( percent<= 40 && percent >=33){
            grade ="D";
        }
        else grade ="FAIl";
        System.out.println("__________MAXIMUM MARKS : " + num*100);
        System.out.println("__________TOTAL MARKS OBTAINED : " + total);
        System.out.println("__________AVERAGE PERCENTAGE : "+ percent);
        System.out.println("__________GRADE : "+grade);

    }
}