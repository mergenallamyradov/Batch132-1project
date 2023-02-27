package day19constructorsaccessmodifiersstatic;

public class ProfessorRunner {
    public static void main(String[] args) {
        Professor myProfessor = new Professor();

        System.out.println(myProfessor.professorName);
        System.out.print(myProfessor.salary + ", ");
        System.out.print(myProfessor.phone);
    }
}
