package br.com.start.main;
import br.com.start.myclassstart.MyClassStart;
import br.com.start.studentnewletter.StudentNewsletter;

public class Main {
    public static void main(String[] args) {

        MyClassStart start = new MyClassStart("Marcos", "Rangel");
        start.showNameComplit();

        System.out.println("-----------------------------");

        StudentNewsletter newsletter = new StudentNewsletter(2, 10, 7);
        newsletter.showReportCard();
    }
}
// br.com.rangeldev.my_coins