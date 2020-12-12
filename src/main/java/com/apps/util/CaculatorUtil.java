package com.apps.util;

import com.apps.domain.ResponseDomain;

public class CaculatorUtil {
	
	
	
	public static ResponseDomain getObjectResponseDomain(boolean status,String errorCode,String message,Object data) {
		ResponseDomain responseDomain = new ResponseDomain();
		if(status) {
			responseDomain.setStatus("ERROR");
			responseDomain.setErrorCode(errorCode);
			responseDomain.setMessage("Error: "+message);
			responseDomain.setData(data);
		}else {
			responseDomain.setStatus("INFO");
			responseDomain.setErrorCode(errorCode);
			responseDomain.setMessage("Succes process");
			responseDomain.setData(data);
		}
		return responseDomain;
		
	};

}
