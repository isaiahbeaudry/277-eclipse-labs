import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author isaiahbeaudry
 *
 */
public class StringMagic {

	private String string;
	
	public StringMagic(String string) {
		this.string = string;
	}

	public int countV(String str) {
		return 23;
	}

	/**
	 * @return
	 * @see java.lang.String#length()
	 */
	public int length() {
		return string.length();
	}

	/**
	 * @return
	 * @see java.lang.String#isEmpty()
	 */
	public boolean isEmpty() {
		return string.isEmpty();
	}

	/**
	 * @param index
	 * @return
	 * @see java.lang.String#charAt(int)
	 */
	public char charAt(int index) {
		return string.charAt(index);
	}

	/**
	 * @param index
	 * @return
	 * @see java.lang.String#codePointAt(int)
	 */
	public int codePointAt(int index) {
		return string.codePointAt(index);
	}

	/**
	 * @param index
	 * @return
	 * @see java.lang.String#codePointBefore(int)
	 */
	public int codePointBefore(int index) {
		return string.codePointBefore(index);
	}

	/**
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 * @see java.lang.String#codePointCount(int, int)
	 */
	public int codePointCount(int beginIndex, int endIndex) {
		return string.codePointCount(beginIndex, endIndex);
	}

	/**
	 * @param index
	 * @param codePointOffset
	 * @return
	 * @see java.lang.String#offsetByCodePoints(int, int)
	 */
	public int offsetByCodePoints(int index, int codePointOffset) {
		return string.offsetByCodePoints(index, codePointOffset);
	}

	/**
	 * @param srcBegin
	 * @param srcEnd
	 * @param dst
	 * @param dstBegin
	 * @see java.lang.String#getChars(int, int, char[], int)
	 */
	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		string.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	/**
	 * @param srcBegin
	 * @param srcEnd
	 * @param dst
	 * @param dstBegin
	 * @deprecated
	 * @see java.lang.String#getBytes(int, int, byte[], int)
	 */
	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		string.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	/**
	 * @param charsetName
	 * @return
	 * @throws UnsupportedEncodingException
	 * @see java.lang.String#getBytes(java.lang.String)
	 */
	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
		return string.getBytes(charsetName);
	}

	/**
	 * @param charset
	 * @return
	 * @see java.lang.String#getBytes(java.nio.charset.Charset)
	 */
	public byte[] getBytes(Charset charset) {
		return string.getBytes(charset);
	}

	/**
	 * @return
	 * @see java.lang.String#getBytes()
	 */
	public byte[] getBytes() {
		return string.getBytes();
	}

	/**
	 * @param anObject
	 * @return
	 * @see java.lang.String#equals(java.lang.Object)
	 */
	public boolean equals(Object anObject) {
		return string.equals(anObject);
	}

	/**
	 * @param sb
	 * @return
	 * @see java.lang.String#contentEquals(java.lang.StringBuffer)
	 */
	public boolean contentEquals(StringBuffer sb) {
		return string.contentEquals(sb);
	}

	/**
	 * @param cs
	 * @return
	 * @see java.lang.String#contentEquals(java.lang.CharSequence)
	 */
	public boolean contentEquals(CharSequence cs) {
		return string.contentEquals(cs);
	}

	/**
	 * @param anotherString
	 * @return
	 * @see java.lang.String#equalsIgnoreCase(java.lang.String)
	 */
	public boolean equalsIgnoreCase(String anotherString) {
		return string.equalsIgnoreCase(anotherString);
	}

	/**
	 * @param anotherString
	 * @return
	 * @see java.lang.String#compareTo(java.lang.String)
	 */
	public int compareTo(String anotherString) {
		return string.compareTo(anotherString);
	}

	/**
	 * @param str
	 * @return
	 * @see java.lang.String#compareToIgnoreCase(java.lang.String)
	 */
	public int compareToIgnoreCase(String str) {
		return string.compareToIgnoreCase(str);
	}

	/**
	 * @param toffset
	 * @param other
	 * @param ooffset
	 * @param len
	 * @return
	 * @see java.lang.String#regionMatches(int, java.lang.String, int, int)
	 */
	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return string.regionMatches(toffset, other, ooffset, len);
	}

	/**
	 * @param ignoreCase
	 * @param toffset
	 * @param other
	 * @param ooffset
	 * @param len
	 * @return
	 * @see java.lang.String#regionMatches(boolean, int, java.lang.String, int, int)
	 */
	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return string.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	/**
	 * @param prefix
	 * @param toffset
	 * @return
	 * @see java.lang.String#startsWith(java.lang.String, int)
	 */
	public boolean startsWith(String prefix, int toffset) {
		return string.startsWith(prefix, toffset);
	}

	/**
	 * @param prefix
	 * @return
	 * @see java.lang.String#startsWith(java.lang.String)
	 */
	public boolean startsWith(String prefix) {
		return string.startsWith(prefix);
	}

	/**
	 * @param suffix
	 * @return
	 * @see java.lang.String#endsWith(java.lang.String)
	 */
	public boolean endsWith(String suffix) {
		return string.endsWith(suffix);
	}

	/**
	 * @return
	 * @see java.lang.String#hashCode()
	 */
	public int hashCode() {
		return string.hashCode();
	}

	/**
	 * @param ch
	 * @return
	 * @see java.lang.String#indexOf(int)
	 */
	public int indexOf(int ch) {
		return string.indexOf(ch);
	}

	/**
	 * @param ch
	 * @param fromIndex
	 * @return
	 * @see java.lang.String#indexOf(int, int)
	 */
	public int indexOf(int ch, int fromIndex) {
		return string.indexOf(ch, fromIndex);
	}

	/**
	 * @param ch
	 * @return
	 * @see java.lang.String#lastIndexOf(int)
	 */
	public int lastIndexOf(int ch) {
		return string.lastIndexOf(ch);
	}

	/**
	 * @param ch
	 * @param fromIndex
	 * @return
	 * @see java.lang.String#lastIndexOf(int, int)
	 */
	public int lastIndexOf(int ch, int fromIndex) {
		return string.lastIndexOf(ch, fromIndex);
	}

	/**
	 * @param str
	 * @return
	 * @see java.lang.String#indexOf(java.lang.String)
	 */
	public int indexOf(String str) {
		return string.indexOf(str);
	}

	/**
	 * @param str
	 * @param fromIndex
	 * @return
	 * @see java.lang.String#indexOf(java.lang.String, int)
	 */
	public int indexOf(String str, int fromIndex) {
		return string.indexOf(str, fromIndex);
	}

	/**
	 * @param str
	 * @return
	 * @see java.lang.String#lastIndexOf(java.lang.String)
	 */
	public int lastIndexOf(String str) {
		return string.lastIndexOf(str);
	}

	/**
	 * @param str
	 * @param fromIndex
	 * @return
	 * @see java.lang.String#lastIndexOf(java.lang.String, int)
	 */
	public int lastIndexOf(String str, int fromIndex) {
		return string.lastIndexOf(str, fromIndex);
	}

	/**
	 * @param beginIndex
	 * @return
	 * @see java.lang.String#substring(int)
	 */
	public String substring(int beginIndex) {
		return string.substring(beginIndex);
	}

	/**
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 * @see java.lang.String#substring(int, int)
	 */
	public String substring(int beginIndex, int endIndex) {
		return string.substring(beginIndex, endIndex);
	}

	/**
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 * @see java.lang.String#subSequence(int, int)
	 */
	public CharSequence subSequence(int beginIndex, int endIndex) {
		return string.subSequence(beginIndex, endIndex);
	}

	/**
	 * @param str
	 * @return
	 * @see java.lang.String#concat(java.lang.String)
	 */
	public String concat(String str) {
		return string.concat(str);
	}

	/**
	 * @param oldChar
	 * @param newChar
	 * @return
	 * @see java.lang.String#replace(char, char)
	 */
	public String replace(char oldChar, char newChar) {
		return string.replace(oldChar, newChar);
	}

	/**
	 * @param regex
	 * @return
	 * @see java.lang.String#matches(java.lang.String)
	 */
	public boolean matches(String regex) {
		return string.matches(regex);
	}

	/**
	 * @param s
	 * @return
	 * @see java.lang.String#contains(java.lang.CharSequence)
	 */
	public boolean contains(CharSequence s) {
		return string.contains(s);
	}

	/**
	 * @param regex
	 * @param replacement
	 * @return
	 * @see java.lang.String#replaceFirst(java.lang.String, java.lang.String)
	 */
	public String replaceFirst(String regex, String replacement) {
		return string.replaceFirst(regex, replacement);
	}

	/**
	 * @param regex
	 * @param replacement
	 * @return
	 * @see java.lang.String#replaceAll(java.lang.String, java.lang.String)
	 */
	public String replaceAll(String regex, String replacement) {
		return string.replaceAll(regex, replacement);
	}

	/**
	 * @param target
	 * @param replacement
	 * @return
	 * @see java.lang.String#replace(java.lang.CharSequence, java.lang.CharSequence)
	 */
	public String replace(CharSequence target, CharSequence replacement) {
		return string.replace(target, replacement);
	}

	/**
	 * @param regex
	 * @param limit
	 * @return
	 * @see java.lang.String#split(java.lang.String, int)
	 */
	public String[] split(String regex, int limit) {
		return string.split(regex, limit);
	}

	/**
	 * @param regex
	 * @return
	 * @see java.lang.String#split(java.lang.String)
	 */
	public String[] split(String regex) {
		return string.split(regex);
	}

	/**
	 * @param locale
	 * @return
	 * @see java.lang.String#toLowerCase(java.util.Locale)
	 */
	public String toLowerCase(Locale locale) {
		return string.toLowerCase(locale);
	}

	/**
	 * @return
	 * @see java.lang.String#toLowerCase()
	 */
	public String toLowerCase() {
		return string.toLowerCase();
	}

	/**
	 * @param locale
	 * @return
	 * @see java.lang.String#toUpperCase(java.util.Locale)
	 */
	public String toUpperCase(Locale locale) {
		return string.toUpperCase(locale);
	}

	/**
	 * @return
	 * @see java.lang.String#toUpperCase()
	 */
	public String toUpperCase() {
		return string.toUpperCase();
	}

	/**
	 * @return
	 * @see java.lang.String#trim()
	 */
	public String trim() {
		return string.trim();
	}

	/**
	 * @return
	 * @see java.lang.String#strip()
	 */
	public String strip() {
		return string.strip();
	}

	/**
	 * @return
	 * @see java.lang.String#stripLeading()
	 */
	public String stripLeading() {
		return string.stripLeading();
	}

	/**
	 * @return
	 * @see java.lang.String#stripTrailing()
	 */
	public String stripTrailing() {
		return string.stripTrailing();
	}

	/**
	 * @return
	 * @see java.lang.String#isBlank()
	 */
	public boolean isBlank() {
		return string.isBlank();
	}

	/**
	 * @return
	 * @see java.lang.String#lines()
	 */
	public Stream<String> lines() {
		return string.lines();
	}

	/**
	 * @param n
	 * @return
	 * @see java.lang.String#indent(int)
	 */
	public String indent(int n) {
		return string.indent(n);
	}

	/**
	 * @return
	 * @see java.lang.String#stripIndent()
	 */
	public String stripIndent() {
		return string.stripIndent();
	}

	/**
	 * @return
	 * @see java.lang.String#translateEscapes()
	 */
	public String translateEscapes() {
		return string.translateEscapes();
	}

	/**
	 * @param <R>
	 * @param f
	 * @return
	 * @see java.lang.String#transform(java.util.function.Function)
	 */
	public <R> R transform(Function<? super String, ? extends R> f) {
		return string.transform(f);
	}

	/**
	 * @return
	 * @see java.lang.String#toString()
	 */
	public String toString() {
		return string.toString();
	}

	/**
	 * @return
	 * @see java.lang.String#chars()
	 */
	public IntStream chars() {
		return string.chars();
	}

	/**
	 * @return
	 * @see java.lang.String#codePoints()
	 */
	public IntStream codePoints() {
		return string.codePoints();
	}

	/**
	 * @return
	 * @see java.lang.String#toCharArray()
	 */
	public char[] toCharArray() {
		return string.toCharArray();
	}

	/**
	 * @param args
	 * @return
	 * @see java.lang.String#formatted(java.lang.Object[])
	 */
	public String formatted(Object... args) {
		return string.formatted(args);
	}

	/**
	 * @return
	 * @see java.lang.String#intern()
	 */
	public String intern() {
		return string.intern();
	}

	/**
	 * @param count
	 * @return
	 * @see java.lang.String#repeat(int)
	 */
	public String repeat(int count) {
		return string.repeat(count);
	}

	/**
	 * @return
	 * @see java.lang.String#describeConstable()
	 */
	public Optional<String> describeConstable() {
		return string.describeConstable();
	}

	/**
	 * @param lookup
	 * @return
	 * @see java.lang.String#resolveConstantDesc(java.lang.invoke.MethodHandles.Lookup)
	 */
	public String resolveConstantDesc(Lookup lookup) {
		return string.resolveConstantDesc(lookup);
	}
	
}
