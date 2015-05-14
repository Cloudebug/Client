package vmi.Bean;

public class VM {
	private int hvid;
	private int vmid;
	private String uuid;
	private String ostype;

	public void setHvid(int hvid) {
		this.hvid = hvid;
	}

	public int getHvid() {
		return hvid;
	}
	public void setVmid(int vmid) {
		this.vmid = vmid;
	}

	public int getVmid() {
		return vmid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return uuid;
	}

	public String getOstype() {
		return ostype;
	}

	public void setOstype(String ostype) {
		this.ostype = ostype;
	}
}
