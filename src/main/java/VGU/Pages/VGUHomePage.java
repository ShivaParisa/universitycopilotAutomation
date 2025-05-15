package VGU.Pages;

import Utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class VGUHomePage extends Basepage {
    public VGUHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@class='w-100 mt-3 login-btn btn btn-secondary']")
    WebElement login;
    @FindBy(xpath = "//a[@href='/ERP/dashboard']")
    WebElement dashboard;
    @FindBy(xpath = "//a[@href='/LMS/discussion']")
    WebElement discussion;
    @FindBy(xpath = "//a[@href='/LMS/virtual-class']")
    WebElement virtualClass;
    @FindBy(xpath = "//a[@href='/LMS/course']")
    WebElement course;
    @FindBy(xpath = "//a[@href='/ERP/program']")
    WebElement program;
    @FindBy(xpath = "//a[@href='/ERP/role-management']")
    WebElement roleManagement;
    @FindBy(xpath = "//a[@href='/ERP/examination']")
    WebElement examination;
    @FindBy(xpath = "//a[@href='/ERP/user-management']")
    WebElement userManagement;
    @FindBy(xpath = "//a[@href='/ERP/fees/staff']")
    WebElement feemanagement;
    @FindBy(xpath = "//a[@href='/ERP/report-management']")
    WebElement reportmanagement;
    @FindBy(xpath = "//a[@href='/ERP/staff-request']")
    WebElement requestmanagement;
    @FindBy(xpath = "//a[@href='/ERP/announcement']")
    WebElement announcement;
    @FindBy(xpath = "//a[@href='/ERP/add_ons']")
    WebElement addons;
    @FindBy(xpath = "//a[@class=' tab_item nav-link']")
    WebElement StudentTab;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div/div/div[2]/div/img")
    WebElement Logout;
    @FindBy(xpath = "//button[text()='Create New']")
    WebElement CreateNew;
    @FindBy(name="meetingName")
    WebElement MeetingName;
    @FindBy(xpath ="//img[@src='/assets/calendar.b71941ac.svg']")
    WebElement Calendar;
    @FindBy(xpath = "//span[text()='27']")
    WebElement date;
    @FindBy(name="startTime")
    WebElement StartTime;
    @FindBy(xpath="//input[@class='numInput flatpickr-hour']")
    WebElement StartHour;
    @FindBy(xpath = "//input[@class='numInput flatpickr-minute']")
    WebElement StartMin;
    @FindBy(xpath = "//span[@class='flatpickr-am-pm']")
    WebElement PM;
    @FindBy(name="endTime")
    WebElement EndTime;
    @FindBy(xpath = "(//*[@class='numInput flatpickr-hour'])[2]")
    WebElement EndHour;
    @FindBy(xpath="(//*[@class='numInput flatpickr-minute'])[2]")
    WebElement EndMin;
    @FindBy(xpath = "(//*[@class='flatpickr-am-pm'])[2]")
    WebElement PM2;
    @FindBy(name="meeting_link")
    WebElement MeetingLink;
    @FindBy(name="zoom_user")
    WebElement ZoomName;
    @FindBy(xpath = "//button[text()='Publish']")
    WebElement Publish;
    @FindBy(xpath = "//button[text()='Yes']")
    WebElement PopUpYes;
    @FindBy(name="description")
    WebElement Description;
    @FindBy(xpath = "//button[text()='Create']")
    WebElement Create;
    @FindBy(name="topicName")
    WebElement DiscussionTitle;
    @FindBy(xpath = "//button[text()='Create New Course']")
    WebElement createNewCourse;
    @FindBy(name="title")
    WebElement CourseTitle;
    @FindBy(name="code")
    WebElement CourseCode;
    @FindBy(name="credit")
    WebElement CourseCredit;
    @FindBy(xpath = "//div[@data-placeholder='Enter course description']")
    WebElement CourseDescription;
    @FindBy(xpath = "//input[@accept='image/*' and @type='file']")
    WebElement PreviewImage;
    @FindBy(xpath = "//button[text()='Save']")
    WebElement Save;
    @FindBy(xpath = "//span[text()='Add Chapter']")
    WebElement AddChapter;
    @FindBy(name="title")
    WebElement chapterTitle;
    @FindBy(xpath = "//span[text()='Chapter']")
    WebElement clickChapter;
    @FindBy(xpath = "//span[text()='Add Topic']")
    WebElement AddTopic;
    @FindBy(xpath = "//span[text()='Topic']")
    WebElement clickonTopic;
    @FindBy(xpath = "//input[@accept='video/*,application/pdf' and @type='file']")
    WebElement UploadVideo;
    @FindBy(name="references[0].referenceName")
    WebElement ReferencName;
    @FindBy(name="references[0].referenceLink")
    WebElement ReferenceLink;
    @FindBy(xpath = "//button[text()='Publish']")
    WebElement PublishCourse;
    @FindBy(xpath = "//button[text()='Yes']")
    WebElement YesPopUp;
    @FindBy(xpath = "//button[text()='Create New Program']")
    WebElement CreateNewProgram;
    @FindBy(name="programName")
    WebElement ProgramName;
    @FindBy(name="deptCode")
    WebElement ProgramCode;
    @FindBy(xpath = "//div[@data-placeholder='Enter Program Overview']")
    WebElement ProgramOverview;
    @FindBy(xpath = "//button[text()='Add New Staff']")
    WebElement AddNewStaff;
    @FindBy(name="first_name")
    WebElement StaffName;
    @FindBy(name="mobile_number")
    WebElement MobNum;
    @FindBy(name="email")
    WebElement StaffEmail;
    @FindBy(xpath = "(//img[@src='/assets/calendar.b71941ac.svg'])[2]")
    WebElement StaffCalendar;
    @FindBy(xpath = "(//span[text()='2'])[4]")
    WebElement JoiningDate;
    @FindBy(xpath = "//button[text()='Submit']")
    WebElement Submit;
    @FindBy(xpath = "//button[text()='Add New Student']")
    WebElement AddStudent;
    @FindBy(name="first_name")
    WebElement StudentName;
    @FindBy(name="father_name")
    WebElement FatherName;
    @FindBy(name="mother_name")
    WebElement MotherName;
    @FindBy(name="mobile_number")
    WebElement StudentMobileNumber;
    @FindBy(name="email")
    WebElement StudentEmail;
    @FindBy(name="qualifying_marks")
    WebElement StudentMarks;
    @FindBy(name="govt_identifier_id")
    WebElement GovtId;
    @FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[4]")
    WebElement AdmissionDate;
    @FindBy(xpath = "//button[text()='Create new']")
    WebElement CreateAnnouncement;
    @FindBy(name="title")
    WebElement AnnouncementTitle;
    @FindBy(xpath = "//div[@data-placeholder='Enter announcement description']")
    WebElement AnnouncementDescription;
    @FindBy(xpath = "//img[@src='/assets/calendar.b71941ac.svg']")
    WebElement EventCalendar;
    @FindBy(xpath = "//span[text()='28']")
    WebElement EventDate;
    @FindBy(xpath = "//input[@class='numInput flatpickr-hour']")
    WebElement EventTimeHour;
    @FindBy(xpath = "//input[@class='numInput flatpickr-minute']")
    WebElement EventTimeMinute;
    @FindBy(xpath = "//span[@class='flatpickr-am-pm']")
    WebElement selectAm;
    @FindBy(id="everyone")
    WebElement EveryoneRecipient;
    @FindBy(xpath = "(//button[text()='Bulk Upload'])[2]")
    WebElement BulkUploadButton;
    @FindBy(xpath = "//input[@type='file' and @accept='.xls, .xlsx']")
    WebElement FileUpload;
    @FindBy(id="autoGenerate")
    WebElement AutoGenerateRollNo;
    @FindBy(xpath = "//button[text()='Add']")
    WebElement Add;
    @FindBy(xpath = "//button[text()='Bulk Upload']")
    WebElement StaffBulkUpload;
    @FindBy(xpath = "//button[text()='Create new']")
    WebElement DiscussionCreateNew;
    @FindBy(xpath = "//button[text()='Upload Marks']")
    WebElement UploadMarks;
    @FindBy(id="internal")
    WebElement Internal;
    @FindBy(id="external")
    WebElement External;
    @FindBy(xpath = "//input[@type='file' and @accept='.xls, .xlsx']")
    WebElement UploadGradeReport;
    @FindBy(xpath = "//span[text()='Grade Report']")
    WebElement GradeReport;
    @FindBy(xpath = "//p[text()='Bachelor of Arts']")
    WebElement Program;
    @FindBy(xpath = "//span[text()='Batch']")
    WebElement Batch;
    @FindBy(xpath = "//button[text()='Create New Batch']")
    WebElement BatchCreationButton;
    @FindBy(name="name")
    WebElement BatchName;
    @FindBy(xpath = "//div[@data-placeholder='Enter Batch Overview']")
    WebElement BatchOverview;
    @FindBy(xpath = "//p[text()='24WBA0ENG']")
    WebElement BatchClick;
    @FindBy(xpath = "(//span[text()='Course'])[2]")
    WebElement CourseClick;
    @FindBy(xpath = "//button[text()='Re-assign Course Coordinator' or text()='Assign Course Coordinator']")
    WebElement AssignCourseCoordinator;
    @FindBy(xpath = "//button[text()='Assign']")
    WebElement Assign;
    @FindBy(xpath = "//button[text()='Create New Session']")
    WebElement CreateExamSession;
    @FindBy(name="exam_session_name")
    WebElement ExamSessionName;
    @FindBy(name="session_code")
    WebElement ExamSessionCode;
    @FindBy(xpath = "(//img[@src='/assets/calendar.b71941ac.svg'])[1]")
    WebElement StartDateCalendar;
    @FindBy(xpath = "//span[@class='flatpickr-next-month']")
    WebElement NextMonth;
    @FindBy(xpath = "(//span[text()='1'])[2]")
    WebElement StartDate;
    @FindBy(xpath = "(//img[@src='/assets/calendar.b71941ac.svg'])[2]")
    WebElement EndDateCalendar;
    @FindBy(xpath = "(//span[@class='flatpickr-next-month'])[2]")
    WebElement EndCalendarNext;
    @FindBy(xpath = "(//span[text()='12'])[2]")
    WebElement EndDate;
    @FindBy(xpath = "//div[@aria-label='Remove Faculty of Basic & Applied Sciences']")
    WebElement RemoveBAS;
    @FindBy(xpath = "//div[@aria-label='Remove Faculty of Computer Application']")
    WebElement RemoveCA;
    @FindBy(xpath = "//div[@aria-label='Remove Bachelor of Arts']")
    WebElement RemoveBA;
    @FindBy(name="nature.Monday")
    WebElement Monday;
    @FindBy(name="nature.Wednesday")
    WebElement Wednesday;
    @FindBy(name="nature.Friday")
    WebElement Friday;
    @FindBy(name="exam_duration")
    WebElement ExamDuration;
    @FindBy(name="exam_slots[0].start_time")
    WebElement SlotStartTime1;
    @FindBy(xpath = "//input[@class='numInput flatpickr-hour']")
    WebElement HourSlot1;
    @FindBy(xpath = "//input[@class='numInput flatpickr-minute']")
    WebElement MinSlot1;
    @FindBy(xpath = "//span[@class='flatpickr-am-pm']")
    WebElement SlotVersion;
    @FindBy(xpath = "//button[text()='Add Slot']")
    WebElement AddSlot;
    @FindBy(name="exam_slots[1].start_time")
    WebElement SlotStartTime2;
    @FindBy(xpath = "(//input[@class='numInput flatpickr-hour'])[3]")
    WebElement HourSlot2;
    @FindBy(xpath = "(//input[@class='numInput flatpickr-minute'])[3]")
    WebElement MinSlot2;
    @FindBy(xpath = "(//span[@class='flatpickr-am-pm'])[3]")
    WebElement SlotVersion2;
    @FindBy(xpath = "//button[text()='Next']")
    WebElement NextButton;
    @FindBy(xpath = "(//img[contains(@class,'cursor-pointer ') and @src='/assets/show.150c1f4b.svg'])[13]")
    WebElement ViewIcon;
    @FindBy(xpath = "//button[text()='Upload ID Card Picture']")
    WebElement UploadIdButton;
    @FindBy(id="pic-label")
    WebElement UploadID;
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirmButton;
    @FindBy(xpath = "//button[text()='New Request']")
    WebElement NewRequest;
    @FindBy(name="description")
    WebElement RequestDescription;
    @FindBy(id="pic-label")
    WebElement UploadReceipt;
    @FindBy(xpath = "//button[text()='Request']")
    WebElement RequestButton;
    @FindBy(xpath = "//span[text()='Requests']")
    WebElement RequestModule;
    @FindBy(xpath = "//img[@src='/assets/show.150c1f4b.svg']")
    WebElement ClickRequestView;
    @FindBy(id="comments")
    WebElement RequestComments;
    @FindBy(xpath = "//button[text()='Approve']")
    WebElement Approve;
    @FindBy(id="assign-course-68063162adc528401ade040e")
    WebElement AssignCourse;
    @FindBy(xpath = "//button[text()='Assign']")
    WebElement AssignButton;
    @FindBy(xpath = "//a[text()='Published']")
    WebElement PublishedCourses;
    @FindBy(id="unassign-course-68063162adc528401ade040e")
    WebElement UnassignCourse;
    @FindBy(xpath = "//div[@aria-label='Remove 24SBBAFIN']")
    WebElement RemoveBatch;
    @FindBy(id="unpublish-course-67fe3b9619c7c42bd62350f7")
    WebElement UnpublishCourse;
    @FindBy(xpath = "//button[text()='Upload']")
    WebElement FeeUpload;
    @FindBy(xpath = "//input[@type='file' and @accept='.xls, .xlsx']")
    WebElement UploadFee;
    @FindBy(id="autoGenerate")
    WebElement CheckboxForTransaction;
    @FindBy(xpath = "//a[contains(@href,'/ERP/dashboard')]")
    WebElement StudentDashboard;
    @FindBy(xpath = "//a[contains(@href,'/ERP/chat')]")
    WebElement StudentChat;
    @FindBy(xpath = "//a[contains(@href,'/ERP/announcement')]")
    WebElement StudentAnnouncement;
    @FindBy(xpath = "//a[contains(@href,'/ERP/examination')]")
    WebElement StudentExamination;
    @FindBy(xpath = "//a[contains(@href,'/ERP/student-grade-report')]")
    WebElement StudentGradeReport;
    @FindBy(xpath = "//a[contains(@href,'/ERP/fees')]")
    WebElement StudentFee;
    @FindBy(xpath = "//a[contains(@href,'/ERP/student-request')]")
    WebElement StudentRequest;
    @FindBy(xpath = "//a[@href='/LMS/virtual-class']")
    WebElement StudentClass;
    @FindBy(xpath = "//a[@href='/LMS/course']")
    WebElement StudentCourse;
    @FindBy(xpath = "//a[@href='/LMS/assignment']")
    WebElement StudentAssignment;
    @FindBy(xpath = "//a[@href='/LMS/discussion']")
    WebElement StudentDiscussion;
    @FindBy(xpath = "//a[@href='/LMS/library']")
    WebElement StudentLibrary;
    @FindBy(xpath = "//div[@class='sc-jhfVAM jpZEip']")
    WebElement LMSTab;
    @FindBy(xpath = "//button[@type='button']")
    WebElement AnnouncementViewMoreButton;
    @FindBy(xpath = "//button[text()='Back']")
    WebElement BackButton;
    @FindBy(xpath = "//div[@id='cell-9-undefined']/..//img[@src='/assets/show.150c1f4b.svg']")
    WebElement ViewStudent;
    @FindBy(xpath = "//button[text()='Edit Profile']")
    WebElement EditProfile;
    @FindBy(xpath = "//button[text()='Save Changes']")
    WebElement SaveChanges;















    public void enterEmail() {
        waitForElementToBeVisible(email);
        email.sendKeys("p.pankaj.sharma@vgu.ac.in");
    }

    public void enterPassword() {
        password.sendKeys("vgu@123");
    }

    public void clickLogin() {
        login.click();
    }

    public void clickDashboard() {
        waitForElementToBeVisible(dashboard);
        dashboard.click();
    }

    public void clickDiscussion() {
        waitForElementToBeVisible(discussion);
        discussion.click();
    }

    public void clickVirtualClass() {
        waitForElementToBeVisible(virtualClass);
        virtualClass.click();
    }

    public void clickCourse() {
        waitForElementToBeVisible(course);
        course.click();
    }

    public void clickProgram() {
        waitForElementToBeVisible(program);
        program.click();
    }

    public void clickRoleManagement() {
        roleManagement.click();
    }

    public void clickExamination() {
        waitForElementToBeVisible(examination);
        examination.click();
    }

    public void clickUserManagement() {
        waitForElementToBeVisible(userManagement);
        userManagement.click();
    }

    public void clickFeemanagement() {
        waitForElementToBeVisible(feemanagement);
        feemanagement.click();
    }

    public void clickReportManagement() {
        reportmanagement.click();
    }

    public void clickRequestManagement() {
        wait(3000);
        Actions actions=new Actions(driver);
        actions.moveToElement(requestmanagement).build().perform();
        waitForElementToBeVisible(requestmanagement);
        requestmanagement.click();
    }

    public void clickAnnouncement() {
        waitForElementToBeVisible(announcement);
        announcement.click();
    }

    public void clickAddons() {
        addons.click();
    }

    public void clickStudentTab() {
        StudentTab.click();
    }


    public void clickLogout() {
        waitForElementToBeVisible(Logout);
        Logout.click();
    }

    public void ClickCreate(){
        waitForElementToBeVisible(CreateNew);
        CreateNew.click();
        wait(3000);
    }
    public void clickOnClassSelectDropdown(){
            By ele = By.xpath("//label[@for='course']/..//div[contains(@class,'select__dropdown-indicator')]");
            waitForVisibility(ele);
            driver.findElement(ele).click();
    }
    public void selectCourse(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Basic Mathematics']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickOnFacultyDropdown(){
        By ele = By.xpath("//label[@for='faculty']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectFaculty(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Saurabh Anand']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void enterMeetingName(){
        MeetingName.sendKeys("Basic Mathematics Class 1");
    }
    public void clickCalendar(){
        Calendar.click();
    }
    public void selectDate(){
        date.click();
    }
    public void clickStartTime(){
        waitForElementToBeVisible(StartTime);
        StartTime.click();
    }
    public void selectStartHour(){
        StartHour.sendKeys("2");
    }
    public void selectStartMinute(){
        StartMin.sendKeys("00");
    }
    public void chooseAmPM(){
        PM.click();
        PM.sendKeys(Keys.ENTER);
    }
    public void clickEndTime(){
        EndTime.click();
    }
    public void selectEndHour(){
        EndHour.sendKeys("3");
    }
    public void selectEndMin(){
        EndMin.sendKeys("00");
    }
    public void selectPM(){
        PM2.click();
        PM2.sendKeys(Keys.ENTER);
    }
    public void enterMeetingLink(){
        scrollToView(MeetingLink);
        MeetingLink.sendKeys("https://us04web.zoom.us/j/73372732523?pwd=ctgyvVyaxlW7uNg6dsoS0LbdTkXh5g.1");
    }
    public void enterZoomUserName(){
        By ele = By.xpath("//label[@for='zoom_user']/..//div[contains(@class, 'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickPublishButton(){
        scrollToView(Publish);
        Publish.click();
    }
    public void clickYesInPopUp(){
        waitForElementToBeVisible(PopUpYes);
        PopUpYes.click();
        wait(5000);
    }
    public void clickCreateDiscussion(){
        DiscussionCreateNew.click();
    }
    public void enterDiscussionTitle(){
        DiscussionTitle.sendKeys("Discussion for BBA Students");
    }
    public void clickOnFacultyDrop(){
        By ele = By.xpath("//label[@for='stream']/..//div[contains(@class, 'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectFacultyName(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Faculty of Management Studies']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickOnProgarmDropdown(){
        By ele = By.xpath("//label[@for='program']/..//div[contains(@class, 'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectProgramName(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Bachelor of Business Administration']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickOnCourseDropdown(){
        By ele = By.xpath("//label[@for='course']/..//div[contains(@class, 'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectCourseName(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Basic Mathematics']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickOnCategoryDropdown(){
        By ele = By.xpath("//label[@for='category']/..//div[contains(@class, 'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectCategory(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='FAQ']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickOnBatchDropdown(){
        By ele = By.xpath("//label[@for='batch']/..//div[contains(@class, 'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectBatch(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='24SBBAFIN']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void enterDescription(){
        Description.sendKeys("Hello Students please find the below details");
    }
    public void clickCreate(){
        Create.click();
    }
    public void clickCreateCourse(){
        waitForElementToBeVisible(createNewCourse);
        createNewCourse.click();
    }
    public void enterCourseTitle(){
        CourseTitle.sendKeys("New Course Using Automation1");
    }
    public void enterCourseCode(){
        CourseCode.sendKeys("54345");
    }
    public void facultyDropdown(){
        By ele = By.xpath("//label[@for='department']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectFacultyOption(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Faculty of Management Studies']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void enterCourseCredit(){
        CourseCredit.sendKeys("4");
    }
    public void enterCourseDescription(){
        CourseDescription.sendKeys("This description is given by automation script");
    }
    public void uploadPreviewImage(){
        String previewImage="C:\\Users\\shiva\\Downloads\\download (2).jpg";
        wait(2000);
        PreviewImage.sendKeys(previewImage);

    }
    public void clickSave(){
        scrollToView(Save);
        waitForElementTobeInteractable(Save);
        Save.click();
    }
    public void clickAddChapter(){
        waitForElementToBeVisible(AddChapter);
        AddChapter.click();
    }
    public void clickOnChapter(){
        clickChapter.click();
    }
    public void enterChapterTitle(){
        chapterTitle.sendKeys("Chapter1 by using Automation");
    }
    public void clickAddTopic(){
        waitForElementToBeVisible(AddTopic);
        AddTopic.click();
    }
    public void clickOnTopic(){
        waitForElementToBeVisible(clickonTopic);
        clickonTopic.click();
    }

    public void enterTopicTitle(){
        chapterTitle.sendKeys("Topic 1 by using Automation");
    }
    public void uploadTopicVideo(){
        String uploadVideo="C:\\Users\\shiva\\Downloads\\Copy of BCA 101 Unit 2.mp4";
        UploadVideo.sendKeys(uploadVideo);

    }
    public void enterReferenceName(){
        waitForElementToBeVisible(ReferencName);
        ReferencName.sendKeys("Course Link ");
    }
    public void enterReferenceLink(){
        ReferenceLink.sendKeys("https://www.youtube.com/watch?v=C-eU0zgwZwI&list=PLYxzS__5yYQmf-iF_9MTZmx7TxnmwnKIk");
    }
    public void SaveCourse(){
        waitForElementTobeInteractable(Save);
        scrollToView(Save);
        Save.click();
    }

    public void clickPublishCourse(){
        scrollToView(PublishCourse);
        waitForElementTobeInteractable(PublishCourse);
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        jsClick(PublishCourse);
    }
    public void clickYesPopUp(){
        waitForElementToBeVisible(YesPopUp);
        YesPopUp.click();
        wait(4000);
    }
    public void clickCreateNewProgram(){
        waitForElementToBeVisible(CreateNewProgram);
        CreateNewProgram.click();
    }
    public void enterProgramName(){
        ProgramName.sendKeys("My Program");
    }
    public void semesterDropdown(){
        By ele = By.xpath("//label[@for='semDuration']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectSemester(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='5']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }

    public void facultyDrop(){
        By ele = By.xpath("//label[@for='department']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectFacultyFromDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Faculty of Management Studies']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void programCoordinatorDropdown(){
        By ele = By.xpath("//label[@for='programCoordinator']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectProgramCoordinator(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Arpita Jain']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void programTypeDropdown(){
        By ele = By.xpath("//label[@for='programType']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectProgramType(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='UG']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void enterProgramCode(){
        ProgramCode.sendKeys("UG101");
    }
    public void enterProgramOverview(){
        ProgramOverview.sendKeys("This Progarm is created using Automation Script...");
    }
    public void clickAddNewStaff(){
        AddNewStaff.click();
    }
    public void enterStaffName(){
        StaffName.sendKeys("Dharmendra");

    }
    public void enterMobileNumber(){
        MobNum.sendKeys("9876543210");
    }
    public void enterStaffEmail(){
        StaffEmail.sendKeys("dharmendra123@gmail.com");
    }
    public void clickOnRoleDropdown(){
        WebElement dropdown = driver.findElement( By.xpath("//label[@for='role']/..//div[contains(@class,'select__dropdown-indicator')]"));
        scrollToView(dropdown);
        waitForElementTobeInteractable(dropdown);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        dropdown.click();
    }
    public void selectRole(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Program Coordinator']");
        waitForVisibility(ele);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        driver.findElement(ele).click();
    }
    public void clickOnCalendar(){
        waitForElementTobeInteractable(StaffCalendar);
        StaffCalendar.click();
    }
    public void selectJoiningDate(){
        waitForElementTobeInteractable(JoiningDate);
        JoiningDate.click();
    }
    public void clickSubmitButton(){
        scrollToView(Submit);
        waitForElementTobeInteractable(Submit);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        Submit.click();
        wait(5000);
    }
    public void clickAddNewStudent(){
        waitForElementTobeInteractable(AddStudent);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        AddStudent.click();
    }
    public void enterStudentName(){
        waitForElementTobeInteractable(StudentName);
        StudentName.sendKeys("Phani");
    }
    public void enterFatherName(){
        FatherName.sendKeys("MohanKumar");
    }
    public void enterMotherName(){
        MotherName.sendKeys("Seetha");
    }
    public void enterStudentMobileNum(){
        StudentMobileNumber.sendKeys("9876543210");
    }
    public void clickOnLocal(){
        WebElement dropdown = driver.findElement( By.xpath("//label[@for='locality']/..//div[contains(@class,'select__dropdown-indicator')]"));
        scrollToView(dropdown);
        waitForElementTobeInteractable(dropdown);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        dropdown.click();
    }
    public void selectLocality(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Rural']");
        waitForVisibility(ele);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        driver.findElement(ele).click();
    }
    public void enterStudentEmail(){
        StudentEmail.sendKeys("phani123@gmail.com");
    }
    public void clickOnTypeDropdown(){
        WebElement dropdown = driver.findElement( By.xpath("//label[@for='role']/..//div[contains(@class,'select__dropdown-indicator')]"));
        scrollToView(dropdown);
        waitForElementTobeInteractable(dropdown);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        dropdown.click();
    }
    public void selectStudentType(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Student']");
        waitForVisibility(ele);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        driver.findElement(ele).click();
    }
    public void clickStudentCategoryDropdown(){
        By ele = By.xpath("//label[@for='category']/..//div[contains(@class, 'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectStudentCategory(){
        WebElement StudentCategory = driver.findElement(By.xpath("//div[contains(@class, 'select__option') and text()='General']"));
        waitForElementTobeInteractable(StudentCategory);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        StudentCategory.click();
    }
    public void enterStudentMarks(){
        StudentMarks.sendKeys("76");
    }
    public void clickonFacultyDropdown(){
        WebElement FacultyDropdown =driver.findElement(By.xpath("//label[@for='department']/..//div[contains(@class,'select__dropdown-indicator')]"));
        scrollToView(FacultyDropdown);
        waitForElementTobeInteractable(FacultyDropdown);
        FacultyDropdown.click();
    }
    public void selectOnFacultyOption(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Faculty of Management Studies']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickonProgramDropdown(){
        By ele = By.xpath("//label[@for='program_id']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectProgramOption(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Bachelor of Business Administration']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickBatchDropdown(){
        By ele = By.xpath("//label[@for='batch_id']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectBatchOption(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='24SBBAFIN']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickAdmissionDropdown(){
        By ele = By.xpath("//label[@for='admission_team']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectAdmissionOption(){
        WebElement AdmissionDate=driver.findElement(By.xpath("//div[contains(@class, 'select__option') and text()='CDOE']"));
        waitForElementTobeInteractable(AdmissionDate);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        AdmissionDate.click();
    }
    public void enterStudentAdmissionDate(){
        waitForElementTobeInteractable(AdmissionDate);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        AdmissionDate.sendKeys("01/04/2025");
    }

    public void clickOnGovtIdentifierDropdown(){
        WebElement GovtIdentifier=driver.findElement(By.xpath("//label[@for='govt_identifier']/..//div[contains(@class,'select__dropdown-indicator')]"));
        scrollToView(GovtIdentifier);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        waitForElementTobeInteractable(GovtIdentifier);
        GovtIdentifier.click();
    }
    public void selectGovtIdentifierOption(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Passport']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void enterGovtId(){
        GovtId.sendKeys("1234FR3");
    }
    public void clickCreateNewAnnouncement(){
        CreateAnnouncement.click();
    }
    public void enterAnnouncementTitle(){
        AnnouncementTitle.sendKeys("Announcement Created Using Automation Script");
    }
    public void enterAnnouncementDescription(){
        AnnouncementDescription.sendKeys("Announcement Created using Selenium Automation Script");
    }
    public void clickEventCalendar(){
        EventCalendar.click();
    }
    public void selectEventDate(){
        EventDate.click();
    }
    public void enterEventTimeHour(){
        EventTimeHour.sendKeys("1");
    }
    public void enterEventTimeMin(){
        EventTimeMinute.sendKeys("00");
    }
    public void selectAm(){
        selectAm.click();

    }
    public void clickOnEventTypeDropdown(){
        WebElement EventType=driver.findElement(By.xpath("//label[@for='type']/..//div[contains(@class,'select__dropdown-indicator')]"));
        scrollToView(EventType);
        threadSleep();
        waitForElementTobeInteractable(EventType);
        EventType.click();
    }
    public void selectEventType(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Academic Calendar for Jan 2025 Batch']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }

    public void selectEveryoneRecipient(){
        EveryoneRecipient.click();
        wait(1000);
    }
    public void clickBulkUploadButton(){
        BulkUploadButton.click();
    }
    public void bulkUploadFile(){
        String File="C:\\Users\\shiva\\Downloads\\student_template (18).xlsx";
        FileUpload.sendKeys(File);
    }
    public void clickAutoGenerateRollNo(){
        AutoGenerateRollNo.click();
    }
    public void clickAddButton(){
        scrollToView(Add);
        waitForElementTobeInteractable(Add);
        Add.click();
    }
    public void clickProgramDropdown(){
        By ele = By.xpath("//label[@for='program']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickBatch(){
        By ele = By.xpath("//label[@for='batch']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickStaffBulkButton(){
        StaffBulkUpload.click();
    }
    public void bulkUploadStaff(){
        String staffFile = "C:\\Users\\shiva\\Downloads\\staff_template (10).xlsx";
        FileUpload.sendKeys(staffFile);
    }
    public void clickUploadMarksButton(){
        threadSleep();
        waitForElementTobeInteractable(UploadMarks);
        UploadMarks.click();
    }
    public void clickAcademicYearDropdown(){
        By ele = By.xpath("//label[@for='year']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectAcademicYear(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='2024-25']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickAcademicMonthDropdown(){
        By ele = By.xpath("//label[@for='month']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectAcademicMonth(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='July']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickFacultyDropdown(){
        By ele = By.xpath("//label[@for='department']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectFacultyInDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Faculty of Management Studies']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickExamSessionDropdown(){
        By ele = By.xpath("//label[@for='examSession']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectExamSession(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='March 2025']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectInternalOption(){
        Internal.click();
    }
    public void selectExternalOption(){
        threadSleep();
        waitForElementTobeInteractable(External);
        External.click();
    }
    public void UploadInternalMarks(){
        String InternalMarks = "C:\\Users\\shiva\\Downloads\\Gradation_Template_24SBBAFIN_20250416.xlsx";
        UploadGradeReport.sendKeys(InternalMarks);
    }
    public void UploadExternalMarks(){
        String ExternalMarks = "C:\\Users\\shiva\\Downloads\\Gradation_Template_24SBBAFIN_20250416 (1).xlsx";
        UploadGradeReport.sendKeys(ExternalMarks);
    }
    public void clickOnGradeReport(){
        waitForElementToBeVisible(GradeReport);
        GradeReport.click();
    }
    public void clickOnProgram(){
        waitForElementToBeVisible(Program);
        Program.click();
    }
    public void clickOnBatch(){
        Batch.click();
    }
    public void clickOnCreateBatchButton(){
        BatchCreationButton.click();
    }
    public void clickOnSemesterDropdown(){
        By ele = By.xpath("//label[@for='sem']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectSemesterFromDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='5']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickOnAcademicYearDropdown(){
        By ele = By.xpath("//label[@for='year']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectAcademicYearFromDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='2025-26']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickOnAcademicSessionDropdown(){
        By ele = By.xpath("//label[@for='month']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectAcademicSessionFromDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='July']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }

    public void EnterBatchName(){
        BatchName.sendKeys("25SJULHRM");
    }
    public void clickOnSpecializationDropdown(){
        By ele = By.xpath("//label[@for='specialization']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectSpecialization(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Economics']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void enterDescriptionOfBatch(){
        BatchOverview.sendKeys("This Batch is created using Automation");
    }
    public void clickOnBatchTab(){
        scrollToView(BatchClick);
        waitForElementToBeVisible(BatchClick);
        BatchClick.click();
    }
    public void clickOnCourse(){
        scrollToView(CourseClick);
        waitForElementToBeVisible(CourseClick);
        CourseClick.click();
    }
    public void clickOnAssignCourseCoordinator(){
        scrollToView(AssignCourseCoordinator);
        threadSleep();
        AssignCourseCoordinator.click();
    }
    public void clickOnCourseCoordinatorDropdown(){
        By ele = By.xpath("//div[@class='modal_text px-50 pb-75']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectCourseCoordinator(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='Dharmendra Kumar']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickAssign(){
        scrollToView(Assign);
        Assign.click();
    }
    public void selectFacultyDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and normalize-space()='Faculty of Management Studies']");
        threadSleep();
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectProgramDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and normalize-space()='Bachelor of Business Administration']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectBatchDropdown(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and normalize-space()='24SBBAFIN']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickCreateNewExamSession(){
        CreateExamSession.click();
    }
    public void enterExamsSessionName(){
        ExamSessionName.sendKeys("This Exam created using Automation");
    }
    public void enterExamSessionCode(){
        ExamSessionCode.sendKeys("12345");
    }
    public void clickOnStartDateCalendar(){
        StartDateCalendar.click();
    }
    public void clickNextMonth(){
        for(int i=1;i<9;i++){
            NextMonth.click();
        }
    }
    public void selectStartDate(){
        StartDate.click();
    }
    public void clickEndDateCalendar(){
        waitForElementTobeInteractable(EndDateCalendar);
        EndDateCalendar.click();
    }

    public void clickNextMonthEndDate(){
        waitForElementTobeInteractable(EndCalendarNext);
        for(int j=1;j<9;j++){
            EndCalendarNext.click();
        }
    }
    public void selectEndDate(){
        waitForElementTobeInteractable(EndDate);
        EndDate.click();
    }
    public void removeBASFaculty(){
        scrollToView(RemoveBAS);
        threadSleep();
        RemoveBAS.click();
    }
    public void removeCAFaculty(){
        scrollToView(RemoveCA);
        RemoveCA.click();
    }
    public void removeBAProgram(){
        RemoveBA.click();
    }
    public void selectMonday(){
        Monday.click();
    }
    public void selectWednesday(){
        Wednesday.click();
    }
    public void selectFriday(){
        Friday.click();
    }
    public void enterExamDuration(){
        scrollToView(ExamDuration);
        ExamDuration.sendKeys("45");
    }
    public void clickStartSlotTime(){
        SlotStartTime1.click();
    }
    public void enterHourStartSlot1(){
        HourSlot1.sendKeys("8");
    }
    public void enterMinStartSlot1(){
        MinSlot1.sendKeys("00");
    }
    public void selectAM(){
        SlotVersion.click();
        SlotVersion.sendKeys(Keys.ENTER);
    }
    public void clickAddSlot(){
        scrollToView(AddSlot);
        AddSlot.click();
    }
    public void clickStartTime2(){
        SlotStartTime2.click();
    }
    public void enterHourSlotTime2(){
        scrollToView(HourSlot2);
        waitForElementTobeInteractable(HourSlot2);
        HourSlot2.sendKeys("9");
    }
    public void enterMinSlotTime2(){
        MinSlot2.sendKeys("00");
    }
    public void selectAM2(){
        SlotVersion2.click();
        SlotVersion2.sendKeys(Keys.ENTER);
    }
    public void clickNextButton(){
        scrollToView(NextButton);
        NextButton.click();
    }
    public void clickViewIcon(){
        wait(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(ViewIcon).build().perform();
        waitForElementToBeVisible(ViewIcon);
        ViewIcon.click();
    }
    public void clickUploadIDCardButton(){
        waitForElementTobeInteractable(UploadIdButton);
        UploadIdButton.click();
    }
    public void UploadIDPic(){
        waitForElementTobeInteractable(UploadID);
        String Id="C:\\Users\\shiva\\Downloads\\teacher.jpg";
        UploadID.sendKeys(Id);
    }
    public void clickConfirmButton(){
        waitForElementTobeInteractable(confirmButton);
        confirmButton.click();
    }
    public void studentEmailID(){
        waitForElementToBeVisible(email);
        email.sendKeys("phani123@gmail.com");
    }
    public void studentPassword(){
        password.sendKeys("Vgu@1234");
    }
    public void clickNewRequestButton(){
        NewRequest.click();
    }
    public void clickOnRequestTypeDropdown(){
        By ele = By.xpath("//label[@for='request_type']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectRequestType(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='E-Identity Card Request']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void clickSemesterDropdown(){
        By ele = By.xpath("//label[@for='sem']/..//div[contains(@class,'select__dropdown-indicator')]");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void selectSemesterOption(){
        By ele = By.xpath("//div[contains(@class, 'select__option') and text()='2']");
        waitForVisibility(ele);
        driver.findElement(ele).click();
    }
    public void enterRequestDescription(){
        RequestDescription.sendKeys("E ID Card Requested using Automation Script");
    }
    public void AttachPicture(){
        String Image="C:\\Users\\shiva\\Downloads\\teacher.jpg";
        UploadReceipt.sendKeys(Image);
    }
    public void clickRequestButton(){
        RequestButton.click();
    }
    public void clickOnRequestModule(){
        waitForElementToBeVisible(RequestModule);
        RequestModule.click();
    }
    public void clickViewRequest(){
        waitForElementToBeVisible(ClickRequestView);
        ClickRequestView.click();
    }
    public void enterApproverComments(){
        waitForElementToBeVisible(RequestComments);
        RequestComments.sendKeys("Approved using Automation Script");
    }
    public void clickApproveButton(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Approve).build().perform();
        Approve.click();
    }
    public void clickAssignCourse(){
        wait(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(AssignCourse).build().perform();
        waitForElementToBeVisible(AssignCourse);
        AssignCourse.click();
    }
    public void clickAssignButton(){
        waitForElementToBeVisible(AssignButton);
        AssignButton.click();
    }
    public void clickPublishedCourses(){
        waitForElementToBeVisible(PublishedCourses);
        PublishedCourses.click();
    }
    public void clickUnassignCourse(){
        wait(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(UnassignCourse).build().perform();
        UnassignCourse.click();
    }
    public void clickRemoveBatch(){
        waitForElementToBeVisible(RemoveBatch);
        RemoveBatch.click();
    }
    public void clickUnPublishCourse(){
        wait(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(UnpublishCourse);
        UnpublishCourse.click();
    }
    public void clickFeeUploadButton(){
        waitForElementToBeVisible(FeeUpload);
        FeeUpload.click();
    }
    public void clickUploadButton(){
        String FeeFile="C:\\Users\\shiva\\Downloads\\vgu fees upload.xlsx";
        UploadFee.sendKeys(FeeFile);
    }
    public void clickCheckbox(){
        CheckboxForTransaction.click();
    }
    public void UploadTransactionDetails(){
        String TransactionFile="C:\\Users\\shiva\\Downloads\\vgu transaction upload.xlsx";
        UploadFee.sendKeys(TransactionFile);
    }
    public void clickOnDashboard(){
        waitForElementToBeVisible(StudentDashboard);
        StudentDashboard.click();
    }
    public void clickOnChat(){
        waitForElementToBeVisible(StudentChat);
        StudentChat.click();
    }
    public void clickOnAnnouncements(){
        waitForElementToBeVisible(StudentAnnouncement);
        StudentAnnouncement.click();
    }
    public void clickOnExamination(){
        waitForElementToBeVisible(StudentExamination);
        StudentExamination.click();
    }
    public void clickOnStudentGradeReport(){
        waitForElementToBeVisible(StudentGradeReport);
        StudentGradeReport.click();
    }
    public void clickOnFees(){
        waitForElementToBeVisible(StudentFee);
        StudentFee.click();
    }
    public void clickOnRequests(){
        waitForElementToBeVisible(StudentRequest);
        StudentRequest.click();
    }
    public void clickOnLMSTab(){
        waitForElementToBeVisible(LMSTab);
        LMSTab.click();
    }
    public void clickOnVirtualClass(){
        waitForElementToBeVisible(StudentClass);
        StudentClass.click();
    }
    public void clickOnStudentCourse(){
        waitForElementToBeVisible(StudentCourse);
        StudentCourse.click();
    }
    public void clickOnAssignment(){
        waitForElementToBeVisible(StudentAssignment);
        StudentAssignment.click();
    }
    public void clickOnDiscussion(){
        waitForElementToBeVisible(StudentDiscussion);
        StudentDiscussion.click();
    }
    public void clickOnLibrary(){
        waitForElementToBeVisible(StudentLibrary);
        StudentLibrary.click();
    }
    public void clickAnnouncementViewMoreButton(){
        waitForElementToBeVisible(AnnouncementViewMoreButton);
        AnnouncementViewMoreButton.click();
    }
    public void clickBackButton(){
        wait(5000);
        BackButton.click();
        wait(2000);
    }
    public void ViewStudent(){
        wait(5000);
        Actions actions=new Actions(driver);
        actions.moveToElement(ViewStudent).build().perform();
        ViewStudent.click();
    }
    public void clickEditProfile(){
        waitForElementToBeVisible(EditProfile);
        EditProfile.click();
    }
    public void updateFirstName(){
        Actions actions=new Actions(driver);
        actions.moveToElement(StudentName).build().perform();
        waitForElementToBeVisible(StudentName);
        StudentName.clear();
        StudentName.sendKeys("Mohit");
    }
    public void updateFatherName(){
        Actions actions=new Actions(driver);
        actions.moveToElement(FatherName).build().perform();
        FatherName.clear();
        FatherName.sendKeys("RamaRao");
    }
    public void updateMotherName(){
        Actions actions=new Actions(driver);
        actions.moveToElement(MotherName).build().perform();
        MotherName.clear();
        MotherName.sendKeys("Kumari");
    }
    public void clickSaveChanges(){
        Actions actions=new Actions(driver);
        actions.moveToElement(SaveChanges).build().perform();
        SaveChanges.click();
    }



    }









































