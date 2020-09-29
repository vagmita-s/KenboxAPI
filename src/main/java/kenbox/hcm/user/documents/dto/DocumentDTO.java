package kenbox.hcm.user.documents.dto;

import java.util.ArrayList;

public class DocumentDTO {
	
	
	public int empId;
  	public String documentType;
  	public String nameOfDocument;
  	public String attachmentOption;
  	public String comments;
  	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getNameOfDocument() {
		return nameOfDocument;
	}
	public void setNameOfDocument(String nameOfDocument) {
		this.nameOfDocument = nameOfDocument;
	}
	public String getAttachmentOption() {
		return attachmentOption;
	}
	public void setAttachmentOption(String attachmentOption) {
		this.attachmentOption = attachmentOption;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	  	
}
