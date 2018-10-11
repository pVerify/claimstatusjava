package claimStatusInquiry;

public class ServiceLine
{
    private Dates[] dates;

    private String[] otherIndentificationInfo;

    private StatusInfo statusInfo;

    private LineItemInfo lineItemInfo;

    public Dates[] getDates ()
    {
        return dates;
    }

    public void setDates (Dates[] dates)
    {
        this.dates = dates;
    }

    public String[] getOtherIndentificationInfo ()
    {
        return otherIndentificationInfo;
    }

    public void setOtherIndentificationInfo (String[] otherIndentificationInfo)
    {
        this.otherIndentificationInfo = otherIndentificationInfo;
    }

    public StatusInfo getStatusInfo ()
    {
        return statusInfo;
    }

    public void setStatusInfo (StatusInfo statusInfo)
    {
        this.statusInfo = statusInfo;
    }

    public LineItemInfo getLineItemInfo ()
    {
        return lineItemInfo;
    }

    public void setLineItemInfo (LineItemInfo lineItemInfo)
    {
        this.lineItemInfo = lineItemInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dates = "+dates+", otherIndentificationInfo = "+otherIndentificationInfo+", statusInfo = "+statusInfo+", lineItemInfo = "+lineItemInfo+"]";
    }
}