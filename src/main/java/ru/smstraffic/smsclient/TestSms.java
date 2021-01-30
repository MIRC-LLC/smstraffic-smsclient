///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Sample use of java for sending SMS via SMS Traffic
//
// (c) SMS Traffic, 2008
// www.smstraffic.ru, info@smstraffic.ru, (495)228-3649, (495)642-9569
//
///////////////////////////////////////////////////////////////////////////////////////////////////

package ru.smstraffic.smsclient;

import java.io.UnsupportedEncodingException;

public class TestSms
{
	public static void main(String[] args)
	{
		try{
		    SmsTrafficClient client = new SmsTrafficClient("mostpay", "EIxwPZMJ");

			String sms_id = client.send("79289160325", "Привет!!!", "mostpay", 1);
			System.out.println("sms_id="+sms_id);
		}
		catch (SmsException | UnsupportedEncodingException e){
			System.out.println("SmsException: "+e.getMessage());
		}
	}
}
