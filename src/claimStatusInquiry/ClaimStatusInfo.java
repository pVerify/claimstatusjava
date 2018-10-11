package claimStatusInquiry;

public class ClaimStatusInfo
{
    private String paymentAmount;

    private String remittanceDate;

    private String adjudicationFinalizedDate;

    private Status[] status;

    private String chrageAmount;

    private String checkNumber;

    private String effectiveDate;

    public String getPaymentAmount ()
    {
        return paymentAmount;
    }

    public void setPaymentAmount (String paymentAmount)
    {
        this.paymentAmount = paymentAmount;
    }

    public String getRemittanceDate ()
    {
        return remittanceDate;
    }

    public void setRemittanceDate (String remittanceDate)
    {
        this.remittanceDate = remittanceDate;
    }

    public String getAdjudicationFinalizedDate ()
    {
        return adjudicationFinalizedDate;
    }

    public void setAdjudicationFinalizedDate (String adjudicationFinalizedDate)
    {
        this.adjudicationFinalizedDate = adjudicationFinalizedDate;
    }

    public Status[] getStatus ()
    {
        return status;
    }

    public void setStatus (Status[] status)
    {
        this.status = status;
    }

    public String getChrageAmount ()
    {
        return chrageAmount;
    }

    public void setChrageAmount (String chrageAmount)
    {
        this.chrageAmount = chrageAmount;
    }

    public String getCheckNumber ()
    {
        return checkNumber;
    }

    public void setCheckNumber (String checkNumber)
    {
        this.checkNumber = checkNumber;
    }

    public String getEffectiveDate ()
    {
        return effectiveDate;
    }

    public void setEffectiveDate (String effectiveDate)
    {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [paymentAmount = "+paymentAmount+", remittanceDate = "+remittanceDate+", adjudicationFinalizedDate = "+adjudicationFinalizedDate+", status = "+status+", chrageAmount = "+chrageAmount+", checkNumber = "+checkNumber+", effectiveDate = "+effectiveDate+"]";
    }
}