package zw.co.afrosoft.subject;

public class Subject {
    private String subjectName;
    private int markObtained;

    public Subject(String subjectName, int markObtained) {
        this.subjectName = subjectName;
        this.markObtained = markObtained;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMarkObtained() {
        return markObtained;
    }

    public void setMarkObtained(int markObtained) {
        this.markObtained = markObtained;
    }
}
