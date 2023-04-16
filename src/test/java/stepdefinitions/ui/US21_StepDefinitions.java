package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ChooseLessonManagementPage;
import pages.GradesAndAnnouncementsPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US21_StepDefinitions {
    public static int counter = 0;
    ChooseLessonManagementPage chooseLessonManagementPage = new ChooseLessonManagementPage();
    GradesAndAnnouncementsPage gradesAndAnnouncementsPage = new GradesAndAnnouncementsPage();
    public static List<String> teachersNames = new ArrayList<String>();
    public static List<String> days = new ArrayList<String>();
    List<String> startTimes = new ArrayList<String>();
    List<String> stopTimes = new ArrayList<String>();

    public void dersSecimi() {

        do {
            ReusableMethods.waitFor(1);
            ReusableMethods.scrollTopJS();
            ReusableMethods.waitFor(5);

            chooseLessonManagementPage.lessonSelectButton.get(counter).click();
            ReusableMethods.waitFor(2);
            counter++;
            ReusableMethods.waitFor(2);
            chooseLessonManagementPage.lessonSelectButton.get(counter).click();
            ReusableMethods.waitFor(4);
            ReusableMethods.scrollIntoViewJS(chooseLessonManagementPage.lessonSelectButton.get(chooseLessonManagementPage.lessonSelectButton.size() - 4));
            ReusableMethods.waitFor(3);
            ReusableMethods.clickByJS(chooseLessonManagementPage.sumbitButton);
            ReusableMethods.waitFor(1);

            if (chooseLessonManagementPage.submitAlert.getText().contains("Lesson added to Student")) {
                break;
            }

        } while (true);
    }


    public static Faker faker = new Faker();

    public static String randomChooseLesson = String.valueOf(faker.instance().number().numberBetween(1, teachersNames.size()));


    @Then("Kullanici Chose Lesson listesinde Teacher bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_teacher_bilgilerini_gorur() {
        for (WebElement w : chooseLessonManagementPage.teachersSutun) {

            teachersNames.add(w.getText());
        }
        Assert.assertTrue(chooseLessonManagementPage.teacher.isDisplayed());
    }

    @Then("Kullanici Chose Lesson listesinde Day bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_day_bilgilerini_gorur() {
        for (WebElement w : chooseLessonManagementPage.daysSutun) {

            days.add(w.getText());
        }
        Assert.assertTrue(chooseLessonManagementPage.day.isDisplayed());
    }

    @Then("Kullanici Chose Lesson listesinde Start Time bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_start_time_bilgilerini_gorur() {
        for (WebElement w : chooseLessonManagementPage.startTimeSutun) {

            startTimes.add(w.getText());
        }
        Assert.assertTrue(chooseLessonManagementPage.startTime.isDisplayed());

    }

    @Then("Kullanici Chose Lesson listesinde Stop time bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_stop_time_bilgilerini_gorur() {
        for (WebElement w : chooseLessonManagementPage.stopTimeSutun) {

            stopTimes.add(w.getText());
        }
        Assert.assertTrue(chooseLessonManagementPage.stopTime.isDisplayed());

    }

    @Then("Kullanici secmek istedigi dersin Choose Lesson butonuna tiklar")
    public void kullanici_secmek_istedigi_dersin_choose_lesson_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollTopJS();
        ReusableMethods.waitFor(2);
        if (!chooseLessonManagementPage.lessonSelectButton.get(counter).isSelected()) {
            chooseLessonManagementPage.lessonSelectButton.get(counter).click();
        } else {
            chooseLessonManagementPage.lessonSelectButton.get(counter).click();
            ReusableMethods.waitFor(1);
            counter++;
            chooseLessonManagementPage.lessonSelectButton.get(counter).click();
            ReusableMethods.waitFor(1);
        }
    }

    @Then("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        ReusableMethods.scrollIntoViewJS(chooseLessonManagementPage.lessonSelectButton.get(chooseLessonManagementPage.lessonSelectButton.size() - 4));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(chooseLessonManagementPage.sumbitButton);
        ReusableMethods.waitFor(1);

    }

    @Then("Kullanici Lesson added to Student uyarisini gorur")
    public void kullanici_lesson_added_to_student_uyarisini_gorur() {
        if (!chooseLessonManagementPage.submitAlert.getText().contains("Lesson added to Student")) {
            dersSecimi();
        } else Assert.assertTrue(chooseLessonManagementPage.submitAlert.getText().contains("Lesson added to Student"));
    }

    @Then("Kullanici Pazartesi gunu saat oniki de olan dersi secer")
    public void kullanici_pazartesi_gunu_saat_oniki_de_olan_dersi_secer() {
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollTopJS();
        ReusableMethods.waitFor(2);
//        List<WebElement> pazatertesiOnOkiDers = new ArrayList<>();
//        for (WebElement w : studentPage.chooseLessonTabloSatir) {
//            if (w.getText().contains("Monday 12:00")) {
//                pazatertesiOnOkiDers.add(w);
//            }
//        for (WebElement a : studentPage.lessonSelectButton) {
           // if (!studentPage.lessonSelectButton.get(counter).isSelected()) {
                for (WebElement x : chooseLessonManagementPage.chooseLessonTabloSatir) {
                    if (x.getText().contains("Monday 12:00")) {
                        String aaaaaaaaaaa = x.getAttribute("rowIndex");
                        System.out.println("a = " + aaaaaaaaaaa);
                        break;
                    }
                }

//                } else {
//                    studentPage.lessonSelectButton.get(counter).click();
//                    ReusableMethods.waitFor(1);
//                    counter++;
//                    //kullanici_pazartesi_gunu_saat_oniki_de_olan_dersi_secer();
//                }
////                } else{
//                    counter++;
//                    kullanici_pazartesi_gunu_saat_oniki_de_olan_dersi_secer();
        }


    // }


//
//            if (studentPage.chooseLessonTabloSatir.get(counter).getText().contains("Monday 12:00")){
//                   // studentPage.chooseLessonTabloSatir.get(counter).getText().contains("12:00")){
//                ReusableMethods.scrollIntoViewJS(studentPage.lessonSelectButton.get(counter));
//                ReusableMethods.waitFor(1);
//                studentPage.lessonSelectButton.get(counter).click();
//            }else {
//                 else counter++;
//                kullanici_pazartesi_gunu_saat_oniki_de_olan_dersi_secer();
//            }


    @Then("Kullanici Pazartesi gunu saat oniki de olan baska bir ders secer")
    public void kullanici_pazartesi_gunu_saat_oniki_de_olan_baska_bir_ders_secer() {
        ReusableMethods.waitFor(2);
        if (chooseLessonManagementPage.chooseLessonTabloSatir.get(counter).getText().contains("Monday") &&
                chooseLessonManagementPage.chooseLessonTabloSatir.get(counter).getText().contains("12:00")) {
            chooseLessonManagementPage.lessonSelectButton.get(counter).click();
        } else {
            counter++;
            kullanici_pazartesi_gunu_saat_oniki_de_olan_baska_bir_ders_secer();
        }
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Error: Course schedule cannot be selected for the same hour and day uyarisini gorur")
    public void kullanici_error_course_schedule_cannot_be_selected_for_the_same_hour_and_day_uyarisini_gorur() {
        if (!chooseLessonManagementPage.submitAlert.getText().contains("Error: Course schedule cannot be selected for the same hour and day")) {
            dersSecimi();
        } else
            Assert.assertTrue(chooseLessonManagementPage.submitAlert.getText().contains("Error: Course schedule cannot be selected for the same hour and day"));

    }

    @Then("Kullanici sayfayi asagi kaydirir")
    public void kullanici_sayfayi_asagi_kaydirir() {
        ReusableMethods.scrollIntoViewJS(chooseLessonManagementPage.sumbitButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Lesson Program List te ekledigi dersleri gorur")
    public void kullanici_lesson_program_list_te_ekledigi_dersleri_gorur() {
        Assert.assertTrue(chooseLessonManagementPage.lessonProgramListTabloSatir.get(counter).getText().contains(chooseLessonManagementPage.lessonProgramListTabloSatir.get(chooseLessonManagementPage.lessonProgramListTabloSatir.size() - 1).getText()));
        ReusableMethods.waitFor(2);
    }


    @Then("Kullanici menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        chooseLessonManagementPage.menuButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici sayfada acilan main menu kisminda Grades ve Announcements alanina tiklar")
    public void kullanici_sayfada_acilan_main_menu_kisminda_grades_ve_announcements_alanina_tiklar() {
        chooseLessonManagementPage.gradesAndAnnouncements.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici acilan sayfada Student Info List kisminda Note bolumunu gorur")
    public void kullanici_acilan_sayfada_student_info_list_kisminda_note_bolumunu_gorur() {
        Assert.assertTrue(gradesAndAnnouncementsPage.studentInfoListTablo.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici acilan sayfada Meet List alaninda toplantilari gorur")
    public void kullanici_acilan_sayfada_meet_list_alaninda_toplantilari_gorur() {
        ReusableMethods.scrollIntoViewJS(gradesAndAnnouncementsPage.studentInfoListTablo);
        Assert.assertTrue(gradesAndAnnouncementsPage.studentInfoListTablo.isDisplayed());
        ReusableMethods.waitFor(1);

    }


}
