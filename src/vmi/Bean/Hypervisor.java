package vmi.Bean;

public class Hypervisor {
	private int hvid;
	private String ip;

	public void setHvid(int hvid) {
		this.hvid = hvid;
	}

	public int getHvid() {
		return hvid;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}
}
