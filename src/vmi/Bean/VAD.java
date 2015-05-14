package vmi.Bean;

public class VAD {
	private int id;
	private int process_id;
	private long start_address;//修改为long
	private long end_address;//修改为long
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

	public void setStart_address(long start_address) {
		this.start_address = start_address;
	}

	public long getStart_address() {
		return start_address;
	}

	public void setEnd_address(long end_address) {
		this.end_address = end_address;
	}

	public long getEnd_address() {
		return end_address;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public int getAttribute() {
		return attribute;
	}
}
