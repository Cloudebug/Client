package vmi.Bean;

public class DLL {
	private int id;
	private int process_id;
	private int size;
	private long address;//修改为long
	private String name;
	private String path;

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

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setAddress(long address) {
		this.address = address;
	}

	public long getAddress() {
		return address;
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
}
