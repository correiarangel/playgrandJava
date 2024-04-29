package br.com.start.studentnewletter;
public class StudentNewsletter {
    private float noteOne;
    private float noteTwo;
    private float noteTree;

    public StudentNewsletter(float noteOne, float noteTwo, float noteTree) {
        this.noteOne = noteOne;
        this.noteTwo = noteTwo;
        this.noteTree = noteTree;
    }

    public void showReportCard() {
        testAverege();
    }

    private float averege() {
        float averege = (noteOne + noteTwo + noteTree) / 3;
        return averege;
    }

    private void testAverege() {
        float _averege = averege();

        if (_averege < 6) {
            System.out.println("Media: " + _averege + " REPROVADO :(");
            return;
        }
        if (_averege == 6) {
            System.out.println("Media: " + _averege + " MIVERVA :(");
            return;
        }
        System.out.println("Media: " + _averege + " APROVADO ;)");
    }

}
