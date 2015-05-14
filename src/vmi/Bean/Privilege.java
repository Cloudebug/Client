package vmi.Bean;

public class Privilege {
	private int id;
	private int process_id;
	private boolean type;
	private long privilege;
	
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
	public void setPrivilege(long privilege) {
		this.privilege = privilege;
	}

	public long getPrivilege() {
		return privilege;
	}
}
