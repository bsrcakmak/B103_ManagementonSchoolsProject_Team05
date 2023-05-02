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

    private String lessonName;
    private int creditScore;
    private boolean compulsory;

    public LessonObjectPojo() {

    }

    public LessonObjectPojo( String lessonName, int creditScore, boolean compulsory) {

        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.compulsory = compulsory;
    }




    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    @Override
    public String toString() {
        return "LessonObjectPojo{" +

                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", compulsory=" + compulsory +
                '}';
    }
}

