package kafka;

import java.util.Properties;

public class TestKafkaConsumer {

	public static void main(String[] args) {
		//String log4jConfPath = "log4j.properties";
		BasicConfigurator.configure();
		
		Properties props = new Properties();
		props.put("bootstrap.servers", "local:9092");
		props.put("group.id", "test-group");
		props.put("enable.auto.commit","true");
		
		props.put("key.deserializer", props)

	}

}
