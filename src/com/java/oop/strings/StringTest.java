package com.java.oop.strings;

public class StringTest {
    StringTest(){
        System.out.println("my String constructor");
    }

    static void main(String[] args) {
        //com.java.oop.strings.Strings
        StringTest str = new StringTest();
        Product product = new Product();
        System.out.println(product);
        System.out.println(str);

        String str1 = new String();
        System.out.println("str1 :" +str1);
        char[] chars = {'a', 'b', 'c'};
        String str2 = new String(chars);
        System.out.println("str2 :" +str2);
        String str3 = new String("abc");
        System.out.println("str3 :" +str3);
        String str4 = str2;
        System.out.println("str4 :" +str4);
        System.out.println(str2 == str4);
        System.out.println(str2 == str3);
        String str5 = "abc"; // string literal
        String str6 = "abc";
        System.out.println(str5 == str6);

        //string objects are immutable
        System.out.println(chars.length);
        System.out.println(str5.length());
        System.out.println(str6.charAt(1));
        System.out.println(str5.compareToIgnoreCase("aBc"));

        String name = "John";
        name = name.concat(", how are you?");
        System.out.println(name);
        String username = "vinay";
        String password = "abcd@1234";
        System.out.println("login failed! invalid credentials ");

        String usernamePattern = "^[a-zA-Z0-9_]{4,15}$";
        System.out.println(username.matches(usernamePattern));

        String customerData = "1,anil,anil@gmail.com,123-456-7890";

        String[] data = customerData.split(",");
        Customer1 customer1 = new Customer1();
        //String -> Primitives
        customer1.id = Integer.parseInt(data[0]);
        customer1.name = data[1];
        customer1.email = data[2];
        customer1.mobileNo = data[3];

        System.out.println("Customer Id : " + customer1.id);
        System.out.println("Customer Name : " + customer1.name);
        System.out.println("Customer Email : " + customer1.email);
        System.out.println("Customer Phone : " + customer1.mobileNo);

        String password1 = "  Abcd @123  ";
        System.out.println(password1.length());
        //chained method invocation
        System.out.println(password1.trim().length());
        int mobileNo = 324234;
        System.out.println( String.valueOf(mobileNo));

    }

}
