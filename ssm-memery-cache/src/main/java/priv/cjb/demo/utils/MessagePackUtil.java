package priv.cjb.demo.utils;

import java.io.IOException;

import org.msgpack.MessagePack;
import org.msgpack.template.Template;
import org.msgpack.type.Value;

public class MessagePackUtil {

	private final static MessagePack messagePack = new MessagePack();

	public static void register(Class<?> type) {
		messagePack.register(type);
	};

	public static byte[] serialize(Object obj) throws IOException {
		register(obj.getClass());
		return messagePack.write(obj);
	}

	public static Value deserialize(byte[] b) throws IOException {
		return messagePack.read(b);
	}

	public static Object deserialize(byte[] b, Class<?> type) throws IOException {
		return messagePack.read(b, type);
	}
	
	public static Template<?> lookup(Class<?> c) {
		return messagePack.lookup(c);
	}
}
