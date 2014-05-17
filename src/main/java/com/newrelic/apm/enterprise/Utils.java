package com.newrelic.apm.enterprise;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.Charset;
import java.util.UUID;

public class Utils {
    private static final Charset UTF8 = Charset.forName("UTF-8");

    public String encodeBase64(String s) {
        byte[] bytes = Base64.encodeBase64(s.getBytes());
        return new String(bytes, UTF8);
    }

    public String decodeBase64(String s) {
        byte[] bytes = Base64.decodeBase64(s);
        return new String(bytes, UTF8);
    }

    public String md5(String s) {
        return new String(DigestUtils.md5(s), UTF8);
    }

    public String uuid() {
        return UUID.randomUUID().toString();
    }

    public String sha1(String s) {
        return new String(DigestUtils.sha1(s), UTF8);
    }

    public String sha256(String s) {
        return new String(DigestUtils.sha256(s), UTF8);
    }
}
