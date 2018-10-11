package claimStatusInquiry;

import java.io.IOException;



public class InquiryDriver {
public static final String TOKEN = ""; //Do not include Bearer here, simply paste the token string
	
	public static final String URL = "https://api.pverify.com/API/ClaimStatusInquiry"; 
	
	public static void main(String[] args) throws IOException{
	ClaimInquiry inquiry = new ClaimInquiry();
	inquiry.setJson(URL, TOKEN);
	InquiryResponse response = inquiry.getJson().getInquiryResponse();
	

	System.out.println("API Response Code: " + response.getApiResponseCode());
	System.out.println("Claim Status: " + response.getClaimStatus());
	System.out.println("Payer: " + response.getPayer());
	System.out.println("API Response Message: " + response.getApiResponseMessage());
	



	
	}
}
