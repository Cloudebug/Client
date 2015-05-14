package comm.Bean;
import comm.Bean.RequestArgs;
public class Request {
	private long cmd;
	private RequestArgs args;

	public long getCmd() {
		return cmd;
	}

	public void setCmd(long cmd) {
		this.cmd = cmd;
	}

	public RequestArgs getArgs() {
		return args;
	}

	public void setArgs(RequestArgs args) {
		this.args = args;
	}

}
