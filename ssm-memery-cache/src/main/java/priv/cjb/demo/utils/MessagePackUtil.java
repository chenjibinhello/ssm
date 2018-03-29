package priv.cjb.demo.utils;

import java.io.IOException;

import org.msgpack.MessagePack;
import org.msgpack.type.Value;
import org.msgpack.unpacker.Converter;

public class MessagePackUtil {

	private static MessagePack messagePack;

	static {
		messagePack = new MessagePack();
	}

	public static void register(Class<?> type) {
		messagePack.register(type);
	};

	public static byte[] serialize(Object obj) throws IOException {
		messagePack.register(obj.getClass());
		byte[] b = messagePack.write(obj);
		return b;
	}

	@SuppressWarnings("resource")
	public static Object deserialize(byte[] b, Class<?> type) throws IOException {
		Value value = messagePack.read(b);
		return new Converter(messagePack,value).read(type);
	}
}
