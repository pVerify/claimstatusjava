package claimStatusInquiry;

import com.google.gson.Gson;


public class StringToJsonInquiry {
private InquiryResponse inquiryResponse;
	
	public void convert(String jString) {
		Gson gPayer = new Gson();
		
		
		 inquiryResponse = gPayer.fromJson(jString, InquiryResponse.class);
		

		
	}
	
	public InquiryResponse getInquiryResponse() {
		return inquiryResponse;
	}
}
