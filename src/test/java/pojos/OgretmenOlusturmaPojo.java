package pojos;

import java.util.ArrayList;

public class OgretmenOlusturmaPojo {
    public OgretmenOlusturmaPojo() {
    }

    private String name;
    private String surname;
    private String email;
    private String gender;
    private String phoneNumber;
    private String username;
    private String ssn;
    private String password;
    private String birthDay;
    private Boolean isAdvisorTeacher;
    private String birthPlace;
    private ArrayList<Integer> lessonIdList;

    public OgretmenOlusturmaPojo(String name, String surname, String email, String gender, String phoneNumber, String username, String ssn, String password, String birthDay, Boolean isAdvisorTeacher, String birthPlace, ArrayList<Integer> lessonIdList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.ssn = ssn;
        this.password = password;
        this.birthDay = birthDay;
        this.isAdvisorTeacher = isAdvisorTeacher;
        this.birthPlace = birthPlace;
        this.lessonIdList = lessonIdList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Boolean getAdvisorTeacher() {
        return isAdvisorTeacher;
    }

    public void setAdvisorTeacher(Boolean advisorTeacher) {
        isAdvisorTeacher = advisorTeacher;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public ArrayList<Integer> getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(ArrayList<Integer> lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

    @Override
    public String toString() {
        return "OgretmenOlusturmaPojo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", username='" + username + '\'' +
                ", ssn='" + ssn + '\'' +
                ", password='" + password + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", isAdvisorTeacher=" + isAdvisorTeacher +
                ", birthPlace='" + birthPlace + '\'' +
                ", lessonIdList=" + lessonIdList +
                '}';
    }
}
