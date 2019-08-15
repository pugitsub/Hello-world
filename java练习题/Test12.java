package per.yangyu.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *@author yangyu
 *@data 2019年8月14日下午7:05:30
 */
public class Test12 {
	public static void main(String[] args) {
//		SplitTest();//分隔符
//		packageDemo();//包装类
//		parseTest();//字符串转成基本数据类型
//		patternTest();//正则表达式和捕获组
//		MathTest();//数学类
//		bigDecimalTest();//大十进制,用于大量数据的存储和运算
//		decimalFormatTest();十进制格式类
		numMulPractice();//大量数据相乘练习
	}
	public static void splitTest() {
		String str="asder34jihhk232";
		String[] str2=str.split("\\d");
		for(String string:str2) {
			System.out.println(string);
		}
	}
	public static void packageDemo() {
		int i=10;
		Integer in=new Integer(i);
		Integer in1=20;
		System.out.println(in1);
		System.out.println(in);
		System.out.println("------------------------");
		Integer in2=98;
		Integer in3=98;
		System.out.println(in2==in3);//true
		Integer in4=200;
		Integer in5=200;
		System.out.println(in4==in5);//false
		System.out.println("--------------------------");
		int i1=in;
		int i2=in1.intValue();
		System.out.println(i1+" "+i2);
		System.out.println("---------------------------");
		System.out.println(in==i1);//true
		System.out.println("-------------------------");
		Integer in6=new Integer("01234");
		System.out.println(in6);
		Double d=new Double("0.0123");
		System.out.println(d);
		
	}
	public static void parseTest() {
		String str="1234567";
		int i=Integer.parseInt(str);
		System.out.println(i);
		String str1="0.000123";
		double d=Double.parseDouble(str1);
		System.out.println(d);
		System.out.println("-------------");
		Integer integer=1000;
		System.out.println(integer.hashCode());
		System.out.println("-----------------");
		System.out.println(0.0/0);//NaN不是数字
		System.out.println(1.0/0);//无穷大
	}
	public static void patternTest() {
		String str="wedr34sder765";
		String str1=str.replaceAll("\\D", "");
        char[] c=str1.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        System.out.println("----------------");
        String str2="上    下    左    右";
        System.out.println(str2.replaceAll("(上) (.*) (左)(.*)", "$1$3$2$4"));
        String str3="LLLLLLLLLLLOOOOOOVVVVVVEEEE";
        System.out.println(str3.replaceAll("(.)\\1+", "$1"));
	}
	public static void MathTest() {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-123));
		System.out.println(Math.cbrt(27.0));
		System.out.println(Math.ceil(3.2));//向上取整  floor：向下取整
		System.out.println(Math.random());
		System.out.println(Math.round(3.5));//四舍五入
	}
	public static void bigDecimalTest() {
		Double d1=3.0;
		double d2=2.99;
		System.out.println(d1-d2);
		//大十进制
		BigDecimal bd=new BigDecimal("3.0");
		BigDecimal bd1=new BigDecimal("2.99");
		System.out.println(bd.subtract(bd1));
		
	}
	public static void decimalFormatTest() {
		double d1=2.01;
		double d2=0.89;
		System.out.println(d1*d2);
		DecimalFormat df=new DecimalFormat("#0.00");
		DecimalFormat df1=new DecimalFormat("00.00");
		System.out.println(df1.format(d1*d2));
		System.out.println(df.format(d1*d2));
		Long l=43211234567890l;
		DecimalFormat df2=new DecimalFormat("0.00E0");//科学计算法
		System.out.println(df2.format(l));
	}
	public static void numMulPractice() {
		int[] arr= {1,2,3,4};
		int[] arr1= {1,2,3,4};
		int[] result=new int[8];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length ;j++) {
				result[i+j]+=arr[i]*arr1[j];
			}
		}
		for(int i=0;i<result.length-1;i++) {
			int temp=result[i]/10;
			result[i]=result[i]%10;
			result[i+1]+=temp;
		}
		System.out.println(Arrays.toString(result));
	}
}
