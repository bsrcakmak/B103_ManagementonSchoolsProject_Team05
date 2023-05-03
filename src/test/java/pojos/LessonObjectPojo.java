package pojos;

public class LessonObjectPojo {
    /*{
        "object": {
        "lessonId": 433,
                "lessonName": "kumar",
                "creditScore": 55,
                "compulsory": true
    },
        "message": "Lesson Created",
            "httpStatus": "OK"
    }*/

    private boolean compulsory;
    private int creditScore;
    private String lessonName;

    public LessonObjectPojo() {
    }

    public LessonObjectPojo(boolean compulsory, int creditScore, String lessonName) {
        this.compulsory = compulsory;
        this.creditScore = creditScore;
        this.lessonName = lessonName;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "LessonObjectPojo{" +
                "compulsory=" + compulsory +
                ", creditScore=" + creditScore +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }

}

