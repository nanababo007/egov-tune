package com.sample.app.api.vo;

import org.springframework.web.multipart.MultipartFile;

import com.sample.app.api.util.FileUtil;

public class SampleFileVO {
	private String fileSeq;
	private String sampleId;
	private String orgFileName;
	private String saveFileName;
	private String fileKind;
	private String fileSize;
	private String fileOrd;
	private String fileExt;
	private String fileDesc;
	
	public SampleFileVO() {}
	
	public SampleFileVO(MultipartFile mfile) {
		setMultipartFile(mfile);
	}
	
	public void setMultipartFile(MultipartFile mfile) {
		if(mfile!=null && mfile.getOriginalFilename()!=null) {
			this.orgFileName = mfile.getOriginalFilename();
			this.fileSize = String.valueOf(mfile.getSize());
			this.fileExt = FileUtil.getFileExt(this.orgFileName);
		}
	}
	
	public String getFileSeq() {
		return fileSeq;
	}
	public void setFileSeq(String fileSeq) {
		this.fileSeq = fileSeq;
	}
	public String getSampleId() {
		return sampleId;
	}
	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}
	public String getOrgFileName() {
		return orgFileName;
	}
	public void setOrgFileName(String orgFileName) {
		this.orgFileName = orgFileName;
	}
	public String getSaveFileName() {
		return saveFileName;
	}
	public void setSaveFileName(String saveFileName) {
		this.saveFileName = saveFileName;
	}
	public String getFileKind() {
		return fileKind;
	}
	public void setFileKind(String fileKind) {
		this.fileKind = fileKind;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileOrd() {
		return fileOrd;
	}
	public void setFileOrd(String fileOrd) {
		this.fileOrd = fileOrd;
	}
	
	public String getFileExt() {
		return fileExt;
	}
	
	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public String getFileDesc() {
		return fileDesc;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}

	@Override
	public String toString() {
		return "SampleFileVO [fileSeq=" + fileSeq + ", sampleId=" + sampleId + ", orgFileName=" + orgFileName
				+ ", saveFileName=" + saveFileName + ", fileKind=" + fileKind + ", fileSize=" + fileSize + ", fileOrd="
				+ fileOrd + ", fileExt=" + fileExt + ", fileDesc=" + fileDesc + "]";
	}
	
}
