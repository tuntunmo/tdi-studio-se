package org.talend.common;

import java.math.BigInteger;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Signature {

	/**
	 * @param data
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String hmac_sha1(String data, String key) throws Exception {
		Mac mac = Mac.getInstance("HmacSHA1");
		SecretKeySpec secret = new SecretKeySpec(key.getBytes(), "HmacSHA1");
		mac.init(secret);
		byte[] digest = mac.doFinal(data.getBytes());

		BigInteger hash = new BigInteger(1, digest);
		String enc = hash.toString(16);
		if ((enc.length() % 2) != 0) {
			enc = "0" + enc;
		}
		return enc;
	}
}