package vmi.Bean;

public class Module {
	private int id;
	private int vm_id;
	private int size;
	private int load_count;
	private String name;
	private String path;
	private int attribute;//修改为int
	private long address;//修改为long
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setVm_id(int vm_id) {
		this.vm_id = vm_id;
	}

	public int getVm_id() {
		return vm_id;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setLoad_count(int load_count) {
		this.load_count = load_count;
	}

	public int getLoad_count() {
		return load_count;
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

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public int getAttribute() {
		return attribute;
	}
	public void setAddress(long address) {
		this.address = address;
	}

	public long getAddress() {
		return address;
	}
}
