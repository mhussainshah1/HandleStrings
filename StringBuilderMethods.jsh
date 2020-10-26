StringBuilder sb1 = new StringBuilder();//length=0, Capacity = 16
StringBuilder sb2 = new StringBuilder("animal");//length=7, Capacity = 23
StringBuilder sb3 = new StringBuilder(10);//length=0, Capacity = 10
String alpha = "";
for (char c ='a'; c<='z'; c++){
    alpha += c;
}
alpha
StringBuilder bravo = new StringBuilder();
for (char c ='a'; c<='z'; c++){
    bravo.append(c);
}
bravo
String st = new String("Start");
st.concat("+middle")
String sam = st.concat("+end");
StringBuilder sb = new StringBuilder("Start");
sb.append("+middle")
StringBuilder same = sb.append("+end");
StringBuilder a = new StringBuilder("abc");
StringBuilder b = a.append("de");
b=b.append("f").append("g")
a
b
StringBuilder sb4 = new StringBuilder("animals");
sb4.insert(7,"-")
sb4.insert(0,"-")
sb4.insert(4,"-")
StringBuilder sb5 = new StringBuilder("abcdef");
sb5.delete(1,3)
sb5.deleteCharAt(5)
sb5.deleteCharAt(3)
sb5 = new StringBuilder("abcdef")
sb5.delete(1,100)
builder.replace(3,6,"sty")
builder = new StringBuilder("pigeon dirty")
builder.replace(3,100,"")
StringBuilder sb6 = new StringBuilder("ABC");
sb6.reverse()
String s = sb6.toString();