package collections.hashmap;

public class CustomMap {

	private static int defaultCapacity = 10;
	private static Object[] keys = new Object[defaultCapacity];
	private static Object[] values = new Object[defaultCapacity];
	private static int lastInsertedIndex = 0;

	public static void main(String[] args) {
		CustomMap asdf = new CustomMap();
	}

	public void put(Object key, Object value) {
		if (keys.length == defaultCapacity) {
			increaseKeysArr();
		}
		if (values.length == defaultCapacity) {
			increaseValuesArr();
		}
		keys[lastInsertedIndex] = key;
		values[lastInsertedIndex] = value;
	}

	private static void increaseKeysArr() {
		Object[] tempKeys = new Object[keys.length + defaultCapacity];
		for (int i = 0; i < keys.length; i++) {
			tempKeys[i] = keys[i];
		}
		keys = tempKeys;
		tempKeys = null;
	}

	private static void increaseValuesArr() {
		Object[] tempValues = new Object[values.length + defaultCapacity];
		for (int i = 0; i < values.length; i++) {
			tempValues[i] = values[i];
		}
		values = tempValues;
		tempValues = null;
	}
}
