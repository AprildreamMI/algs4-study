public class lianxi_1_1_3 {

	public static void main(String[] args) {
		boolean isDengyu = false;
		// System.out.print(args.toString());
		for (int i = 0; i < args.length; i++ ) {
			if (i + 1 < args.length) {
				if (args[i].equals(args[i + 1])) {
					isDengyu = true;
				} else {
					isDengyu = false;
				}
			}
		}

		if (isDengyu) {
			System.out.print("equal");
		} else {
			System.out.print("not equal");
		}
	}
}