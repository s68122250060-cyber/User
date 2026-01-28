import java.util.Date;

public class Proposal {
    private String proposalCode;
    private String proposalTitle;
    private String proposalText;
    private Date proposalDate;
    private StatusProposal proposalStatus = StatusProposal.Waiting;

    public Proposal(String proposalCode, String proposalTitle, String proposalText, Date proposalDate) {
        this.proposalCode = proposalCode;
        this.proposalTitle = proposalTitle;
        this.proposalText = proposalText;
        this.proposalDate = proposalDate;
    }
    public void viewProposal() {
        System.out.println("Proposal Code: " + proposalCode);
        System.out.println("Proposal Title: " + proposalTitle);
        System.out.println("Proposal Text: " + proposalText);
        System.out.println("Proposal Date: " + proposalDate);
        System.out.println("Proposal Status: " + proposalStatus);
    }

    public void viewStatus() {
        System.out.println("Proposal Status: " + proposalStatus);
    }

    public void updateProposal() {
    }

    public void deleteProposal() {
    }

    public void archiveProposal() {
    }

    public void viewApplicant() {
    }
}
