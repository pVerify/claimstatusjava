package claimStatusInquiry;

public class Payer
{
    private ContactInfo contactInfo;

    private Info info;

    public ContactInfo getContactInfo ()
    {
        return contactInfo;
    }

    public void setContactInfo (ContactInfo contactInfo)
    {
        this.contactInfo = contactInfo;
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
        return "ClassPojo [contactInfo = "+contactInfo+", info = "+info+"]";
    }
}
