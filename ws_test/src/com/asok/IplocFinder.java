package com.asok;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IplocFinder {

	public static void main(String[] args) {
		if(args.length==1){
		 String ip=args[0];
		 GeoIPService service=new GeoIPService();
		GeoIPServiceSoap stub= service.getGeoIPServiceSoap();
		GeoIP geoip= stub.getGeoIP(ip);
		System.out.println(geoip.getCountryName());
		
		}
	}

}
