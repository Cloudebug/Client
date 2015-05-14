package test;

import comm.Bean.*;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;
import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		RequestArgs args1 = new RequestArgs();
		Request request = new Request();
		args1.setPid(1024);
		args1.setUuid("54BF6567-1007-11D1-B0AA-444553540000");

		request.setArgs(args1);
		request.setCmd(1);

		ObjectMapper mapper = new ObjectMapper();
		try {
			// 类转JSON
			System.out.println("json转bean>>>");
			String json = mapper.writeValueAsString(request);

			System.out.println(json);
			System.out.println("转bean>>>");
			String json_ = "{\"cmd\":1,\"args\":{\"uuid\":\"54BF6567-1007-11D1-B0AA-444553540000\",\"pid\":1024}}";

			ObjectMapper mapper_ = new ObjectMapper();
			Request re = mapper_.readValue(json_, Request.class);
			System.out.println(re);
			//取字段
			JsonNode node = mapper.readTree(json_);
			System.out.println("取字段>>>");
			System.out.println(node.get("args").toString());
			//取字段转bean
			JsonNode rootnode = mapper.readTree(json_);
			System.out.println("取字段到bean>>>");
			JsonNode argsnode = rootnode.path("args");
			RequestArgs args_=mapper.treeToValue(argsnode, RequestArgs.class);
			System.out.println(args_);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
