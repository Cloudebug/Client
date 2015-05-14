package vmi.Bean;

public class Sid {
	private int id;
	private int process_id;
	private boolean type;
	private String sid;
	private int attribute;//修改为int

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setProcess_id(int process_id) {
		this.process_id = process_id;
	}

	public int getProcess_id() {
		return process_id;
	}
	public void setType(boolean type) {
		this.type = type;
	}

	public boolean getType() {
		return type;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSid() {
		return sid;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public int getAttribute() {
		return attribute;
	}
}
