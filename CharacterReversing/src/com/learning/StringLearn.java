package com.learning;

public class StringLearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Test";
		String str = new String("text");
		String s2="test";
		String s3 = "Test";
		String s4="test";
		String s5="et";
		String s6=" te st text ";
		String s7=" ";
		StringBuffer sb = new StringBuffer();
		sb.append("hi");
		sb.append("----");
		sb.append("hello");
		sb.append("hi");
		System.out.println(s1.compareTo(s2));
		
		System.out.println("toUpperCase===>"+s1.toUpperCase());
		System.out.println("codePointCount ----> "+s1.codePointCount(1, 3));
		System.out.println(s1.charAt(2));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.codePointCount(0, 2));
		
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s1.concat("---"+s4));
		System.out.println(s1.contains(s5));
		System.out.println(s1.contentEquals(s3));
		System.out.println(s1.contentEquals(sb));
		System.out.println(s1.endsWith("t"));
		System.out.println("equals method===>"+s1.equals(s2));
		System.out.println("equalsIgnoreCase method===>"+s1.equalsIgnoreCase(s2));
		//System.out.println(s1.formatted(args));
		System.out.println(s1.hashCode());
		System.out.println(s1.indent(5));
		System.out.println(s1.indexOf(0)); 
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.indexOf("t", 2));
		System.out.println(s6.intern());
		System.out.println(s7.isBlank());
		System.out.println(s7.isEmpty());
		System.out.println(s5.lastIndexOf(0));
		System.out.println(s1.lastIndexOf("s", 2));
		System.out.println(s1.length());
		System.out.println(s7.matches(" "));
		System.out.println(str);
		//System.out.println(sb.offsetByCodePoints(0,11));
		//System.out.println(s1.regionMatches(0, s7, 0, 0));
		System.out.println(s1.repeat(4));
		System.out.println(s1.replace('t', 'T'));
		System.out.println(s6.strip());
		System.out.println(s6.stripIndent());
		System.out.println(s1.substring(2));
		System.out.println(s1.toCharArray());
		//System.out.println(s1.toLowerCase(null));
		System.out.println(s6.trim());
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("appleapple");
		sbuilder.charAt(0);
		//System.out.println(sbuilder.reverse());
		System.out.println(sbuilder.delete(5, 7));
		System.out.println(sbuilder);
		
	}

}
