package claimStatusInquiry;

public class StatusInfo
{
    private Status[] status;

    private String effectiveDate;

    public Status[] getStatus ()
    {
        return status;
    }

    public void setStatus (Status[] status)
    {
        this.status = status;
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
        return "ClassPojo [status = "+status+", effectiveDate = "+effectiveDate+"]";
    }
}