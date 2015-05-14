package vmi.Bean;

public class ProcessBrief {
	private int vmid;//增加vmid
	private int id;
	private int pid;
	private int ppid;
	private int thread_count;
	private String name;
	private String path;
	private long privilege;//修改为long
	
	public void setVmid(int vmid) {
		this.vmid = vmid;
	}

	public int getVmid() {
		return vmid;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPid() {
		return pid;
	}

	public void setPpid(int ppid) {
		this.ppid = ppid;
	}

	public int getPpid() {
		return ppid;
	}

	public void setThread_count(int thread_count) {
		this.thread_count = thread_count;
	}

	public int getThread_count() {
		return thread_count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPrivilege(long privilege) {
		this.privilege = privilege;
	}

	public long getPrivilege() {
		return privilege;
	}
}
