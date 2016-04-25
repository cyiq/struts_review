package cyiq.action;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File uploadFile;
	private String uploadFileContentType;
	private String uploadFileFileName;

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String saveFile() throws Exception{
		ServletContext context = ServletActionContext.getServletContext();
		String path = context.getRealPath("fileupload");
		File file = new File(path,uploadFileFileName);
		FileUtils.copyFile(uploadFile, file);
		uploadFile.delete();
		return "success";
	}
}
