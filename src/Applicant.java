public class Applicant {

    private int applicantId;
    private String applicantName;
    private String applicantJob;
    private String applicantAddress;
    private Gender applicantGender;
    private String applicantTel;

    public Applicant(int applicantId, String applicantName, String applicantJob,
                     String applicantAddress, Gender applicantGender, String applicantTel) {
        this.applicantId = applicantId;
        this.applicantName = applicantName;
        this.applicantJob = applicantJob;
        this.applicantAddress = applicantAddress;
        this.applicantGender = applicantGender;
        this.applicantTel = applicantTel;
    }

    // ===== Getter =====
    public int getApplicantId() {
        return applicantId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getApplicantJob() {
        return applicantJob;
    }

    public String getApplicantAddress() {
        return applicantAddress;
    }

    public Gender getApplicantGender() {
        return applicantGender;
    }

    public String getApplicantTel() {
        return applicantTel;
    }

    // ===== Methods ตาม Diagram =====
    public void updateApplicant() {
        System.out.println("Update applicant: " + applicantName);
    }

    public void deleteApplicant() {
        System.out.println("Delete applicant ID: " + applicantId);
    }
}
