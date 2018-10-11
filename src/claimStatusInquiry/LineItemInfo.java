package claimStatusInquiry;

public class LineItemInfo
{
    private String unit;

    private String procedureCode;

    private String linePayment;

    private String lineCharge;

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getProcedureCode ()
    {
        return procedureCode;
    }

    public void setProcedureCode (String procedureCode)
    {
        this.procedureCode = procedureCode;
    }

    public String getLinePayment ()
    {
        return linePayment;
    }

    public void setLinePayment (String linePayment)
    {
        this.linePayment = linePayment;
    }

    public String getLineCharge ()
    {
        return lineCharge;
    }

    public void setLineCharge (String lineCharge)
    {
        this.lineCharge = lineCharge;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", procedureCode = "+procedureCode+", linePayment = "+linePayment+", lineCharge = "+lineCharge+"]";
    }
}
