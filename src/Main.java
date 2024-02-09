//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Passport passport = new Passport();
//        passport.id = "AN1234567";
//        passport.firstName = "ДОНАЛЬДЬБЕK";
//        passport.lastName = "ДЖОН УУЛУ ";
//        passport.dateOfBirth = "01.01.1991";
//        passport.gender = "Э/М/M";
//
//
//
//        System.out.println("   THE KYRGYZ REPUBLIC ");
//        System.out.println(" \nФамилиясы/Фамилия/Surname \n"+passport.lastName);
//        System.out.println("Аты/Имя/Name \n"+passport.firstName);
//        System.out.println("Жынысы/Пол/Sex \n"+passport.gender);
//        System.out.println("Date of birth           Document # ");
//        System.out.println(passport.dateOfBirth +"              "+passport.id);

        System.out.println("Task 2 ");

        Student student1 =  new Student();
        student1.name = "Beknazar";
        student1.age = 16;
        student1.group = "JS";

        Student student2 =  new Student();
        student2.name = "Sabina";
        student2.age = 19;
        student2.group = "JAVA";

        Student student3 =  new Student();
        student3.name = "Sultan";
        student3.age = 21;
        student3.group = "Java";

        Student student4 =  new Student();
        student4.name = "Nurik";
        student4.age = 24;
        student4.group = "JS";

        Student student5 =  new Student();
        student5.name = "Yzat";
        student5.age = 18;
        student5.group = "JS";


        Student [] students = new Student[] {student1,student2,student3,student4,student5};

        int countJava = 0;
        int countS = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].group.equalsIgnoreCase("Java")){
                countJava++;
            }else {countS++;
          }
        }
        System.out.println("Java cout :  "+countJava);
        System.out.println("JS count :  "+ countS);

        System.out.println("Jashtarynyn arifmeticalyk orto sany: "+ (student1.age+student2.age+student3.age+student4.age+ student5.age)/5);
    }
}