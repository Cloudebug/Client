package vmi.Bean;

public class ThreadDetail {
	private int id;
	private int process_id;
	private int thread_id;
	private long address;//修改为long

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

	public void setThread_id(int thread_id) {
		this.thread_id = thread_id;
	}

	public int getThread_id() {
		return thread_id;
	}

	public void setAddress(long address) {
		this.address = address;
	}

	public long getAddress() {
		return address;
	}

}
