package claimStatusInquiry;

import java.io.IOException;


import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ClaimInquiry {
	OkHttpClient client = new OkHttpClient();

	MediaType mediaType = MediaType.parse("application/json");
	RequestBody body = RequestBody.create(mediaType, "{\\r\\n    \\\"payerCode\\\": \\\"00001\\\",   \\r\\n    \\\"providerLastName\\\": \\\"last name \\\",\\r\\n    \\\"providerNPI\\\": \\\"1234xxxxxxx\\\",  \\r\\n    \\\"payerClaimNumber\\\": \\\"Axxx23243xxxxxxxx\\\",\\r\\n    \\\"chargeAmount\\\": 50,\\r\\n    \\\"serviceStartDate\\\": \\\"MM/dd/yyyy\\\",\\r\\n    \\\"serviceEndDate\\\": \\\" MM/dd/yyyy \\\",\\r\\n    \\\"subscriber\\\": {\\r\\n        \\\"lastName\\\": \\\"last name XXXXXX\\\",\\r\\n        \\\"dob\\\": \\\"MM/dd/yyyy\\\",        \\r\\n        \\\"memberID\\\": \\\"AxCXXXXXXXXXXXXXXX\\\"       \\r\\n    },\\r\\n    \\\"isPatientDependent\\\": false\\r\\n}");
	private String inquiry;
	private StringToJsonInquiry json = new StringToJsonInquiry();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
			  .url(url)
			  .post(body)
			  .addHeader("content-type", "application/json")
			  .addHeader("authorization", "Bearer " + token)
			  .addHeader("cache-control", "no-cache")
			  .addHeader("postman-token", "59492c7b-cb25-1ab9-d0fc-17d113e92a72")
			  .addHeader("client-user-name", "XXX") //Include Username here
			  .build();
	try(Response response = client.newCall(request).execute()){
		inquiry = response.body().string();
		json.convert(inquiry);	
	}
	
}

public StringToJsonInquiry getJson() {
	return json;

}
}
