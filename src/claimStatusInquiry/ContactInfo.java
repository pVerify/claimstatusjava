package claimStatusInquiry;

public class ContactInfo
{
    private String name;

    private String number;

    private String qualifier;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
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
        return "ClassPojo [name = "+name+", number = "+number+", qualifier = "+qualifier+"]";
    }
}