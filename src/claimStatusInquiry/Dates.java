package claimStatusInquiry;

public class Dates
{
    private String value;

    private String qualifier;

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getQualifier ()
    {
        return qualifier;
    }

    public void setQualifier (String qualifier)
    {
        this.qualifier = qualifier;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+", qualifier = "+qualifier+"]";
    }
}