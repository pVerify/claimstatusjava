package claimStatusInquiry;

public class OtherIndentificationInfo
{
    private String id;

    private String description;

    private String qualifier;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
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
        return "ClassPojo [id = "+id+", description = "+description+", qualifier = "+qualifier+"]";
    }
}