package com.ambow.st.user.b;

import java.util.List;

/**
 * Created by zhao.wu on 2016/12/8.
 */
public class Files{
    private long length;
    private String md5sum;
    private List<String> path;

    public Files() {
    }

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getMd5sum() {
		return md5sum;
	}

	public void setMd5sum(String md5sum) {
		this.md5sum = md5sum;
	}

	public List<String> getPath() {
		return path;
	}

	public void setPath(List<String> path) {
		this.path = path;
	}
     
}