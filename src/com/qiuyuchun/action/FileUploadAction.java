package com.qiuyuchun.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/file/fileUploadAction")
@ResultPath(value = "/")
public class FileUploadAction extends ActionSupport {
	private String fileFileName; //文件名称
    private String fileContentType; //文件类型  
    private File file; //上传过来的文件
    private static final int BUFFER_SIZE = 16 * 1024;  

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	@Action(value = "Welcome", results = { @Result(name = "success", location = "/jsp/welcome_user.jsp") })
	public String execute() {

		return SUCCESS;

	}
	/*<action name="test"class="testAction">
    <!--配置fileUpload的拦截器-->
    <interceptor-refname="fileUpload">
     <!--配置允许上传的文件类型-->
      <paramname="allowedTypes">application/vnd.ms-excel，image/bmp,image/png,image/gif,image/jpeg
</param>
    <!--配置允许上传的文件大小单位字节-->
      <paramname="maximumSize">5242880</param>
    </interceptor-ref>
    <interceptor-refname="defaultStack"/>
  <resultname="test">/TestJsp.jsp</result>
</action>*/
	@SuppressWarnings("unused")
	@Action( //表示请求的Action及处理方法
			            value="upload",  //表示action的请求名称
			            results={  //表示结果跳转
			            		@Result(name = "success", location = "/jsp/login.jsp"),
			                    @Result(name="login",location="/login.jsp",type="redirect"),
			                    @Result(name="error",location="/error.jsp",type="redirect")
			            },
			            interceptorRefs={
			            		@InterceptorRef(value="fileUpload",
			            	params={"allowTypes",
			            			"image/bmp,image/png,image/gif,image/jpeg,image/pjpeg",
			            			"maximumSize","1024*10*10*10"}),
			            @InterceptorRef("defaultStack")}			            ,
			            exceptionMappings={  //映射映射声明
			                    @ExceptionMapping(exception="java.lang.Exception",result="error")
			            }
			    )
	public String upload() throws IOException {
		File file2 = getFile();
		String fileNamString = getFileFileName();
		String fileType = getFileContentType();
		File file  = new File("D://"+fileNamString);
 		FileUtils.copyFile(getFile(), file);
 		file2.delete();
		/*HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, String[]> map = request.getParameterMap();
		Iterator<Map.Entry<String, String[]>> entries = map.entrySet()
				.iterator();

		while (entries.hasNext()) {
			Map.Entry<String, String[]> entry = entries.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}*/
 		return SUCCESS;

	}
	
	
	public void copy(File src, File dst) {  
        try {  
            InputStream in = null;  
            OutputStream out = null;  
            try {  
                in = new BufferedInputStream(new FileInputStream(src),  
                        BUFFER_SIZE);  
                out = new BufferedOutputStream(new FileOutputStream(dst),  
                        BUFFER_SIZE);  
                byte[] buffer = new byte[BUFFER_SIZE];  
                while (in.read(buffer) > 0) {  
                    out.write(buffer);  
                }  
            } finally {  
                if (null != in) {  
                    in.close();  
                }  
                if (null != out) {  
                    out.close();  
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
