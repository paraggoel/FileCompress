package com.parag.filecompress.factory;

public class CompressionFormatFactory {
	public static CompressionFormat getCompressionFormat(String type){
		if("zip".equalsIgnoreCase(type)) {
			return new CompressionFormatZIP();
		}else 
			return null;
	}
}
