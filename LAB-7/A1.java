import java.util.Scanner;

class Student{
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code = new String[no_of_subjects_registered];
    int[] subject_credits = new int[no_of_subjects_registered];
    String[] grade_obtained = new String[no_of_subjects_registered];

    public Student(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits, String[] grade_obtained){
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
    }

    public void print(){
        System.out.println("code= "+subject_code);
        System.out.println("subject credit= "+subject_credits);
        System.out.println("grade= "+grade_obtained);
    }
    public void calculate_spi() {
        int total_credits = 0;
        int total_grade_points = 0;
    
        for (int i = 0; i < no_of_subjects_registered; i++) {
            int grade_point = 0;
            switch (grade_obtained[i]) {
                case "A++":
                    grade_point = 10;
                    break;
                case "A+":
                    grade_point = 9;
                    break;
                case "A":
                    grade_point = 8;
                    break;
                case "B+":
                    grade_point = 7;
                    break;
                case "B":
                    grade_point = 6;
                    break;
                case "C":
                    grade_point = 5;
                    break;
                case "D":
                    grade_point = 4;
                    break;
                case "F":
                    grade_point = 0;
                    break;
                default:
                    System.out.println("Invalid" + grade_obtained[i]);
                    continue;
            }
    
            total_grade_points += grade_point * subject_credits[i];
            total_credits += subject_credits[i];
        }
    
            double spi = (double) total_grade_points / total_credits;
            System.out.printf("SPI: %.2f\n", spi);
    }
}

public class A1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Enter id no of Student "+(i+1)+":");
            int id_no = sc.nextInt();

            System.out.println("Enter total subjects:");
            int no_of_subjects_registered = sc.nextInt();

            String[] subject_code = new String[no_of_subjects_registered];
            int[] subject_credits = new int[no_of_subjects_registered];
            String[] grade_obtained = new String[no_of_subjects_registered];


            for(int j = 0; j < no_of_subjects_registered; j++){
                sc.nextLine();
                System.out.println("Enter subject code:");
                subject_code[i] = sc.nextLine();

                System.out.println("Enter subject credit:");
                subject_credits[i] = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter subject grade:");
                grade_obtained[i] = sc.nextLine();
            }

            s[i]= new Student(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
        }

        for( int i = 0; i<n; i++){
            System.out.println("Student :"+(i+1)+"");
            s[i].print();
            s[i].calculate_spi();
        }
    }
}
