package com.practice.general;

public class REDemo {

	public static String maskSSN(String ssn)
	{
		int len = ssn==null?0:ssn.length();
		System.out.println(len);
		if(len==0)
			return "";
		String stars= len >4 ? "****_**_":"";
		String result = stars + ssn.substring(5);
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		maskSSN("123456");
		
//		String ssn = "123456";
//		int len = ssn==null?0:ssn.length();
//				if(len==0)
//					System.out.println("check");
				//String stars=len >0 ? len >1 ? len >2 ? len >3 ? len >4 ? "****_**_":"***_*":"***_":"**":"*":"";
//				String stars= len >4 ? "****_**_":"";
//				String result = stars + ssn.substring(5);
//				System.out.println(result);

	}

}
