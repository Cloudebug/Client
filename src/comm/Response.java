package comm;

import com.fasterxml.jackson.databind.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Response {
	final static long PROCESSES = 1;// 虚拟机进程基本信息
	final static long MODULES = 2;// 虚拟机模块信息
	final static long PROCESSDETAILS = 4;// 指定进程详细信息

	public void main() {
		try {
			ObjectMapper mapper = new ObjectMapper();

			JsonNode rootNode = mapper.readTree(new File("4.json"));
			if (!rootNode.path("cmd").isNumber()) {
				// 异常处理？
			}

			int cmd = rootNode.path("cmd").intValue();
			// 处理json数据节点
			if ((PROCESSES & cmd) != 0) {
				JsonNode pNode = rootNode.path("data").path("Processes");
				if (pNode.isMissingNode())
					throw new IllegalArgumentException("json包解析错误!");//
				else
					doProcesses(pNode);

			}
			if ((MODULES & cmd) != 0) {
				JsonNode mNode = rootNode.path("data").path("Modules");
				if (mNode.isMissingNode())
					throw new IllegalArgumentException("json包解析错误!");//
				else
					System.out.println(mNode);
				doModules(mNode);
			}
			if ((PROCESSDETAILS & cmd) != 0) {
				JsonNode pdNode = rootNode.path("data").path("ProcessDetails");
				if (pdNode.isMissingNode())
					throw new IllegalArgumentException("json包解析错误!");//
				else
					System.out.println(pdNode);
				doPDetails(pdNode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	// 处理Processes节点
	public void doProcesses(JsonNode pNode) {
		System.out.println(pNode);
	}

	// 处理Modules节点
	public void doModules(JsonNode mNode) {

	}

	// 处理ProcessDetails节点
	public void doPDetails(JsonNode pdNode) {

	}
}
