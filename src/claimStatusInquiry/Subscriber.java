package claimStatusInquiry;

public class Subscriber
{
    private OtherIndentificationInfo[] otherIndentificationInfo;

    private Info info;

    public OtherIndentificationInfo[] getOtherIndentificationInfo ()
    {
        return otherIndentificationInfo;
    }

    public void setOtherIndentificationInfo (OtherIndentificationInfo[] otherIndentificationInfo)
    {
        this.otherIndentificationInfo = otherIndentificationInfo;
    }

    public Info getInfo ()
    {
        return info;
    }

    public void setInfo (Info info)
    {
        this.info = info;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [otherIndentificationInfo = "+otherIndentificationInfo+", info = "+info+"]";
    }
}
