package com.sample.app.api.util;

public class FileUtil {
	
	/**
	 * 확장자를 포함한 파일명에서, 확장자를 뺀 파일명만 반환
	 * @param fileOrgName : 파일 원본 이름
	 * @return : 확장자를 제외한 파일명 (abc.txt -> abc)
	 */
	public static String getBaseFileName(String fileOrgName) {
		String result = "";
		
		if(fileOrgName!=null) {
			int pos = fileOrgName .lastIndexOf(".");
			if(pos!=-1) {
				result = fileOrgName.substring(0, pos);
			}
		}
		
		return result;
	}
	
	/**
	 * 파일 원본이름에서 확장자만 반환
	 * @param fileOrgName : 파일 원본명
	 * @return : 파일명을 제외한 확장자만 반환 (abc.txt -> txt)
	 */
	public static String getFileExt(String fileOrgName) {
		String result = "";
		
		if(fileOrgName!=null) {
			int pos = fileOrgName .lastIndexOf(".");
			if(pos!=-1) {
				result = fileOrgName.substring(pos + 1);
			}
		}
		
		return result;
	}
	
}
