package claimStatusInquiry;

public class InquiryResponse
{
    private ServiceLine[] serviceLine;

    private String requestId;

    private String apiResponseMessage;

    private String apiResponseCode;

    private String claimStatus;

    private ClaimStatusInfo claimStatusInfo;

    private String categoryCode;

    private ProviderInfo providerInfo;

    private String claimStatusReasonCode;

    private String category;

    private Payer payer;

    private String claimNo;

    private Subscriber subscriber;

    public ServiceLine[] getServiceLine ()
    {
        return serviceLine;
    }

    public void setServiceLine (ServiceLine[] serviceLine)
    {
        this.serviceLine = serviceLine;
    }

    public String getRequestId ()
    {
        return requestId;
    }

    public void setRequestId (String requestId)
    {
        this.requestId = requestId;
    }

    public String getApiResponseMessage ()
    {
        return apiResponseMessage;
    }

    public void setApiResponseMessage (String apiResponseMessage)
    {
        this.apiResponseMessage = apiResponseMessage;
    }

    public String getApiResponseCode ()
    {
        return apiResponseCode;
    }

    public void setApiResponseCode (String apiResponseCode)
    {
        this.apiResponseCode = apiResponseCode;
    }

    public String getClaimStatus ()
    {
        return claimStatus;
    }

    public void setClaimStatus (String claimStatus)
    {
        this.claimStatus = claimStatus;
    }

    public ClaimStatusInfo getClaimStatusInfo ()
    {
        return claimStatusInfo;
    }

    public void setClaimStatusInfo (ClaimStatusInfo claimStatusInfo)
    {
        this.claimStatusInfo = claimStatusInfo;
    }

    public String getCategoryCode ()
    {
        return categoryCode;
    }

    public void setCategoryCode (String categoryCode)
    {
        this.categoryCode = categoryCode;
    }

    public ProviderInfo getProviderInfo ()
    {
        return providerInfo;
    }

    public void setProviderInfo (ProviderInfo providerInfo)
    {
        this.providerInfo = providerInfo;
    }

    public String getClaimStatusReasonCode ()
    {
        return claimStatusReasonCode;
    }

    public void setClaimStatusReasonCode (String claimStatusReasonCode)
    {
        this.claimStatusReasonCode = claimStatusReasonCode;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public Payer getPayer ()
    {
        return payer;
    }

    public void setPayer (Payer payer)
    {
        this.payer = payer;
    }

    public String getClaimNo ()
    {
        return claimNo;
    }

    public void setClaimNo (String claimNo)
    {
        this.claimNo = claimNo;
    }

    public Subscriber getSubscriber ()
    {
        return subscriber;
    }

    public void setSubscriber (Subscriber subscriber)
    {
        this.subscriber = subscriber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [serviceLine = "+serviceLine+", requestId = "+requestId+", apiResponseMessage = "+apiResponseMessage+", apiResponseCode = "+apiResponseCode+", claimStatus = "+claimStatus+", claimStatusInfo = "+claimStatusInfo+", categoryCode = "+categoryCode+", providerInfo = "+providerInfo+", claimStatusReasonCode = "+claimStatusReasonCode+", category = "+category+", payer = "+payer+", claimNo = "+claimNo+", subscriber = "+subscriber+"]";
    }
}