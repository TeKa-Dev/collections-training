package practic;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    byte[] bytes;

    public AsciiCharSequence(byte[] b) {
        this.bytes = b;
    }

    public int length() {
        return bytes.length;
    }

    public char charAt(int index) {
        return (char) bytes[index];
    }

    public CharSequence subSequence(int start, int end) {
        byte[] b = new byte[end - start];
        for (int i = 0, j = start; i < b.length; i++, j++) {
            b[i] = bytes[j];
        }
        return new AsciiCharSequence(b);
    }

    public String toString() {
        return new String(bytes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsciiCharSequence that = (AsciiCharSequence) o;
        return Arrays.equals(bytes, that.bytes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes);
    }
}

