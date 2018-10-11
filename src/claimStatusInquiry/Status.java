package claimStatusInquiry;

public class Status
{
    private String statusCode;

    private String category;

    private String claimStatus;

    private String categoryCode;

    private String type;

    public String getStatusCode ()
    {
        return statusCode;
    }

    public void setStatusCode (String statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getClaimStatus ()
    {
        return claimStatus;
    }

    public void setClaimStatus (String claimStatus)
    {
        this.claimStatus = claimStatus;
    }

    public String getCategoryCode ()
    {
        return categoryCode;
    }

    public void setCategoryCode (String categoryCode)
    {
        this.categoryCode = categoryCode;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [statusCode = "+statusCode+", category = "+category+", claimStatus = "+claimStatus+", categoryCode = "+categoryCode+", type = "+type+"]";
    }
}