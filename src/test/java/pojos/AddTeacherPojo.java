package pojos;

public class AddTeacherPojo {


    public AddTeacherPojo() {
    }

    private AddTeacherObjectPojo object;
    private String message;
    private String httpStatus;

    public AddTeacherPojo(AddTeacherObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public AddTeacherObjectPojo getObject() {
        return object;
    }

    public void setObject(AddTeacherObjectPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "AddTeacherPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
